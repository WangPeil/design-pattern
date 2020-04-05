package com.example.factory;

/**
 * @Author: peili.wang
 * @Date: 2020/4/5 17:55
 */
public class FactoryMethod {

}

interface PhoneFactory {
    /**
     * 创建手机
     *
     * @return
     */
    Phone makePhone();
}

class MiPhoneFactory implements PhoneFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}

class IPhoneFactory implements PhoneFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}