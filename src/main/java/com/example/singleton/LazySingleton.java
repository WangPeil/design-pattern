package com.example.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.PrimitiveIterator;

/**
 * 懒汉式单例模式
 * 存在线程安全问题
 * 当多个线程进入getInstance方法时可能会创建多个instance
 *
 * @Author: peili.wang
 * @Date: 2020/4/4 22:32
 */
public class LazySingleton {

    /**
     * 私有化构造器
     */
    private LazySingleton() {
        if (instance != null) {
            throw new DuplicateInstanceException("不允许构造单例");
        }
    }

    /**
     * 创建一个类静态实例
     */
    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
