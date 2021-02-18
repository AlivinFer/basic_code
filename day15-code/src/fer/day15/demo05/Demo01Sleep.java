package fer.day15.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/12/9 21:27
 **/

/*
    public static void sleep(long millis): 使当前正在执行的线程以指定的毫秒数暂停(暂时停止运行)
    毫秒数结束之后，线程继续执行
 */

public class Demo01Sleep {
    public static void main(String[] args) {
        // 模拟秒表
        for (int i = 0; i <= 60; i++) {
            System.out.println(i);

            // 使用 Thread 类的 sleep 方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
