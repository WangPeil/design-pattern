package com.example.responsibility;

/**
 * @author peili.wang
 */

public enum LogEnum {
    /**
     * 调试
     */
    DEBUG(0),
    /**
     * 通知
     */
    INFO(1),
    /**
     * 错误
     */
    ERROR(2);
    private int status;
    LogEnum(int status) {
        this.status = status;
    }
    int getStatus() {
        return status;
    }
}
