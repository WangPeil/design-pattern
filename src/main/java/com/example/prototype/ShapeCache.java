package com.example.prototype;

import java.util.HashMap;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 21:56
 */
public class ShapeCache {
    private static HashMap<String, BaseShape> shapeHashMap
            = new HashMap<>();

    public static BaseShape getShape(String type) throws CloneNotSupportedException {
        BaseShape cachedShape = shapeHashMap.get(type);
        return (BaseShape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeHashMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeHashMap.put(square.getId(), square);
    }
}
