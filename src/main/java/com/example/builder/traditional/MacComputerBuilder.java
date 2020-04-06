package com.example.builder.traditional;

/**
 * 建造者实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/6 13:28
 */
public class MacComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount(int usbCount) {
        computer.setUsbCount(usbCount);
    }

    @Override
    public void setDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void setKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
