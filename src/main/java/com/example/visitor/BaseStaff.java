package com.example.visitor;

/**
 * @Author: peili.wang
 * @Date: 2020/4/12 17:09
 * @Description:
 */
public abstract class BaseStaff {
    private String name;
    private int kpi;

    public BaseStaff(String name, int kpi) {
        this.name = name;
        this.kpi = kpi;
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    /**
     * 访问者
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
