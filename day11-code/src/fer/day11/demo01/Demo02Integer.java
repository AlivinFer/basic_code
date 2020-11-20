package fer.day11.demo01;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/11/16 19:47
 **/

public class Demo02Integer {

    public static void main(String[] args) {

        // 自动装箱
        Integer in = 1; // 相当于 Integer i = new Integer(1);
        System.out.println(in);

        // 自动拆箱，in 是包装类，无法直接参与计算，可以自动转换为基本数据类型，再进行计算
        in = in + 2; // 相当于 in.intValue() + 2
        System.out.println(in);

        // ArrayList 集合无法直接存储整数，可以存储 Integer 包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 自动装箱 list.add(new Integer(1))
        System.out.println(list);

        int a = list.get(0); // 自动拆箱 list.get(0).intValue()
        System.out.println(a);


    }
}
