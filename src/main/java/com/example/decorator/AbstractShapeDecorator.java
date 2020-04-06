package com.example.decorator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 22:25
 */
public abstract class AbstractShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public AbstractShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
