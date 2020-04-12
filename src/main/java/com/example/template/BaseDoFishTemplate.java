package com.example.template;

/**
 * 模板模式基类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 20:23
 */
public abstract class BaseDoFishTemplate {
    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 做菜
     */
    public abstract void doing();

    /**
     * 善后
     */
    public abstract void finish();

    public void doFish() {
        prepare();
        doing();
        finish();
    }

}
