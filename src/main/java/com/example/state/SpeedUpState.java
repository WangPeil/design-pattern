package com.example.state;

/**
 * 状态实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 22:49
 */
public class SpeedUpState implements State {
    @Override
    public void run(Context context) {
        System.out.println("--------run speed up----------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        context.setState(Context.SPEED_DOWN);
        System.out.println("--------finish speed up-------");

    }
}
