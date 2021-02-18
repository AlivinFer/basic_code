package fer.day13.demo03;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author: Alivin Fer
 * @date: 2020/11/27 15:18
 **/

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序
    底层原理：
        哈希表+链表(记录元素的顺序)
 */

public class Demo01LinkedHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "e");
        System.out.println(map); // key不允许重复，无序

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "e");
        System.out.println(linked); // key不允许重复，有序
    }
}
