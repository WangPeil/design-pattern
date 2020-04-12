package com.example.template;

/**
 * 实现类
 * @Author: peili.wang
 * @Date: 2020/4/12 20:28
 */
public class DoFish extends BaseDoFishTemplate {
    @Override
    public void prepare() {
        System.out.println("准备菜");
    }

    @Override
    public void doing() {
        System.out.println("做菜");
    }

    @Override
    public void finish() {
        System.out.println("收拾厨房");
    }
}
