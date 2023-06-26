package fer.day04.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: Alivin Fer
 * @date: 2020/10/18 17:29
 *
 * 用一个大集合存入 20 个随机数字，然后筛选其中的偶数元素，放到小集合当中
 * 要求使用自定义的方法来实现筛选
 **/

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();

        int n = 20;
        for (int i = 0; i < n; i++) {
            // 1~100
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数的个数有多少个：" + smallList.size());
        for (Integer integer : smallList) {
            System.out.println(integer);
        }
    }

    /**
     * 接收大集合参数，返回小集合结果
     */
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int num : bigList) {
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
