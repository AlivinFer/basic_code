package fer.day16.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/12/21 16:32
 **/

// 2. 创建一个类，实现 Runnable 接口，重写 run 方法，设置线程任务
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
