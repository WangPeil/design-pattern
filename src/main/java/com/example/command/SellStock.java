package com.example.command;

/**
 * @Author: peili.wang
 * @Date: 2020/4/16 22:17
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
