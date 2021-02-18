package fer.day16.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/16 20:08
 **/
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃："+bz.pi+bz.xian+"的包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把："+bz.pi+bz.xian+"的包子吃完了，包子铺已经开始生产不同的包子");
                System.out.println("===========================");
            }
        }
    }
}
