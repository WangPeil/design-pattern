package com.example.singleton;

/**
 * volatile修饰防止JVM的[1,2,3]指令重排
 *
 * @Author: peili.wang
 * @Date: 2020/4/4 22:44
 */
public class LazySingletonWithLockAndVolatile {
    /**
     * 私有化构造器
     */
    private LazySingletonWithLockAndVolatile() {
        if (instance != null) {
            throw new DuplicateInstanceException("不允许构造单例");
        }
    }

    /**
     * 静态内部实例
     * volatile修饰 防止JVM对指令重排
     */
    private volatile static LazySingletonWithLockAndVolatile instance;

    public static LazySingletonWithLockAndVolatile getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithLockAndVolatile.class) {
                if (instance == null) {
                    instance = new LazySingletonWithLockAndVolatile();
                }
            }
        }
        return instance;
    }
}
