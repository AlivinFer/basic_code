package fer.day08.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 20:27
 **/

// 键盘就是一个 USB 设备
public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
