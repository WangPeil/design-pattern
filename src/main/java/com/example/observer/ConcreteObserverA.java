package com.example.observer;

/**
 * @Author: peili.wang
 * @Date: 2020/4/12 23:31
 */
public class ConcreteObserverA implements Observer {
    private String name;

    public ConcreteObserverA() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String name) {
        setName(name);
        System.out.println(this.getClass().getName() + "name update to " + name);
    }
}
