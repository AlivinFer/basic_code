package fer.day04.demo04;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 20:01
 **/

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以随意变化的

对于 ArrayList 来说，有一个尖括号 <E> 代表泛型
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
对于 ArrayList 集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的中括号：[]
 */

public class Demo02ArrayList {
    public static void main(String[] args) {
        // 创建一个 ArrayList 集合，集合的名称是 list，里面装的全都是 String 字符串类型的数据
        // 备注：从 JDK 1.7 开始，右侧的尖括号内部不写内容，但是 <> 本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 向集合当中添加一些数据，需要用当 add 的方法
        list.add("尤尤");
        System.out.println(list);

        list.add("能年玲奈");
        System.out.println(list);
    }
}
