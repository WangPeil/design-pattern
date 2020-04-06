package com.example.decorator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 22:23
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
