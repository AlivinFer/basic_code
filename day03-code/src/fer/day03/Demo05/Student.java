package fer.day03.Demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/10/13 20:55
 *
 * 一个标准的类通常要拥有下面四个组成部分
 *
 * 1. 所有的成员变量都要使用 private 关键字修饰
 * 2. 为每一个成员变量编写一对 Getter/Setter 方法
 * 3. 编写一个无参数的构造方法
 * 4， 编写一个全参数的构造方法
 **/

public class Student {

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
