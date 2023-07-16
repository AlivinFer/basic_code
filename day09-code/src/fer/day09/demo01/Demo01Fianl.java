package fer.day09.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 19:26
 *
 * final 关键字代表最终、不可改变的
 *
 * 常见四种用法：
 * 1. 可以用来修饰一个类
 * 2. 可以用来修饰一个方法
 * 3. 可以用来修饰一个局部变量
 * 4. 可以用来修饰一个成员变量
 **/

public class Demo01Fianl {

    public static void main(String[] args) {
        int num1 = 10;
        // 10
        System.out.println(num1);
        num1 = 20;
        // 20
        System.out.println(num1);

        // 一旦使用 final 来修饰局部变量，那么这个变量就不能进行更改
        final int num2 = 100;
        // 100
        System.out.println(num2);

        // 错误写法
//        num2 = 200;

        // 对于基本类型来说，不可变说的是变量当中的数据不可改变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可改变
        Student stu1 = new Student("尤尤", 20);
        System.out.println(stu1);
        System.out.println(stu1.getName() + '：' + stu1.getAge());
        stu1 = new Student("小费", 21);
        System.out.println(stu1);
        System.out.println(stu1.getName() + "：" + stu1.getAge());
        System.out.println("===================");

        final Student stu2 = new Student("能年", 18);
        // 错误写法，final 修饰的引用类型变量，地址不可改变
//        stu2 = new Student("德邦", 30);
        // 内容是可以改变的
        stu2.setName("盖伦");
        System.out.println(stu2.getName());

    }
}

