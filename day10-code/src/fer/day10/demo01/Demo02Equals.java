package fer.day10.demo01;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/11/11 17:03
 **/

/*
equals 方法源码:
public boolean equals(Object obj) {
        return (this == obj);
    }
参数：Object obj： 可以传递任意的对象
     == 比较运算符：比较的是值
     引用数据类型：比较的是两个对象的地址值

equals 默认比较的是两个对象的地址值，没有意义
所以要重写 equals 方法，比较两个对象的属性 (name)
问题：
隐含着一个多态
多态的弊端：无法使用子类特有的内容(属性和方法)
 */

public class Demo02Equals {

    public static void main(String[] args) {
        Person person = new Person("郭贝");
        Person person1 = new Person("杨衢");
        System.out.println("person:" + person);
        System.out.println("person1" + person1);
        System.out.println(person.equals(person1));
        System.out.println("=================");

        // 将 person1 的地址赋值给 person
        person = person1;
        System.out.println(person.equals(person1));
        System.out.println("=================");

        // 传递不同的对象
        ArrayList<String> list = new ArrayList<>();
        boolean b = person.equals(list);
        System.out.println(b);
        System.out.println(person.equals(null));
        System.out.println(person.equals(person));
    }
}
