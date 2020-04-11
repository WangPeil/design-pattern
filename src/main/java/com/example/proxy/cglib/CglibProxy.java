package com.example.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.util.Arrays;

/**
 * @Author: peili.wang
 * @Date: 2020/4/11 22:38
 */
public class CglibProxy {

    public static void main(String[] args) {

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        //实例化一个增强器，也就是cglib中的一个class generator
        Enhancer enhancer = new Enhancer();
        //设置目标类
        enhancer.setSuperclass(ArraySort2.class);
        //设置拦截对象，这里直接使用匿名内部类写法
        enhancer.setCallback((MethodInterceptor) (object, method, args1, proxy) -> {
            String sortName = method.getName();
            switch (sortName) {
                case "bubbleSort":
                    sortName = "冒泡排序";
                    break;
                case "selectSort":
                    sortName = "选择排序";
                    break;
                case "quickSort":
                    sortName = "快速排序";
                    break;
                default:
                    break;
            }
            long start = System.currentTimeMillis();
            //此处一定要使用proxy的invokeSuper方法来调用目标类的方法
            proxy.invokeSuper(object, args1);
            long end = System.currentTimeMillis();
            System.out.println("本次" + sortName + "的执行时间为: " + (end - start) + "ms");
            return null;
        });
        //生成代理类并返回一个实例
        ArraySort2 arraySort = (ArraySort2) enhancer.create();
        arraySort.bubbleSort(arr);
        arraySort.selectSort(arr);
        arraySort.quickSort(arr);
    }

}

class ArraySort2 {
    public void quickSort(int[] arr) {
        Arrays.sort(arr);
    }

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
