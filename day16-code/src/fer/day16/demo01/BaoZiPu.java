package fer.day16.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/16 19:36
 **/

/*
    生产者(包子铺)类：是一个线程类，可以继承 Thread
    设置线程任务(run)：生产包子
    对包子的状态进行判断
    true：有包子
        包子调用 wait 方法进入等待状态
    false：没有包子
        包子铺生产包子
        增加一些趣味性：交替生产两种包子
            有两种状态(i%2==0)
        包子铺生产好了包子
        修改包子的状态为 true 有
        唤醒吃货线程，让吃货线程吃包子
 */
public class BaoZiPu extends Thread {
    // 1. 需要在成员位置创建一个包子变量
    private BaoZi bz;

    // 2. 使用带参数构造方法，为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    // 设置线程任务(run)：生产包子
    @Override
    public void run() {
        int count = 0;
        // 让包子铺一致生产包子
        while (true) {
            // 必须同时同步技术保证两个线程只有一个在执行
            synchronized (bz) {
                // 对包子的状态进行判断
                if (bz.flag == true) {
                    // 包子铺调用 wait 方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后执行，包子铺生产包子
                // 交替生产两种包子
                if (count %2 == 0) {
                    // 生产 薄皮三鲜馅
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    // 生产 冰皮 牛肉大葱馅
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian+ "包子");
                // 生产包子需要3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 修改包子的状态为 true 有
                bz.flag = true;
                // 唤醒吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("包子铺已经生产好啦："+bz.pi+bz.xian+"包子，吃货可以开吃啦");
            }
        }

    }
}
