package fer.day05.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 19:42
 **/

public class Student {

    private int id;  // 学号
    private String name;  // 姓名
    private int age;  // 年龄
    static String room; // 教室
    private static int idCounter = 0;  // 学号计数器，每当 new 了一个新对象的时候，计数器++

    public Student() {

        idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
