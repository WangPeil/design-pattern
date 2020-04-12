package com.example.state;

/**
 * 环境类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 22:47
 */
public class Context {
    private State state;
    public static final State COMMON = new RunState();
    public static final State SPEED_UP = new SpeedUpState();
    public static final State SPEED_DOWN = new SpeedDownState();

    private Thread runThread;


    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void stopRun() {
        if (isRunning()) {
            runThread.interrupt();
            System.out.println("-------stop run----------");
        }
    }

    public void startRun() {
        if (!isRunning()) {
            final Context context = this;
            runThread = new Thread(() -> {
                while ((!runThread.isInterrupted())) {
                    state.run(context);
                }
            });
            System.out.println("--------start run-------------");
            runThread.start();
        }
    }

    private boolean isRunning() {
        return runThread != null && !runThread.isInterrupted();
    }

}
