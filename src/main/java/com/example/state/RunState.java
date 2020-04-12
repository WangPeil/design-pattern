package com.example.state;

/**
 * 状态实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 22:48
 */
public class RunState implements State {
    @Override
    public void run(Context context) {
        System.out.println("--------running---------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        context.setState(Context.SPEED_UP);
    }
}
