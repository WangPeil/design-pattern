package com.example.prototype;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 21:55
 */
public class Circle extends BaseShape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
