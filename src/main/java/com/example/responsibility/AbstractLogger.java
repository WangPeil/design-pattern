package com.example.responsibility;

import java.util.Objects;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 22:07
 */
public abstract class AbstractLogger {
    protected LogEnum logEnum;
    protected AbstractLogger nextLogger;

    public AbstractLogger(LogEnum logEnum) {
        this.logEnum = logEnum;
    }

    public void setLogEnum(LogEnum logEnum) {
        this.logEnum = logEnum;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 写入信息
     *
     * @param message
     */
    public abstract void write(String message);

    public void logMessage(LogEnum logEnum, String message) {
        Objects.requireNonNull(logEnum);
        if (this.logEnum.getStatus() >= logEnum.getStatus()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(logEnum, message);
        }
    }
}
