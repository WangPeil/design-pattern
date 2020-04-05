package com.example.singleton;

/**
 * @Author: peili.wang
 * @Date: 2020/4/4 23:00
 */
public class DuplicateInstanceException extends RuntimeException {
    public DuplicateInstanceException() {
    }

    public DuplicateInstanceException(String message) {
        super(message);
    }

    public DuplicateInstanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
