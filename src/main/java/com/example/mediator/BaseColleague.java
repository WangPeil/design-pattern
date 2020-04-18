package com.example.mediator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 21:43
 */
public abstract class BaseColleague {
    protected Mediator mediator;

    public BaseColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * send message
     */
    public abstract void send();

    /**
     * receive message
     */
    public abstract void receive();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
