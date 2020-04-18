package com.example.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 21:46
 */
public class ConcreteMediator implements Mediator {
    private List<BaseColleague> colleagues = new ArrayList<>();

    @Override
    public void register(BaseColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(BaseColleague colleague) {
        for (BaseColleague baseColleague : colleagues) {
            if (!baseColleague.equals(colleague)) {
                baseColleague.receive();
            }
        }
    }
}
