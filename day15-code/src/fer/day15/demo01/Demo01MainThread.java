package fer.day15.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/7 11:22
 **/

/*
    主线程：执行主(Main)方法的线程

    单线程程序：java 程序中只有一个线程
    执行从 main 方法开始，从上到小依次执行

    JVM 执行 main 方法，main 方法会进入到栈内存
    JVM 会找操作系统开辟一条 main 方法通向 CPU 的执行路径
    CPU 就可以通过这个路径来执行 main 方法
    而这个路径有一个名字，叫 main(主)线程
 */

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小西");
        p1.run();
        System.out.println(0/0); // 会抛出主线程异常，中断后面程序执行，无法实现多线程
        System.out.println("==============");
        Person p2 = new Person("小白");
        p2.run();
    }
}
