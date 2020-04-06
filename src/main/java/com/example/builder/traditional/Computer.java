package com.example.builder.traditional;

/**
 * product
 *
 * @Author: peili.wang
 * @Date: 2020/4/6 13:23
 */
public class Computer {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyboard;
    private String display;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public Computer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Computer setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public Computer setUsbCount(int usbCount) {
        this.usbCount = usbCount;
        return this;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public Computer setKeyboard(String keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public Computer setDisplay(String display) {
        this.display = display;
        return this;
    }
}
