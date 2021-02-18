package fer.day12.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Alivin Fer
 * @date: 2020/11/22 10:11
 **/

/*
    java.util.list 接口 extends Collection 接口
    List 接口的特点：
        1. 有序的集合，存储元素和取出元素的顺序是一致的
        2. 有索引，包含了一些带索引的方法
        3. 允许存储重复的元素

    List 接口中带索引的方法(特有)：
        public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
        public E get(int index):  返回集合中指定位置的元素
        public E remove(int index):  移除列表中指定位置的元素，返回的是被移除的元素
        public E set(int index, E element):  用指定元素替换集合中指定位置的元素，返回值的？
    注意：
        操作索引的时候，一定要防止索引越界异常
        IndexOutOfBoundsException: 索引越界异常，集合会报
        ArrayIndexOutOfBoundsException: 数组索引越界异常
        StringIndexOutOfBoundsException: 字符串索引越界异常
 */
public class Demo01List {

    public static void main(String[] args) {
        // 创建一个 List 集合对象，多态
        List<String> list = new ArrayList<>();
        System.out.println(list); // [] 不是地址，重写了 toString 方法
        // 1. 使用 add 方法往集合中添加元素
        list.add("I");
        list.add("Love");
        list.add("You");
        list.add("I");
        // 打印集合
        System.out.println(list);

        // 在指定位置添加元素
        list.add(3, "YOUYOU");
        System.out.println(list);

        // 2. 移除指定列表中指定位置的元素，返回的是被移除的元素
        String removeE = list.remove(4);
        System.out.println("被移除的元素：" + removeE);
        System.out.println(list);

        // 3. 用指定元素替换集合中指定位置的元素，返回被替换的元素
        String setE = list.set(0, "Baby");
        System.out.println(setE);  // I
        System.out.println(list);

        // 4. list 集合遍历 3 种方式
        // 使用普通的方式
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i); // 返回集合种指定位置的元素
            System.out.println(s);
        }
        System.out.println("================");
        // 使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=================");
        // 使用增强 for
        for (String s : list) {
            System.out.println(s);
        }
    }
}
