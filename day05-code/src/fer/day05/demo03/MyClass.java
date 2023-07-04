package fer.day05.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 20:00
 **/

public class MyClass {

    /**
     * 成员变量
     */
    int num;
    /**
     * 静态变量
     */
    static int numStatic;

    /**
     * 成员方法
     */
    public void method() {
        System.out.println("这是一个成员方法。");
        // 成员方法可以访问成员变量
        System.out.println("num: " + num);
        // 成员方法可以访问静态变量
        System.out.println("成员方法 numStatic: " + numStatic);
    }

    /**
     *  静态方法
     */
    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
        // 静态方法可以访问静态变量
        System.out.println("静态方法 numStatic: " + numStatic);
        // 静态不能直接访问非静态【重点】
//        System.out.println(num);  // 错误写法
//        System.out.println(this);  // 错误写法
    }
}
