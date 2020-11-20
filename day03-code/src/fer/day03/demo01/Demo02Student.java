package fer.day03.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 22:01
 **/

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用

1. 导包：也就是指需要使用的类，在什么位置
import 包名称.类名称
import fer.day03.fer.day09.demo01.Student
对于和当前类属于同一个包的情况，可以省略导包语句不写

2. 创建，格式
类名称 对象名 = new 类名称();
Student stu = new Student();

3. 使用，分两种情况：
使用成员变量，对象名.成员变量名
使用成员方法，对象名.成员方法名(参数)

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样
 */

public class Demo02Student {
    public static void main(String[] args) {
        // 1. 导包
        // 需要使用的 Student 类，和 Demo02Student 位于同一个包下，所以省略导包语句不写

        // 2. 创建
        Student stu = new Student();

        // 3. 使用
        System.out.println(stu.age);  // null
        System.out.println(stu.name);  // 0
        System.out.println("===========");

        // 改变对象当中的成员变量数值内容
        // 将右侧的字符串，赋值给 stu 对象当中的 name 成员变量
        stu.name = "能年玲奈";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("============");

        // 4. 使用对象成员方法
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
