package fer.day12.demo01;

import java.util.LinkedList;

/**
 * @author: Alivin Fer
 * @date: 2020/11/23 19:39
 **/

/*
    java.util.LinkedList 集合 implements List 接口
    LinkedList 集合的特点：
        1. 底层是一个链表结构：查询慢。增删快
        2. 里面包含了大量操作首尾元素的方法
        注意：使用 LinkedList 集合特有的方法，不能使用多态
 */

public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    // 删除元素的方法
    private static void show03() {
        // 创建LinkedList 集合
        LinkedList<String> linked03 = new LinkedList<>();
        // 1. add 方法添加元素
        linked03.add("q");
        linked03.add("w");
        linked03.add("e");
        linked03.add("r");

        String s = linked03.removeFirst();
        System.out.println(s);
        String s1 = linked03.removeLast();
        System.out.println(s1);
        // 相当于 removeFirst, 移除第一个元素
        String pop = linked03.pop();
        System.out.println(pop);
    }

    // 获取元素的方法
    private static void show02() {
        // 创建LinkedList 集合
        LinkedList<String> linked02 = new LinkedList<>();
        // 1. add 方法添加元素
        linked02.add("q");
        linked02.add("w");
        linked02.add("e");
        linked02.add("r");

//        linked02.clear();  // 清空集合中的元素，在获取集合中的元素会抛出 NoSuchElementException

        // 需添加一个判断集合是否为空的方法
        if (!linked02.isEmpty()) {
            String first = linked02.getFirst();
            System.out.println(first);
            String last = linked02.getLast();
            System.out.println(last);
        }

    }

    // 添加元素的方法
    private static void show01() {
        // 创建LinkedList 集合
        LinkedList<String> linked = new LinkedList<>();
        // 1. add 方法添加元素
        linked.add("q");
        linked.add("w");
        linked.add("e");
        linked.add("r");
        System.out.println(linked);

        // addFirst(E e) 方法 将指定元素插入此列表的开头
        linked.addFirst("df");
        // 此方法等效于 addFirst 方法
        linked.push("df");
        System.out.println(linked);

        // addLast(E e) 将指定元素添加到此列表的结尾，等效于 add()
        linked.addLast("Z");
        System.out.println(linked);
    }
}
