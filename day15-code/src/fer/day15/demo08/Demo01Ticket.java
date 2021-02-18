package fer.day15.demo08;

/**
 * @author: Alivin Fer
 * @date: 2020/12/14 14:57
 **/

/*
    模拟卖票案例
    创建3个线程，同时开启，对共享的票进行出售
    会出现线程安全问题
        线程安全问题是不能产生的，可以让一个线程在访问共享数据的时候，无论是否失去了 CPU 的执行权
        让其他的线程只能等待，等待当前线程卖完票，其它线程再进行卖票
 */

public class Demo01Ticket {
    public static void main(String[] args) {
        // 创建 Runnable 接口的实现类对象
        Runnable run = new RunnableImpl();
        // 创建 Thread 类对象，构造方法中传递 Runnable 接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        // 调用 start 方法开启多个线程
        t0.start();
        t1.start();
        t2.start();
    }
}
