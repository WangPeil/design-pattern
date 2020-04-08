package com.example.bridge.color;

/**
 * @Author: peili.wang
 * @Date: 2020/4/8 23:20
 */
public class Red extends AbstractColor {
    public Red(String colorName) {
        super(colorName);
    }

    @Override
    public void paint(String penType, String message) {
        System.out.println(colorName + " " + penType + " paints " + message);
    }
}
