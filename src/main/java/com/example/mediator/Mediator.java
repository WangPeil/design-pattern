package com.example.mediator;

/**
 * @author peili.wang
 */
public interface Mediator {
    /**
     * 注册用户
     * @param colleague
     */
    void register(BaseColleague colleague);

    /**
     * 中转信息
     * @param colleague
     */
    void relay(BaseColleague colleague);
}
