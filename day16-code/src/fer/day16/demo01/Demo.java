package fer.day16.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/16 20:17
 **/

public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
