package com.itguigu.spring6.iocxml.tx.service;

import com.itguigu.spring6.iocxml.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void buyBook(Integer bookId, Integer userId) {
//根据图书id查询图书价格
        Integer price = bookDao.getBookPriceMethod(bookId);
//        更新图书库存减一
        bookDao.updateStock(bookId);
//        更新用户表余额-图书价格
        bookDao.updateBalance(userId, price);
    }
}
