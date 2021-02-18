package fer.day15.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/12/7 12:35
 **/

/*
    创建多线程程序的第一种方式：创建 Thread 类的子类
    java.lang.Thread 类：是描述线程的类，想要实现多线程程序，就必须继承 Thread 类

    实现步骤:
        1. 创建一个 Thread 类的子类
        2. 在 Thread 类的子类中重写 Thread 类中 run 方法，设置线程任务(开启线程要做什么)
        3. 创建 Thread 类的子类对象
        4. 调用 Thread 类中的方法 start 方法，开启新的线程，执行 run 方法
            void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法
            结果是两个线程并发地运行，当前线程(main 线程)和另一个线程(创建新的线程，执行其 run 方法)
            多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
     Java 程序属于抢占式调度，线程优先级高的先执行
 */

public class Demo01Thread {
    public static void main(String[] args) {
        // 3. 创建 Thread 类的子类对象
        MyThread mt = new MyThread();
        // 4. 调用 Thread 类中的 start 方法，开启新的线程，执行 run 方法
        mt.start();

//        System.out.println(0/0); // 并不会影响另一个线程执行

        // 主线程会继续执行主方法中的代码
        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
    }
}
