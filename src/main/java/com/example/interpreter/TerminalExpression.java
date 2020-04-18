package com.example.interpreter;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 22:26
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
