package fer.day12.demo05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: Alivin Fer
 * @date: 2020/11/25 16:48
 **/

/*
    -java.utils.Collections 是集合工具类，用来对集合进行操作。
 */

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 往集合中添加多个元素
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);*/

        // 一次往集合中添加多个元素
        Collections.addAll(list, "a","b","c","d","e");
        System.out.println(list);

        // shuffle 方法打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
