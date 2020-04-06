package com.example.prototype;

/**
 * @Author: peili.wang
 * @Date: 2020/4/6 21:50
 */
public abstract class BaseShape implements Cloneable {
    private String id;
    protected String type;

    /**
     * 画图
     */
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
