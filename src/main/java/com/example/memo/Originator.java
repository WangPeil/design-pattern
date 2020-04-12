package com.example.memo;

/**
 * @Author: peili.wang
 * @Date: 2020/4/13 00:00
 */
public class Originator {
    private String message;
    private String state;

    public Originator(String message, String state) {
        this.message = message;
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memo saveStateToMemo() {
        return new Memo(message, state);
    }

    public void recoverStateFromMemo(Memo memo) {
        state = (String) memo.getData();
    }
}
