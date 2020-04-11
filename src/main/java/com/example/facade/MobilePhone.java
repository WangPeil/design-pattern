package com.example.facade;

/**
 * 外观接口
 *
 * @Author: peili.wang
 * @Date: 2020/4/11 15:58
 */
public class MobilePhone {
    private Phone phone;
    private Camera camera;

    public MobilePhone(Phone phone, Camera camera) {
        this.phone = phone;
        this.camera = camera;
    }

    public void dail() {
        phone.dail();
    }

    public void hangup() {
        phone.hangup();
    }

    public void takePicture() {
        camera.takePicture();
    }
}




