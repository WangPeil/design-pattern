package com.example.prototype;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 21:55
 */
public class Square extends BaseShape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
