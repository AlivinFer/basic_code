package fer.day15.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/12/9 15:56
 **/

public class Demo01SetThreadName {
    public static void main(String[] args) {
        // 开启多线程
        MyThread mt = new MyThread();
        mt.setName("小西");
        mt.start();

        // 开启多线程
        new MyThread().start();
    }
}
