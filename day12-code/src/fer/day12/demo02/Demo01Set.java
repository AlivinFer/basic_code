package fer.day12.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: Alivin Fer
 * @date: 2020/11/23 20:22
 **/

/*
    java.util.Set 接口 extends Collection 接口
    Set 接口的特点：
        1. 不允许存储重复的元素
        2. 没有索引，没有带索引的方法，也不能使用普通的 for 循环遍历

    java.util.Set 集合 implements Set 接口
    Set 特点：
        1. 不允许存储重复的元素
        2. 没有索引，没有带索引的方法，也不能使用普通的 for 循环遍历
        3. 是一个无序的结婚，存储元素和取出元素的顺序可能不一致
        4. 底层是一个哈希表结构(查询的速度非常的快)
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 使用 add 方法往集合中添加元素
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        // 使用迭代器遍历 Set 集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.println(n); // 1, 2, 3
        }

        // 使用增强 for 遍历 Set 集合
        System.out.println("===========");
        for (int num : set) {
            System.out.println(num);
        }

    }
}
