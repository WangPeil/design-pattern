package com.example.iterator;

/**
 * @author peili.wang
 */
public interface Iterable<T> {
    /**
     * 获取迭代器
     *
     * @return 迭代器
     */
    Iterator<T> iterator();
}
