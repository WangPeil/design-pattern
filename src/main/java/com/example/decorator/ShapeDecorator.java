package com.example.decorator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 22:26
 */
public class ShapeDecorator extends AbstractShapeDecorator {
    public ShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        setFiled(decoratedShape);

    }

    private void setFiled(Shape shape) {
        System.out.println("decorate new function");
    }
}
