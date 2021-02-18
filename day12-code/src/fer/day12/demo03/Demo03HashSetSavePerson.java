package fer.day12.demo03;

import java.util.HashSet;

/**
 * @author: Alivin Fer
 * @date: 2020/11/24 21:43
 **/

/*
    HashSet 存储自定义类型元素
        存储的元素(String,Integer,...Person,Student)
        必须重写 hashCode 方法和 equals 方法

    要求：
        同名同年龄的人，视为同一个人，只能存储一次
 */

public class Demo03HashSetSavePerson {

    public static void main(String[] args) {
        // 创建 HashSet 集合存储 Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("baby",18);
        Person p2 = new Person("baby",18);
        Person p3 = new Person("baby",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);
        System.out.println(p2.equals(p1));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
