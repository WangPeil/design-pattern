package com.example.state;

/**
 * 状态实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 22:52
 */
public class SpeedDownState implements State {
    @Override
    public void run(Context context) {
        System.out.println("--------run speed down--------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        context.setState(Context.COMMON);
        System.out.println("--------finish speed down-----");

    }
}
