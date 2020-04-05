package com.example.factory;

/**
 * 简单工厂模式
 *
 * @Author: peili.wang
 * @Date: 2020/4/5 17:41
 */
public class SimpleFactory {

    public Phone makePhone(String phoneType) {
        String miPhone = "MiPhone";
        String iPhone = "IPhone";
        if (miPhone.equalsIgnoreCase(phoneType)) {
            return new MiPhone();
        } else if (iPhone.equalsIgnoreCase(phoneType)) {
            return new IPhone();
        } else {
            return null;
        }
    }
}



