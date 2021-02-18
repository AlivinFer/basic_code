package fer.day17.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/21 18:20
 **/

/*
    使用实现 Runnable 接口的方式实现多线程程序
 */

public class Demo01Runnable {
    public static void main(String[] args) {
        // 创建 Runnable 接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 创建 Thread 类对象，构造方法中传递 Runnable 接口的实现类
        Thread t = new Thread();
        // 调用 start 开启新线程，执行 run 方法
        t.start();

        // 简化代码，使用匿名内部类，实现多线程程序
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        };
        new Thread(r).start();

        // 简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();
    }

}
