package fer.day06.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/25 20:32
 *
 * 在继承的关系中，“子类就是一个父类”。也就是说，子类可以被当作父类来看
 *
 * 定义父类格式：(一个普通的类定义)
 * public class 父类名称 {
 *     // ...
 * }
 *
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称 {
 *     // ...
 * }
 *
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 *
 * 直接通过子类对象访问成员变量：
 *     等号左边是谁，就优先使用谁，没有则向上找
 * 间接通过成员方法访问成员变量
 *     该方法属于谁，就优先使用谁，没有则向上找
 **/

public class Demo01Extends {

    public static void main(String[] args) {
        // 创建了一个子类对象
        Teacher teacher = new Teacher();
        teacher.method(); // 方法执行!
        // 优先使用本类对象
        System.out.println("teacher.name: " + teacher.name);
        System.out.println("teacher.salary: " + teacher.salary);

        // new 的是 Employee 对象，使用的是 Employee 类的方法和属性
        Employee employee = new Assistant();
        employee.method();
        System.out.println("employee.name: " + employee.name);

        // 创建另一个子类对象
        Assistant assistant = new Assistant();
        assistant.method(); // 方法执行!
        System.out.println("assistant.name: " + assistant.name);
    }
}
