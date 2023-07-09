package fer.day06.demo08;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 20:39
 *
 * super 关键字用来访问父类内容，而 this 关键字用来访问本类内容。用法也有三种：
 *
 * 1.在本类的成员方法中，访问本类的成员变量。
 * 2.在本类的成员方法中，访问本类的另一个成员变量
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 * 在第三种用法中要注意：
 * A. this() 调用也必须是构造方法的第一个语句，唯一一个
 * B. super 和 this 两种构造调用，不能同时使用
 **/

public class Zi extends Fu {

    int num = 10;

    public Zi() {
//        super();  // 不能同时使用，这一行不再赠送
        // 本类的无参构造，调用本类的有参构造
        this(123);
//        this(1, 2);  // 错误写法
    }

    public Zi(int n) {
        this(1, 3);
    }

    public Zi(int n, int m) {
 //       this();  // 错误，会造成调用循环
    }

    public void showNum() {
        int num = 5;
        // 局部变量
        System.out.println(num);
        // 本类中的成员变量
        System.out.println(this.num);
        // 父类中的成员变量
        System.out.println(super.num);
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
