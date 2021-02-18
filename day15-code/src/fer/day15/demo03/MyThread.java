package fer.day15.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/12/7 20:40
 **/

/*
    获取线程的名称
        1. 使用 Thread 类中的方法 getName()
            String getName() 返回该线程的名称
        2. 可以先获取到当前正在执行的线程，使用线程中的方法 getName() 获取线程的名称
            static Thread currentThread() 返回当前正在执行的线程对象的引用
 */

// 定义一个 Thread 的子类
public class MyThread extends Thread {

    // 重写 Thread 类中的 run 方法，设置线程任务
    @Override
    public void run() {
       // 获取线程名称
//        String name = getName();
//        System.out.println(name);

        /*Thread t = Thread.currentThread();
        System.out.println(t);
        String name = t.getName();
        System.out.println(name);*/

        // 链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
