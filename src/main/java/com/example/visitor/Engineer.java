package com.example.visitor;

import java.util.Random;

/**
 * 工程师实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 17:07
 */
public class Engineer extends BaseStaff {
    public Engineer(String name, int kpi) {
        super(name, kpi);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public int getCodeLines() {
        return new Random().nextInt(10);
    }
}
