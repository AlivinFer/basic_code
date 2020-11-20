package fer.day11.demo03;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/11/17 20:55
 **/

/*
    增强 for 循环，专门用来遍历数组和集合的。它的内部原理其实是个 Iterator 迭代器
    在遍历的过程中，不能对集合的元素进行增删操作
    Collection<E>extends Iterator<E>: 所有的单列集合都可以使用增强 for
    public interface Iterable<T> 实现这个接口允许对象成为 "foreach" 语句的目标

增强    增强 for 循环：只能用来遍历集合和数组
 */

public class Demo02ForEach {

    public static void main(String[] args) {

        demo01();
        demo02();

    }

    // 使用增强 for 循环遍历数组
    public static void demo01() {
        int[] arr = {1, 2, 3, 4, 5, 0};
        for (int a:arr) {
            System.out.println(a);
        }
    }

    public static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("科比");
        list.add("詹姆斯");
        list.add("杜兰特");
        list.add("霍华德");
        list.add("诺维斯基");
        list.add("姚明");
        for (String str:list) {
            System.out.println(str);
        }
    }
}
