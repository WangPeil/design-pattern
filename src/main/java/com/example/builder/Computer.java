package com.example.builder;

import java.util.Objects;

/**
 * 建造者模式
 *
 * @Author: peili.wang
 * @Date: 2020/4/6 12:41
 */
public class Computer {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyboard;
    private String display;

    private Computer(Builder builder) {
        Objects.requireNonNull(builder);
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
