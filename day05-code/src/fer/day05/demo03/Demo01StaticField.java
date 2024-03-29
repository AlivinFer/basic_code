package fer.day05.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 19:41
 *
 * 如果一个成员变量使用了 static 关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
 **/

public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("郭靖", 18);
        // 静态成员变量，通过类名直接访问
        Student.room = "428";
        Student two = new Student("黄蓉", 18);


        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + Student.room
                + "，学号：" + one.getId());
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + Student.room
                + "，学号：" + two.getId());
    }
}
