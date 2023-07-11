package fer.day08.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 20:12
 **/

public interface Usb {

    /**
     * 打开设备
     */
    public abstract void open();

    /**
     * 关闭设备
     */
    public abstract void close();
}
