package fer.day12.demo05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: Alivin Fer
 * @date: 2020/11/25 19:46
 **/

/*
    -java.utils.Collections 是集合工具类，用来对集合进行操作。
    public static <T> void sort(List<T> list): 将集合中元素按照默认规则排序

    注意事项：
        sort(List<T> list) 使用前提
        被排序的集合里面存储的元素，必须实现 Comparable,重写接口中 comparable 方法
 */

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,3,2,3,0);
        Collections.sort(list); // 默认是升序
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a","c","b","0");
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("提莫", 20));
        list2.add(new Person("寒冰", 25));
        list2.add(new Person("皇子", 18));
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

    }
}
