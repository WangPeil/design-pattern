package com.example.singleton;

/**
 * 内部类方法
 * 懒汉机制 线程安全
 *
 * @Author: peili.wang
 * @Date: 2020/4/4 22:50
 */
public class InnerClassSingleton {
    /**
     * 私有化构造器
     */
    private InnerClassSingleton() {
        if (SingletonHolder.instance != null) {
            throw new DuplicateInstanceException("不允许构造单例");
        }
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    static class SingletonHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
}
