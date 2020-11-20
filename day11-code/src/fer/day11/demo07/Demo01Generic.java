package fer.day11.demo07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: Alivin Fer
 * @date: 2020/11/20 20:41
 **/

/*
    通配符的使用
        ?: 代表任意的数据类型
    使用方式：
        不能创建对象
        只能作为方法的参数使用
 */
public class Demo01Generic {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("you");
        list02.add("are");

        printArray(list01);
        printArray(list02);
    }

    // 定义一个方法，能够遍历所有类型的 ArrayList 集合
    // 不知道 ArrayList 集合使用什么数据类型，可以使用泛型的通配符来接收数据
    // 注意：
    //        泛型没有继承概念
//    public static void printArray(ArrayList<Integer> list) {} // 此时 String 类型出错
//    public static void printArray(ArrayList<String> list) {} // 此时 Integer 类型出错
//    public static void printArray(ArrayList<Object> list) {} // 两类都出错

    public static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            // it.next() 方法，取出的元素是 Object，可以接收任意的数据类型
            Object o = it.next();
            System.out.println(o);
        }
    }
}
