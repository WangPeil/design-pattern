package com.example.singleton;

/**
 * 懒汉式单例模式
 * 双重锁校验发 通常线程安全 低概率不安全
 * 不安全的原因在于 new LazySingletonWithLock() JVM或者CPU会出现指令[1,2,3]重排
 *
 * @Author: peili.wang
 * @Date: 2020/4/4 22:39
 */
public class LazySingletonWithLock {
    /**
     * 私有化构造器
     */
    private LazySingletonWithLock() {
        if (instance != null) {
            throw new DuplicateInstanceException("不允许构造单例");
        }
    }

    /**
     * 静态内部实例
     */
    private static LazySingletonWithLock instance;

    public static LazySingletonWithLock getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithLock.class) {
                if (instance == null) {
                    instance = new LazySingletonWithLock();
                }
            }
        }
        return instance;
    }
}
