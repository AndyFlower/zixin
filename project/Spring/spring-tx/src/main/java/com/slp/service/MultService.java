package com.slp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName MultService
 * @Description TODO
 * @Author zixin
 * @Date 2020/6/12 8:43
 * @Version 1.0
 **/
@Service
public class MultService {

    @Autowired
    private BookService bookService ;
    @Transactional
    public void mulTx(){
        //都是可以设置的
        //传播行为来设置这个事务方法是不是和之前的大事务共享一个事务（使用同一条连接）
        //都设置为REQUIRED表示和外面的公用一个事务  如果错误将所有的都回滚
        //REQUIRED
        bookService.checkout("Li","001");
        //REQUIRED
        bookService.updatePrice("002",98);
    }

    @Transactional
    public void mulTx2(){
        //都是可以设置的
        //传播行为来设置这个事务方法是不是和之前的大事务共享一个事务（使用同一条连接）
        //如果第二个设置为REQUIRE_NEW表示第二个方法开启新事务 如果第二个失败  第一个不会回滚
        //REQUIRED
        bookService.checkout("Li","001");
        //REQUIRED_new
        bookService.updatePrice("002",98);
    }
}
