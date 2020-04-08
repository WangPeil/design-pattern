package com.example.bridge.pen;

import com.example.bridge.color.AbstractColor;

/**
 * @Author: peili.wang
 * @Date: 2020/4/8 23:10
 */
public abstract class AbstractPen {
    protected AbstractColor color;

    public AbstractPen(AbstractColor color) {
        this.color = color;
    }

    public AbstractColor getColor() {
        return color;
    }

    public void setColor(AbstractColor color) {
        this.color = color;
    }

    /**
     * 画something
     *
     * @param message message
     */
    public abstract void draw(String message);
}
