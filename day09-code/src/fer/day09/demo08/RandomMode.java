package fer.day09.demo08;

import fer.day09.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: Alivin Fer
 * @date: 2020/11/9 20:34
 **/
public class RandomMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        // 随机分配，有可能多，有可能少
        // 最少1分钱，最多不超过“剩下金额平均数的2倍”
        // 假设第一次发红包 10 元，发 3 个，随机范围是 0.01~6.66 元
        // 第一次发完之后，剩下的至少是 3.34 元
        // 此时还需要再发 2 个红包
        // 此时的再发范围应该是 0.01元~3.34元（取不到右边，剩下 0.01）

        // 公式：1 + random.nextInt(leftMoney / leftCount * 2); 首先创建一个随机数生成器
        Random r = new Random();
        // 额外定义两个变量，分别代表剩下多少钱，剩下多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // 随机发前 n-1 个，最后一个不需要随机
        for (int i = 0; i < totalCount - 1; i++) {
            // 按照公式生成随机金额
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            // 将一个随机红包放入集合
            list.add(money);
            // 剩下的金额越发越少
            leftMoney -= money;
            leftCount -= 1;
        }
        list.add(leftMoney);
        return list;
    }
}
