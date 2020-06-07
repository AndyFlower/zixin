package com.slp;

import com.slp.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test(){
        BookService bookService = context.getBean(BookService.class);
        bookService.checkout("zhang","isbn01");;

    }
}
