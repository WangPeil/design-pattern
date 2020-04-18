package com.example.responsibility;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 22:11
 */
public class Logger extends AbstractLogger {
    public Logger(LogEnum logEnum) {
        super(logEnum);
    }

    @Override
    public void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
