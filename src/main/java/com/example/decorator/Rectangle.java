package com.example.decorator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 22:22
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
