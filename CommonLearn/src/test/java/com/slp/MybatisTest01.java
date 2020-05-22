package com.slp;

import com.slp.mybatis.MIssuerParaDTO;
import com.slp.mybatis.MIssuerParaDTOMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisTest01
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/21 8:37
 * @Version 1.0
 **/
public class MybatisTest01 {

    @Test
    public void test01() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //1、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3、获取mapper
        MIssuerParaDTOMapper mIssuerParaDTOMapper = sqlSession.getMapper(MIssuerParaDTOMapper.class);
        //4、执行数据库操作，并处理结果集
        MIssuerParaDTO dto = new MIssuerParaDTO();
        dto.setIssuerId("C000");
        dto.setCardBgList("11");
        int i = mIssuerParaDTOMapper.updateByPrimaryKeySelective(dto);
        System.out.println(i);
    }


}
