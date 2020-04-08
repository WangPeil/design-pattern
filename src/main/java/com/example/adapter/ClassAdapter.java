package com.example.adapter;

/**
 * 类适配器模式
 *
 * @Author: peili.wang
 * @Date: 2020/4/8 22:53
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void doSomething() {
        doSpecialSomething();
    }
}
