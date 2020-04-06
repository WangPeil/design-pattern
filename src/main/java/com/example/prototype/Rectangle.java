package com.example.prototype;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 21:53
 */
public class Rectangle extends BaseShape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw().");
    }
}
