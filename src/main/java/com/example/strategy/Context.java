package com.example.strategy;

/**
 * 环境类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 20:54
 */
public class Context {
    /**
     * 内部封装策略对象
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.doSomething();
    }
}
