package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 透明组合模式
 * 所有公共的方法都封装在Component中
 *
 * @Author: peili.wang
 * @Date: 2020/4/10 00:14
 */
public class ClearComposite {

    /**
     * 抽象基类
     */
    static abstract class BaseComponent {
        protected String name;

        public BaseComponent(String name) {
            this.name = name;
        }

        /**
         * 操作
         *
         * @return name
         */
        public abstract String operation();

        public boolean addChild(BaseComponent component) {
            throw new UnsupportedOperationException("addChild not supported");
        }

        public boolean removeChild(BaseComponent component) {
            throw new UnsupportedOperationException("removeChild not supported");
        }

        public BaseComponent getComponent(int index) {
            throw new UnsupportedOperationException("getComponent not supported");
        }
    }


    /**
     * 树节点
     */
    static class Composite extends BaseComponent {
        private List<BaseComponent> components;

        public Composite(String name) {
            super(name);
            components = new ArrayList<>();
        }

        @Override
        public String operation() {
            StringBuilder stringBuilder = new StringBuilder(name);
            for (BaseComponent component : components) {
                stringBuilder.append("\n");
                stringBuilder.append(component.operation());
            }
            return stringBuilder.toString();
        }

        @Override
        public boolean addChild(BaseComponent component) {
            return components.add(component);
        }

        @Override
        public boolean removeChild(BaseComponent component) {
            return components.remove(component);
        }

        @Override
        public BaseComponent getComponent(int index) {
            return components.get(index);
        }
    }


    /**
     * 叶子节点
     */
    static class Leaf extends BaseComponent {
        public Leaf(String name) {
            super(name);
        }

        @Override
        public String operation() {
            return name;
        }
    }
}
