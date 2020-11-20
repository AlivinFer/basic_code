package fer.day06.demo11;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/28 19:56
 **/

public class Manager extends User {

    public Manager() {
        super();
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主剩多少钱
        int leftMoney = super.getMoney();  // 群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足，请充值");
            return redList; // 返回空集合
        }

        // 扣钱
        super.setMoney(leftMoney - totalMoney);

        // 发红包需要拆分成 count 份
        int avg = totalMoney / count;  // 平均没人多少钱
        int mod = totalMoney % count;  // 余数，也就是多余的零头

        // 除不开的零头包含在最后一个人的红包中
        // 把红包一个一个放到集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }


}
