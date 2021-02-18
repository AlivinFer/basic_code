package fer.day12.demo03;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author: Alivin Fer
 * @date: 2020/11/25 15:09
 **/

/*
    java.util.LinkedHashSet 集合 extends HashSet 集合
    LinkedHashSet 集合特点：
        底层是一个哈希表(数组+链表/红黑树)+链表：多了一条链表(记录元素的存储顺序)，保证元素有序
 */

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("www");
        set.add("abc");
        set.add("fine");
        System.out.println(set); // [abc, fine, www] 无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("abc");
        linked.add("www");
        linked.add("abc");
        linked.add("fine");
        System.out.println(linked); // [abc, www, fine] 有序，不允许重复
    }
}
