package fer.day15.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/12/7 12:50
 **/

// 1. 创建一个 Thread 类的子类
public class MyThread extends Thread {
    // 2. 在 Thread 类的子类中重写 Thread 类中的 run 方法，设置线程任务(开启线程要做什么？)
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run:" + i);
        }
    }
}
