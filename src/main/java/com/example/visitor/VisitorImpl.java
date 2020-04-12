package com.example.visitor;

/**
 * 访问者实现类
 *
 * @Author: peili.wang
 * @Date: 2020/4/12 17:21
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + " codes " + engineer.getCodeLines() + " lines in this year.");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getName() + " hands up " + manager.getProducts() + " products in this year.");
    }
}
