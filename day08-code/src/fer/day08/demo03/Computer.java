package fer.day08.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 20:23
 **/

public class Computer {

    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    /**
     * 使用 USB 设备的方法，使用接口作为方法的参数
     */
    public void useDevice(Usb usb) {
        // 打开设备
        usb.open();
        // 一定要先判断
        if (usb instanceof Mouse) {
            // 向下转型
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            // 向下转型
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        // 关闭设备
        usb.close();
    }
}
