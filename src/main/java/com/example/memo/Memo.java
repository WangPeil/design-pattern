package com.example.memo;

/**
 * 备忘录
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 23:59
 */
public class Memo {
    private String message;
    private Object data;

    public Memo(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
