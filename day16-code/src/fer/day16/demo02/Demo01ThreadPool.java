package fer.day16.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Alivin Fer
 * @date: 2020/12/21 16:18
 **/

/*
    线程池：JDK1.5 之后提供
    java.util.concurrent.Executors：线程池的工厂类，用来生成线程池
    Executors 类中的静态方法
        static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
        参数：
            int nThreads：创建线程池中包含的线程数量
        返回值：
            ExecutorService 接口，返回的是 ExecutorService 接口的实现类对象，可以使用 ExecutorService 接口接收(面向接口编程)
     java.util.concurrent.ExecutorService：线程池接口
        用来从线程池中获取线程，调用 start 方法，执行线程任务
            submit(Runnable task) 提交一个 Runnable 任务用于执行
        关闭/销毁 线程池的方法
            void shutdown()
     线程池的使用步骤：
        1. 使用线程池的工厂类 Executors 里边提供的静态方法 newFixedThreadPool 生产一个指定线程数量的线程池
        2. 创建一个类，实现 Runnable 接口，重写 run 方法，设置线程任务
        3. 调用 ExecutorService 中的方法 submit，传递线程任务(实现类)，开启线程，执行 run 方法
        4. 调用 ExecutorService 中的方法 shutdown 销毁线程池(不建议执行)
 */

public class Demo01ThreadPool {
    public static void main(String[] args) {
        // 1. 使用线程池的工厂类 Executors 里边提供的静态方法 newFixedThreadPool 生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        // 3. 调用 ExecutorService 中的方法 submit，传递线程任务(实现类)，开启线程，执行 run 方法
        es.submit(new RunnableImpl());
        // 线程池会一直开启，使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        // 4. 调用 ExecutorService 中的方法 shutdown 销毁线程池(不建议执行)
        es.shutdown();

        es.submit(new RunnableImpl()); // 抛出异常，线程池没了，就不能获取线程
    }
}
