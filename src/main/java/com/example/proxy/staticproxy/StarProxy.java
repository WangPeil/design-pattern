package com.example.proxy.staticproxy;

import com.example.proxy.Star;

/**
 * @Author: peili.wang
 * @Date: 2020/4/11 22:11
 */
public class StarProxy implements Star {
    private Star star;

    public StarProxy(Star star) {
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("演唱会开始");
        star.sing();
        System.out.println("演唱会结束");
    }
}
