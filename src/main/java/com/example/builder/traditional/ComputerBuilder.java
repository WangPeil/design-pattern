package com.example.builder.traditional;

/**
 * 建造者顶层接口
 *
 * @author peili.wang
 */
public interface ComputerBuilder {
    /**
     * 设置usb接口数量
     *
     * @param usbCount
     */
    void setUsbCount(int usbCount);

    /**
     * 设置显示屏
     *
     * @param display
     */
    void setDisplay(String display);

    /**
     * 设置键盘
     *
     * @param keyboard
     */
    void setKeyboard(String keyboard);

    /**
     * 返回电脑
     * @return
     */
    Computer build();
}
