package fer.day15.demo10.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Alivin Fer
 * @date: 2020/12/14 14:51
 **/

/*
    实现卖票案例

    解决线程安全问题的第三种方案：使用 Lock 锁
 */

public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票数
    private int tickets = 100;

    // 1. 在成员位置创建一个 ReentrantLock 对象
    Lock l = new ReentrantLock();

    // 设置线程任务：卖票
    @Override
    public void run() {
        // 使用死循环，让卖票操作重复执行
        while (true) {
            // 2. 在可能会出现安全问题的代码前调用 Lock 接口中的方法 lock 获取锁
            l.lock();
            if (tickets > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    // 有余票出售
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + tickets + "张票");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 3. 在可能会出现安全问题的代码前调用 Lock 接口中的方法 unlock 释放锁
                    l.unlock(); // 无论程序是否异常，都会释放锁对象
                }
            }
        }
    }

    /*
        定义一个同步方法
     */
    /*public synchronized void payTicket() {
        if (tickets > 0) {
            // 提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 有余票出售
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + tickets + "张票");
            tickets--;
        }
    }*/

    /*
        定义一个静态同步方法
     */

    /*public synchronized static void payTicket() {
        if (tickets > 0) {
            // 提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 有余票出售
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + tickets + "张票");
            tickets--;
        }
    }*/
}
