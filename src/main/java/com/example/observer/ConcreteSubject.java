package com.example.observer;

import java.util.List;

/**
 * 主题类 存放若干个观察对象
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 23:22
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private String name;

    public ConcreteSubject(List<Observer> observers, String name) {
        this.observers = observers;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setName(String name) {
        this.name = name;
        notifyAllObservers(name);
    }

    @Override
    public boolean add(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean remove(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String name) {
        for (Observer observer : observers) {
            observer.update(name);
        }
    }
}
