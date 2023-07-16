package fer.day09.demo08;

import fer.day09.red.OpenMode;

/**
 * @author: Alivin Fer
 * @date: 2020/11/9 19:13
 *
 * 发红包案例：
 * 框架已经搭好，需要做的是：
 *     1. 设置一下程序的标题，通过构造方法的字符串参数
 *     2. 设置群主名称
 *     3. 设置分发策略：平均还是随机?
 *
 *
 * 分发策略：
 *     1. 普通红包（平均）：totalMoney / totalCount,余数放在最后一个红包当中
 *     2. 手气红包（随机）：最少1分钱，最多不超过平均数的 2 倍，应该越发越少
 **/

public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("生日红包");
        // 设置群主名称
        red.setOwnerName("尤尤");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // 随机红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
