package fer.day06.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/25 20:35
 **/

public class Teacher extends Employee {
    long salary = 20000;
    String name = "小郭";

    @Override
    public void method() {
        System.out.println("Teacher 类方法执行!");
    }
}