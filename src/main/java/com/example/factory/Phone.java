package com.example.factory;

/**
 * 方法工厂模式
 * @Author: peili.wang
 * @Date: 2020/4/5 18:03
 */
interface Phone {
    /**
     * 制作手机
     */
    void make();
}

class MiPhone implements Phone {
    public MiPhone() {
        make();
    }

    @Override
    public void make() {
        System.out.println("制作小米手机");
    }
}

class IPhone implements Phone {
    public IPhone() {
        make();
    }

    @Override
    public void make() {
        System.out.println("制作苹果手机");
    }
}
