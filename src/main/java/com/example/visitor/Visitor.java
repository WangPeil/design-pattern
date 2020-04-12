package com.example.visitor;

/**
 * @author peili.wang
 */
public interface Visitor {
    /**
     * 工程师访问
     *
     * @param engineer 工程师
     */
    void visit(Engineer engineer);

    /**
     * 经理访问
     *
     * @param manager 经理
     */
    void visit(Manager manager);
}
