package com.example.interpreter;

/**
 * 建立一些规则
 * 然后用语句去匹配规则 如果命中表示通过 否则不通过
 *
 * @author peili.wang
 */
public interface Expression {
    /**
     * 解释接口
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
