package com.example.observer;

/**
 * 观察者接口
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 23:22
 */
public interface Observer {
    /**
     * 被观察者更新
     * @param name name
     */
    void update(String name);
}
