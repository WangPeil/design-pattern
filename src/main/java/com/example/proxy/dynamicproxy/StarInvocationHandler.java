package com.example.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @Author: peili.wang
 * @Date: 2020/4/11 22:18
 */
public class StarInvocationHandler implements InvocationHandler {
    private Object target;

    public StarInvocationHandler(Object object) {
        this.target = object;
    }

    /**
     * 获取代理对象
     *
     * @return 代理对象
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * invoke方法自动调用
     * @param proxy 代理对象
     * @param method 方法
     * @param args 参数
     * @return 处理结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("演唱会开始");
        Object invoke = method.invoke(target, args);
        System.out.println("演唱会结束");
        return invoke;
    }
}
