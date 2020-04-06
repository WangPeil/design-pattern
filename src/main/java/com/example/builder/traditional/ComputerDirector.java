package com.example.builder.traditional;

import java.util.Objects;

/**
 * 建造者指导类
 *
 * @Author: peili.wang
 * @Date: 2020/4/6 13:32
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder computerBuilder, int usbCount, String keyboard, String display) {
        Objects.requireNonNull(computerBuilder);
        computerBuilder.setUsbCount(usbCount);
        computerBuilder.setDisplay(display);
        computerBuilder.setKeyboard(keyboard);
    }
}
