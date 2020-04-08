package com.example.adapter;

/**
 * 对象适配器模式
 *
 * @Author: peili.wang
 * @Date: 2020/4/8 22:55
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        adaptee.doSpecialSomething();
    }
}
