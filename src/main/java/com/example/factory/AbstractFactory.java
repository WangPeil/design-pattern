package com.example.factory;

/**
 * 抽象工厂模式
 * 提供一组相关或相互依赖的接口
 * 无需指定具体实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/5 18:09
 */
public interface AbstractFactory {
    /**
     * 制作小米手机
     *
     * @return
     */
    MiPhone createMiPhone();

    /**
     * 制作苹果手机
     *
     * @return
     */
    IPhone createIPhone();
}


