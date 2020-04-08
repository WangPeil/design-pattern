package com.example.bridge.color;

/**
 * @Author: peili.wang
 * @Date: 2020/4/8 23:11
 */
public abstract class AbstractColor {
    protected String colorName;

    public AbstractColor(String colorName) {
        this.colorName = colorName;
    }

    /**
     * painting
     *
     * @param penType type
     * @param message message
     */
    public abstract void paint(String penType, String message);
}
