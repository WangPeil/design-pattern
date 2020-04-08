package com.example.bridge.pen;

import com.example.bridge.color.AbstractColor;

/**
 * @Author: peili.wang
 * @Date: 2020/4/8 23:17
 */
public class SmallPen extends AbstractPen {
    public SmallPen(AbstractColor color) {
        super(color);
    }

    @Override
    public void draw(String message) {
        color.paint("small pen", message);
    }
}
