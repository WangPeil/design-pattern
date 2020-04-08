package com.example.adapter;

/**
 * Target的实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/8 22:52
 */
public class ConcreteTarget implements Target {
    @Override
    public void doSomething() {
        System.out.println("ConcreteTarget::doSomething()");
    }
}
