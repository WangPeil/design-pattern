package com.example.observer;

/**
 * 主题 被观察者
 * @author peili.wang
 */
public interface Subject {
    /**
     * 添加观察者
     *
     * @param observer 观察者
     * @return
     */
    boolean add(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者
     * @return
     */
    boolean remove(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyAllObservers(String name);
}
