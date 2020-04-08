package com.example.bridge.pen;

import com.example.bridge.color.AbstractColor;

/**
 * @Author: peili.wang
 * @Date: 2020/4/8 23:19
 */
public class LargePen extends AbstractPen {
    public LargePen(AbstractColor color) {
        super(color);
    }

    @Override
    public void draw(String message) {
        color.paint("large pen", message);
    }
}
