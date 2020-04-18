package com.example.mediator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 21:46
 */
public class ConcreteColleagueA extends BaseColleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send() {
        System.out.println(this.getClass().getName() + ":send()");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println(this.getClass().getName() + ":receive()");
    }
}
