package com.example.singleton;

/**
 * 饿汉模式
 * 利用类加载机制保证线程安全
 *
 * @Author: peili.wang
 * @Date: 2020/4/4 22:48
 */
public class HungrySingleton {
    /**
     * 私有化构造器
     */
    private HungrySingleton() {
        if (instance != null) {
            throw new DuplicateInstanceException("不允许构造单例");
        }
    }

    /**
     * 静态内部类 声明时初始化
     */
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
