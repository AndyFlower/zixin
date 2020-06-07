package com.slp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    /**
     * 减余额
     * @param userName
     * @param price
     */
    public  void updateBalance(String userName,int price){
        String sql = "update account set balance = balance-? where user_name=?";
        jdbcTemplate.update(sql,userName,price);
    }

    /**
     * 获取价格
     * @param bookId
     * @return
     */
    public  int getPrice(String bookId){
        String sql = "select price from book where isbn=?";
       return jdbcTemplate.queryForObject(sql,Integer.class,bookId);
    }

    /**
     * 减库存
     * @param bookId
     */
    public void  updateStock(String bookId){
        String sql = "update book_stock set stock = stock-1 where book_id=?";
        jdbcTemplate.update(sql,bookId);
    }
}
