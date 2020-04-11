package com.example.flyweight;

import java.util.HashMap;

/**
 * 存储创建好的对象的工厂
 *
 * @Author: peili.wang
 * @Date: 2020/4/11 21:45
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> HASH_MAP = new HashMap<>();

    private ShapeFactory() throws IllegalAccessException {
        throw new IllegalAccessException("不允许实例化");
    }

    public static Shape getCircle(String color) {
        // 如果在HASH_MAP则返回，否则创建后返回
        if (HASH_MAP.get(color) == null) {
            Shape circle = new Circle(color, Math.random(), Math.random(), Math.random());
            HASH_MAP.put(color, circle);
            System.out.println("Create " + color + " circle.");
        }
        return HASH_MAP.get(color);
    }
}
