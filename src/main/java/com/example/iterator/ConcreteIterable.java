package com.example.iterator;

/**
 * @Author: peili.wang
 * @Date: 2020/4/16 22:47
 */
public class ConcreteIterable implements Iterable<String> {
    public String[] names = {"aaa", "bbb", "ccc"};
    private Iterator<String> iterator = new ConcreteIterator();

    @Override
    public Iterator<String> iterator() {
        return iterator;
    }


    class ConcreteIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return hasNext()? names[index++] :null;
        }
    }

}
