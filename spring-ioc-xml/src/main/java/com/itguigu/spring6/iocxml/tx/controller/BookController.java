package com.itguigu.spring6.iocxml.tx.controller;

import com.itguigu.spring6.iocxml.tx.service.BookService;
import com.itguigu.spring6.iocxml.tx.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckOutService checkOutService;

    public void buyBook(Integer[] bookId, Integer userId) {
//        bookService.buyBook(bookId, userId);
        checkOutService.checkOut(bookId, userId);
    }
}
