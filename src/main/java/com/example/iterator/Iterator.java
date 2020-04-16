package com.example.iterator;

/**
 * 迭代器接口
 *
 * @author peili.wang
 */
public interface Iterator<T> {
    /**
     * 判断是否有下个元素
     *
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return 下个元素
     */
    T next();
}
