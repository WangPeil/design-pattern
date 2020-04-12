package com.example.strategy;

/**
 * 具体策略类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 20:57
 */
public class ConcreteStrategyC implements Strategy {

    @Override
    public void doSomething() {
        System.out.println(this.getClass().getName());
    }
}
