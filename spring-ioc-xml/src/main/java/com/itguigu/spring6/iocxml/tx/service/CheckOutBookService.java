package com.itguigu.spring6.iocxml.tx.service;

public interface CheckOutBookService {
    void checkOut(Integer[] bookIds, Integer userId);
}
