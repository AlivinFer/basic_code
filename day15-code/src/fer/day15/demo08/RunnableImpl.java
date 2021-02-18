package fer.day15.demo08;

/**
 * @author: Alivin Fer
 * @date: 2020/12/14 14:51
 **/

/*
    实现卖票案例
 */

public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票数
    private int tickets = 100;

    // 创建一个锁对象
    Object obj = new Object();

    // 设置线程任务：卖票
    @Override
    public void run() {
        // 使用死循环，直到卖完
        while (true) {
            // 解决线程安全的第一种方法：同步代码块
            synchronized (obj) {
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
            }
        }
    }
}
