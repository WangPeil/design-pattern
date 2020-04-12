package com.example.visitor;

import java.util.Random;

/**
 * 经理实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 17:10
 */
public class Manager extends BaseStaff {
    public Manager(String name, int kpi) {
        super(name, kpi);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(10);
    }

}
