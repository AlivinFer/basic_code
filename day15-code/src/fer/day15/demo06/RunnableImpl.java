package fer.day15.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/12/13 20:23
 **/

// 1. 创建一个 Runnable 接口的实现类
public class RunnableImpl implements Runnable{
    // 2. 在实现类中重写 Runnable 接口的 run 方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
