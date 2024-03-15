package com.itguigu.spring6.iocxml.tx.dao;

public interface BookDao {
    //获得图书价格
    public Integer getBookPriceMethod(Integer bookId);

    //更新库存  库存-1
    public void updateStock(Integer bookId);

    //根据用户id更新用户账户余额
    void updateBalance(Integer userId, Integer price);
}
