package fer.day09.demo08;

import fer.day09.red.RedPacketFrame;

/**
 * @author: Alivin Fer
 * @date: 2020/11/9 19:33
 **/
public class MyRed extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
