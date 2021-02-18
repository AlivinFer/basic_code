package fer.day12.demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: Alivin Fer
 * @date: 2020/11/25 20:12
 **/

/*
    -java.utils.Collections 是集合工具类，用来对集合进行操作。
        将集合中元素按照默认规则排序
        public static <T> void sort(List<T> list, Comparator<? super T>):

     Comparator 和 Comparable 的区别
        Comparable：自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的规则 compareTo 方法
        Comparator：相当于找一个第三方的裁判，比较两个
            比较规则：o1 - o2  升序
                     o2 - o1  降序
 */

public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);
        list.add(1);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 升序
                return o2 - o1; // 降序
            }
        });

        System.out.println(list);
    }
}
