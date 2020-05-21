package com.cul.culsite.TestMapper;

import java.beans.IntrospectionException;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { App.class })
public class TestMapper {
	@Test
    public void testCeshi()
            throws IllegalAccessException, IntrospectionException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IOException, ClassNotFoundException {
        //读取Mybatis配置
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        //生成SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        resourceAsReader.close();
        AutoTestMapper autoTestMapper = new AutoTestMapper("D:\\slpworkspace\\github\\2020\\project\\TestMapper\\src\\main\\java\\com\\cul\\culsite\\ms\\dao");
        //执行测试方法
        autoTestMapper.openSqlSession(sqlSessionFactory);
    }
	
	public static void main(String[] args) {
		/*
		 * File file = new File(
		 * "D:/devtool/workspace/zixin/project/TestMapper/src/main/java/com/cul/culsite/dao/"
		 * ); File[] tempList = file.listFiles(); System.out.println(tempList.length);
		 * for(int i=0;i<tempList.length;i++) {
		 * System.out.println(tempList[i].getName()); }
		 */
		try {
			Class s = Class.forName("com.cul.culsite.dao.EsOrderDTOMapper");
			System.out.println(s.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("失败");
			e.printStackTrace();
		}
	}

}
