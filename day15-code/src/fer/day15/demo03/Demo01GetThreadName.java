package fer.day15.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/12/7 20:44
 **/

public class Demo01GetThreadName {
    public static void main(String[] args) {
        // 创建 Thread 类子类对象
        MyThread mt = new MyThread();
        // 调用 start 方法，开启新线程，执行 run 方法
        mt.start();

        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
