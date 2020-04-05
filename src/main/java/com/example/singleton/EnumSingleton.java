package com.example.singleton;

/**
 * 枚举实现单例模式
 * 线程安全 支持序列化
 * 最推荐的一种方法
 *
 * @Author: peili.wang
 * @Date: 2020/4/4 22:54
 */
public enum EnumSingleton {
    /**
     * 枚举的单例模式
     */
    INSTANCE(new Object[1]);

    Object[] params;

    EnumSingleton(Object... params) {
        this.params = params;
    }
}
