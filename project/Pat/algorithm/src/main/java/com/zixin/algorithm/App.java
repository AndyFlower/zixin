package com.zixin.algorithm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		List<Map<String, String>> exportData = new ArrayList<Map<String, String>>();  
	    Map<String, String> row1 = new LinkedHashMap<String, String>();  
	    row1.put("1", "\'11342432432432423");  
	    row1.put("2", "124324324324234324324\t");  
	    row1.put("3", "13432432432423423\t");  
	    row1.put("4", "434234234324324232422\t");  
	    exportData.add(row1);  
	    row1 = new LinkedHashMap<String, String>();  
	    row1.put("1", "21");  
	    row1.put("2", "22");  
	    row1.put("3", "23");  
	    row1.put("4", "24");  
	    exportData.add(row1);  
	    LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();  

	    //设置列名
	    map.put("1", "第一列名称");  
	    map.put("2", "第二列名称");  
	    map.put("3", "第三列名称");  
	    map.put("4", "第四列名称");  
	    //这个文件上传到路径，可以配置在数据库从数据库读取，这样方便一些！
	    String path = "D:/";  

	   //文件名=生产的文件名称+时间戳
	    String fileName = "文件导出";  
	    File file = createCSVFile(exportData, map, path, fileName);  
	    String fileName2 = file.getName();  
	    System.out.println("文件名称：" + fileName2);  
	}

	public static File createCSVFile(List exportData, LinkedHashMap<String, String> map, String outPutPath, String fileName) {
		File csvFile = null;
		BufferedWriter csvFileOutputStream = null;
		try {
			File file = new File(outPutPath);
			if (!file.exists()) {
				file.mkdirs();
			}
//定义文件名格式并创建  
			csvFile = new File(outPutPath + fileName + ".csv");
			file.createNewFile();
// UTF-8使正确读取分隔符","  
//如果生产文件乱码，windows下用gbk，linux用UTF-8
			csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile), "UTF-8"),
					1024);

//写入前段字节流，防止乱码
			csvFileOutputStream.write(getBOM());
// 写入文件头部
			for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator.hasNext();) {
				java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
				csvFileOutputStream
						.write((String) propertyEntry.getValue() != null ? (String) propertyEntry.getValue() : "");
				if (propertyIterator.hasNext()) {
					csvFileOutputStream.write(",");
				}
			}
			csvFileOutputStream.newLine();
// 写入文件内容  
			for (Iterator iterator = exportData.iterator(); iterator.hasNext();) {
				Object row = (Object) iterator.next();
				for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator.hasNext();) {
					java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
					String str = row != null ? ((String) ((Map) row).get(propertyEntry.getKey())) : "";

					if ("" == str) {
						str = "";
					} else {
						str = str.replaceAll("\"", "\"\"");
						if (str.indexOf(",") >= 0) {
							str = "\"" + str + "\"";
						}
					}
					csvFileOutputStream.write(str);
					if (propertyIterator.hasNext()) {
						csvFileOutputStream.write(",");
					}
				}
				if (iterator.hasNext()) {
					csvFileOutputStream.newLine();
				}
			}
			csvFileOutputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				csvFileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return csvFile;
	}

	public static String getBOM() {

		byte b[] = { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };
		return new String(b);
	}
}
