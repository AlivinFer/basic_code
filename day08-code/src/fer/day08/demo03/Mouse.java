package fer.day08.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 20:27
 **/

public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
