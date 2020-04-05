package com.example.singleton;

import com.sun.istack.internal.NotNull;
import com.sun.org.apache.regexp.internal.REUtil;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: peili.wang
 * @Date: 2020/4/5 16:13
 */
public class CASSingleton {
    /**
     * 静态属性
     */
    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<>();

    /**
     * 私有化构造器
     */
    private CASSingleton() {
    }

    public static CASSingleton getInstance() {
        while (true) {
            CASSingleton current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new CASSingleton();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
