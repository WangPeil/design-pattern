package com.example.facade;

/**
 * 内部字接口实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/11 20:52
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂电话");
    }
}
