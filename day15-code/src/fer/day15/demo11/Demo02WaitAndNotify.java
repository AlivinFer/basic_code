package fer.day15.demo11;

/**
 * @author: Alivin Fer
 * @date: 2020/12/15 20:30
 **/

/*
    进入到 TimeWaiting(计时等待) 有两种方式
    1. 使用 sleep(long m) 方法，在毫秒值结束之后，线程睡醒进入到 Runnable/Blocked 状态
    2. 使用 wait(long m) 方法，wait 方法如果在毫秒值结束之后，还没有被 notify 唤醒，就会自动醒来
       进入 Runnable / Blocked 状态
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {

    }
}
