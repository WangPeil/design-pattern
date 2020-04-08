package com.example.bridge.pen;

import com.example.bridge.color.AbstractColor;

/**
 * @Author: peili.wang
 * @Date: 2020/4/8 23:18
 */
public class MiddlePen extends AbstractPen {
    public MiddlePen(AbstractColor color) {
        super(color);
    }

    @Override
    public void draw(String message) {
        color.paint("middle pen", message);
    }
}
