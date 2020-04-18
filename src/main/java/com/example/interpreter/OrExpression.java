package com.example.interpreter;

/**
 * @Author: peili.wang
 * @Date: 2020/4/18 22:28
 */
public class OrExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public OrExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(String context) {
        return leftExpression.interpret(context) || rightExpression.interpret(context);
    }
}
