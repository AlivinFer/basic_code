package fer.day15.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/12/9 15:55
 **/

/*
    设置线程的名称：(了解)
        1. 使用 Thread 类中的方法 setName(名字)
            void setName(String name) 改变线程名称，使之与参数 name 相同
        2. 创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，
           让父类(Thread)给子线程起一个名字
            Thread(String name) 分配新的对象
 */

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }

}
