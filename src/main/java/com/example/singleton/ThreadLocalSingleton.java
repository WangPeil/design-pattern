package com.example.singleton;

/**
 * threadLocal实现单例模式 线程安全
 *
 * @Author: peili.wang
 * @Date: 2020/4/5 16:06
 */
public class ThreadLocalSingleton {
    /**
     * 静态属性
     */
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_SINGLETON
            = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    /**
     * 私有化构造器
     */
    private ThreadLocalSingleton() {
        if (getInstance() != null) {
            throw new DuplicateInstanceException("不允许构造单例");
        }
    }

    public static ThreadLocalSingleton getInstance() {

        return THREAD_LOCAL_SINGLETON.get();
    }
}
