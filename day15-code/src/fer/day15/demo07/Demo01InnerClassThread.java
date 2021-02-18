package fer.day15.demo07;

/**
 * @author: Alivin Fer
 * @date: 2020/12/13 21:18
 **/

/*
    匿名内部类方式实现线程的创建

    匿名：没有名字
    内部类：写在其它类内部的类

    匿名内部类作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象一步完成
        把实现类接口，重写接口中的方法，创建实现类对象合成一步完成
    匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

    格式：
        new 父类/接口(){
            重复父类/接口中的方法
        };
 */

public class Demo01InnerClassThread {
    public static void main(String[] args) {
        // 创建内部类
        new Thread(){
            // 重写 run 方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"小西");
                }
            }
        }.start();

        // 线程的接口 Runnable
        Runnable r = new Runnable(){
            // 重写 run 方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"程序猿");
                }
            }
        };
        new Thread(r).start();

        // 简化接口
        new  Thread(new Runnable(){
            // 重写 run 方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"憨憨");
                }
            }
        }).start();
    }
}
