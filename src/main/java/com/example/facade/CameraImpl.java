package com.example.facade;

/**
 * 子系统实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/11 20:52
 */
public class CameraImpl implements Camera {
    @Override
    public void takePicture() {
        System.out.println("拍照片");
    }
}
