package com.cul.culsite.TestMapper;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class AutoTestMapper {
	 private static final Map<String, Class<?>> primitiveClazz; // 基本类型的class
	    private static String PACK_PATH = "";
	    private static List<String> FILE_NAME = new ArrayList<String>();
	    private static final String SUCCESS_FLG = "success";
	    private static final String FAIL_FLG = "fail";
	    private static final String PATH_PATTERN = "import [a-z,A-Z,/.]+;";
	    private static final String PACK_PATTERN = "package [a-z,A-Z,/.]+;";
	    private static final String IMPORT_REGEX = "import ";
	    private static final String PACK_REGEX = "package ";

	    private Configuration configuration;
	    private static List<Class> TYPE_ARRAY = new ArrayList<Class>();
	   
	    /*Stream
	            .of(String.class, Integer.class, Byte.class, Short.class, Long.class, Float.class, Double.class,
	                    Boolean.class, byte.class, short.class, int.class, long.class, char.class, float.class,
	                    double.class, boolean.class).collect(Collectors.toList());*/
	    private static final String INTEGER = "int";
	    private static final String BYTE = "byte";
	    private static final String SHORT = "short";
	    private static final String LONG = "long";
	    private static final String FLOAT = "float";
	    private static final String DOUBLE = "double";
	    private static final String BOOLEAN = "boolean";

	    static {
	        primitiveClazz = new HashMap<String, Class<?>>();
	        primitiveClazz.put(INTEGER, Integer.class);
	        primitiveClazz.put(BYTE, Byte.class);
	        primitiveClazz.put(SHORT, Short.class);
	        primitiveClazz.put(LONG, Long.class);
	        primitiveClazz.put(FLOAT, Float.class);
	        primitiveClazz.put(DOUBLE, Double.class);
	        primitiveClazz.put(BOOLEAN, Boolean.class);
	        TYPE_ARRAY.add(String.class);
	        TYPE_ARRAY.add(Integer.class);
	        TYPE_ARRAY.add(Byte.class);
	        TYPE_ARRAY.add(Short.class);
	        TYPE_ARRAY.add(Long.class);
	        TYPE_ARRAY.add(Float.class);
	        
	        TYPE_ARRAY.add(Double.class);
	        TYPE_ARRAY.add(Boolean.class);
	        TYPE_ARRAY.add(byte.class);
	        TYPE_ARRAY.add(short.class);
	        TYPE_ARRAY.add(int.class);
	        TYPE_ARRAY.add(long.class);
	        
	        TYPE_ARRAY.add(char.class);
	        TYPE_ARRAY.add(float.class);
	        TYPE_ARRAY.add(double.class );
	        TYPE_ARRAY.add(boolean.class);
	    }

	    public AutoTestMapper(String path) throws IOException, ClassNotFoundException {
	        String mapperContent = getFileContent(path);
	        String[] pathArr = matchMethod(PATH_PATTERN, mapperContent).split(";");
	        for (int i = 0; i < pathArr.length; i++) {
	        	
	            pathArr[i] = pathArr[i].replaceAll(IMPORT_REGEX, "");
	            Class cls = Class.forName(pathArr[i]);
	            if (!cls.isInterface()) {
	                //把实体类放入类型集合中
	                TYPE_ARRAY.add(cls);
	            }
	        }
	        //获得全路径名的前缀
	        String[] packPathArr = matchMethod(PACK_PATTERN, mapperContent).split(";");
	        String packPath = packPathArr[0].replaceAll(PACK_REGEX, "").replaceAll(";", "");
	        this.PACK_PATH = packPath;
	    }

	    public List<Map<Class, Object>> openSqlSession(SqlSessionFactory sqlSessionFactory)
	            throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException,
	            InvocationTargetException, IntrospectionException {
	        this.configuration = sqlSessionFactory.getConfiguration();
	        List<Map<Class, Object>> list = (List<Map<Class, Object>>) new ArrayList<Map<Class, Object>>();
	        List<String> invokeSuccess = (List<String>) new ArrayList<String>();
	        List<String> invokeFail = (List<String>) new ArrayList<String>();
	        for (String fileName : FILE_NAME) {
	        	
	        	if(fileName.endsWith("xml")) {
	        		continue;
	        	}
		            Class cls = Class.forName(PACK_PATH + "." + fileName);
		            //添加Mapper
		            if (!sqlSessionFactory.getConfiguration().hasMapper(cls)) {
		                sqlSessionFactory.getConfiguration().addMapper(cls);
		            }
		            //获得Mapper
		            Object mapper = sqlSessionFactory.openSession().getMapper(cls);
		            //反射执行Mapper的方法
		            Map<String, List<String>> resultMap = autoTestInvoke(cls, mapper);
		            invokeSuccess.addAll(resultMap.get(SUCCESS_FLG));
		            invokeFail.addAll(resultMap.get(FAIL_FLG));
	        	
	        	
	        }
	        
	        for(int i=0;i<invokeSuccess.size();i++){
	        	System.out.println(invokeSuccess.get(i));
	        }
	        for(int i=0;i<invokeFail.size();i++){
	        	String s = invokeFail.get(i);
	        	if (s.contains("id bound statement")){

	            }else if (s.contains(" source is null for getProperty")){

	            }else if (s.contains("argument type mismatch")){

	            }else {
	                System.out.println(s);
	            }
	        }
	        return list;
	    }

	    private Map<String, List<String>> autoTestInvoke(Class c, Object o)
	            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException,
	            IntrospectionException {
	        Method[] declaredMethods = c.getDeclaredMethods();
	        String fileName = c.getName().substring(c.getName().lastIndexOf(".")).substring(1);
	        System.out.println(fileName);
	        List<String> invokeSuccess = (List<String>) new ArrayList<String>();
	        List<String> invokeFail = (List<String>) new ArrayList<String>();
	        Map<String, List<String>> resultMap = new HashMap<String, List<String>>();
	        //给参数赋初始值
	        for (Method method : declaredMethods) {
	            List<Object> list = new ArrayList<Object>();
	            for (Class cls : method.getParameterTypes()) {
	                Object par = assignmentPrimitive(cls, method, c);
	                list.add(par);
	            }
	            try {
	                method.invoke(o, list.toArray());
	                invokeSuccess.add("Success: " + fileName + "." + method.getName());
	            } catch (Exception e) {
	            	//e.printStackTrace();
	                if (e.getCause() != null) {
	                    String errorInf = e.getCause().getMessage();
	                    if (errorInf.contains("MySQLSyntaxErrorException")) {
	                        invokeFail.add("|Error: |" + fileName + "." + method.getName() + "| " + errorInf.substring(
	                                errorInf.lastIndexOf("MySQLSyntaxErrorException:") + "MySQLSyntaxErrorException:"
	                                        .length()).replaceAll("'", "`") + "|");
	                    } else {
	                        invokeFail.add("|Error: |" + fileName + "." + method.getName() + "| " + errorInf
	                                .substring(errorInf.lastIndexOf("Cause:") + "Cause:".length()).replaceAll("'", "`")
	                                + "|");
	                    }
	                } else {
	                    invokeFail.add("|Error: |" + fileName + "." + method.getName() + "| " + e);
	                }
	            }

	        }
	        resultMap.put(SUCCESS_FLG, invokeSuccess);
	        resultMap.put(FAIL_FLG, invokeFail);
	        return resultMap;
	    }

	    //为基础类型和包装类赋值
	    private Object assignmentPrimitive(Class cls, Method method, Class c)
	            throws IllegalAccessException, InvocationTargetException, InstantiationException, IntrospectionException {
	        Object par = new Object();
	        if (TYPE_ARRAY.contains(cls)) {
	            if (cls.equals(String.class)) {
	                par = ""+(char)(Math.random()*26+'a');
	            } else {
	                try {
	                    par = cls.newInstance();
	                    assignment(cls, par);
	                } catch (InstantiationException e) {
	                    if (cls.isPrimitive()) {
	                        cls = primitiveClazz.get(cls.getName());
	                    }
	                    try {
	                        par = cls.getDeclaredConstructor(String.class).newInstance("1");

	                    } catch (NoSuchMethodException e1) {
	                        System.out.println(cls.getName() + e);
	                    }
	                }
	            }
	        } else if ("java.util.Map".equals(cls.getName())) {
	            par = getMapData(c.getName() + "." + method.getName());
	        }else if ("java.util.List".equals(cls.getName())) {
	            par = getListData(c.getName() + "." + method.getName());
	        }
	        return par;
	    }

	    private Object getListData(String url) {
	    	List<String> resultList = new ArrayList<String>();
	    	List<String>  parameterList = new ArrayList<String>();
	        BoundSql sql = null;
	        parameterList.add("222");
	        //productNos
	        ;
	        try {
	            sql = configuration.getMappedStatement(url).getBoundSql(parameterList);
	        } catch (Exception exception) {
	            System.out.println(exception);
	        }
	        if (sql != null) {
	            List<ParameterMapping> parameterMappings = sql.getParameterMappings();
	            for(int i=0;i<parameterMappings.size();i++){
	            	String key = parameterMappings.get(i).getProperty();
	            	resultList.add("1");
	             
	            }
	            
	        }
	        return resultList;
		}

		//获得xml文件中的#{}中的key值
	    private Map<String, Object> getMapData(String url) {
	        Map<String, Object> resultMap = new HashMap<String, Object>();
	        Map<String, Object> parameterMap = new HashMap<String, Object>();
	        BoundSql sql = null;
	        parameterMap.put("tranSno", "111");
	        //productNos
	        parameterMap.put("categoryNos", new String[]{"222","333"});
	        parameterMap.put("productNos", new String[]{"222","333"});
	        parameterMap.put("cardNos", new String[]{"222","333"});
	        //couponCategoryIdList
	        parameterMap.put("couponCategoryIdList", new String[]{"222","333"});
	        try {
	            sql = configuration.getMappedStatement(url).getBoundSql(parameterMap);
	        } catch (Exception exception) {
	            System.out.println(exception);
	        }
	        if (sql != null) {
	            List<ParameterMapping> parameterMappings = sql.getParameterMappings();
	            for(int i=0;i<parameterMappings.size();i++){
	            	String key = parameterMappings.get(i).getProperty();
	            	if ("startRow".equals(key)) {
	                    resultMap.put(key, 1);
	                } else if ("endRow".equals(key)) {
	                    resultMap.put(key, 2);
	                } else {
	                    resultMap.put(key, "1");
	                }
	            }
	            
	        }
	        return resultMap;
	    }

	    //为对象赋值
	    private static void assignment(Class<?> beanClass, Object o)
	            throws IntrospectionException, InvocationTargetException, IllegalAccessException {
	        BeanInfo beanInfo = Introspector.getBeanInfo(beanClass);
	        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
	        for (PropertyDescriptor x : propertyDescriptors) {
	            Method method = x.getWriteMethod();
	            Method readMethhod = x.getReadMethod();
	            if (x.getPropertyType().equals(String.class)) {
	                if (method != null) {
	                    method.setAccessible(true);
	                    if ("uuid".equals(x.getName())) {
	                        method.invoke(o, UUID.randomUUID().toString().substring(0, 30));
	                    } else if("orderByClause".equals(x.getName())) {
	                    	
	                    } else {
	                        method.invoke(o, ""+(char)(Math.random()*26+'a'));
	                    }

	                }
	            } else if (x.getPropertyType().equals(BigDecimal.class)) {
	                if (method != null) {
	                    method.setAccessible(true);
	                    method.invoke(o, new BigDecimal(0));
	                }
	            } else if (x.getPropertyType().equals(Date.class)) {
	                if (method != null) {
	                    method.setAccessible(true);
	                    method.invoke(o, new Date());
	                }
	            }
	            readMethhod.invoke(o);
	        }
	    }

	    //获取文件内容
	    private String getFileContent(String path) throws IOException {
	        File file = new File(path);
	        File[] tempList = file.listFiles();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < tempList.length; i++) {
	            if (tempList[i].isDirectory()) {
	                String str2 = getFileContent(tempList[i].getPath());
	                stringBuilder.append(str2);
	            } else {
	                String fileName = tempList[i].getName();
	                this.FILE_NAME.add(fileName.replaceAll("\\.java", ""));
	                String str = readFile(path + "/" + fileName);
	                stringBuilder.append(str);
	            }
	        }
	        return stringBuilder.toString();
	    }

	    //读取文件
	    private String readFile(String fileName) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
	        String str;
	        StringBuilder stringBuilder = new StringBuilder();
	        while ((str = bufferedReader.readLine()) != null) {
	            stringBuilder.append(str + "\n");
	        }
	        bufferedReader.close();
	        return stringBuilder.toString();
	    }

	    //返回正则匹配的内容
	    private String matchMethod(String pattern, String matchString) {
	        Pattern r = Pattern.compile(pattern);
	        Matcher matcher = r.matcher(matchString);
	        StringBuffer stringBuffer = new StringBuffer();
	        while (matcher.find()) {
	            String string = matcher.group(0);
	            stringBuffer.append(string);
	        }
	        return stringBuffer.toString();
	    }
}

