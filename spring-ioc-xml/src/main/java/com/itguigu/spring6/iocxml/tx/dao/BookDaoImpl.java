package com.itguigu.spring6.iocxml.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //根据图书id查询价格
    @Override
    public Integer getBookPriceMethod(Integer bookId) {
        String sql = "select price from t_book where book_id=?";
        Integer bookPrice = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return bookPrice;
    }

    //根据图书id更新库存
    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock=stock-1 where book_id=?";
        jdbcTemplate.update(sql, bookId);

    }

    //根据用户id更新用户账户余额
    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql, price, userId);
    }
}
