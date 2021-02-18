package fer.day15.demo11;

import java.security.PublicKey;

/**
 * @author: Alivin Fer
 * @date: 2020/12/14 21:54
 **/

/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程(消费者)：告知老板要的包子的种类和数量，调用 wait 方法，放弃 cpu 的执行
                                进入到 waiting 状态(无限等待)
        创建一个老板线程(生产者)：花了5秒做包子
    注意：
        顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用 wait 和 notify 方法

    Object 类中的方法
    void wait()
        在其它线程调用此对象的 notify 方法或 notifyAll() 方法前，导致当前线程等待
    void notify()
        唤醒在此对象监视器上等待的单个线程
        会继续执行 wait() 方法之后的代码
 */

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();
        // 创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("告知老板要的包子种类和数量");
                    // 调用 wait 方法，放弃 cpu 的执行，进入到 warning 状态(无限等待)
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 唤醒之后执行的代码
                    System.out.println("包子一句做好了，开吃");
                    System.out.println("=================");
                }
            }
        }.start();

        // 创建一个老板线程(生产者)
        new Thread() {
            @Override
            public void run() {
                // 花 5 秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("老板告知顾客做好了包子");
                    // 调用 notify 方法，唤醒顾客吃包子
                    obj.notify();

                }
            }
        }.start();
    }
}
