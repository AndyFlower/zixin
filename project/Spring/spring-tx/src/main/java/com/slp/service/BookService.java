package com.slp.service;

import com.slp.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 事务注解
     * @param userName
     * @param bookId
     */
    @Transactional
    public void checkout(String userName,String bookId){
        //库存
        bookDao.updateStock(bookId);

        //查询价格
        int price = bookDao.getPrice(bookId);
        //更新余额
        bookDao.updateBalance(userName,price);
    }
}
