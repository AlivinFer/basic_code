package fer.day08.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 20:52
 **/

public class DemoMain {

    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        // 准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        // 首先向上转型 左边是接口，右边是实现类（多态写法）
        Usb usbMouse = new Mouse();
        // 参数是 USB 类型
        computer.useDevice(usbMouse);

        // 创建一个 USB 键盘 没有使用多态的写法
        Keyboard keyboard = new Keyboard();
        // 方法参数是 USB 类型，传递进去的是实现类对象 正确写法,也发生了向上模型
        computer.useDevice(keyboard);
        computer.useDevice(new Keyboard());
        // 使用子类对象，匿名对象，也可以
        computer.useDevice(new Keyboard());

        computer.powerOff();
        System.out.println("==============");

        // 正确写法，double --> double
        method(10.0);
        // 正确写法，int -- > double
        method(10);
        int a = 30;
        // 正确写法，int -- > double
        method(a);
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
