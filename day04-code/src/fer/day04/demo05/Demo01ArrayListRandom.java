package fer.day04.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: Alivin Fer
 * @date: 2020/10/16 18:48
 *
 * 生成 6 个 1~33 之间的随机整数，添加到集合，遍历集合
 *
 * 思路：
 * 1. 需要存储 6 个数字，创建一个集合
 * 2. 产生随机数，需要用到 Random
 * 3. 用循环 6 次，来产生 6 个随机数：for 循环
 * 4. 循环内调用 r.nextInt(int n), 参数是 33, 0~32,整体 +1 才是 1~33
 * 5. 把数字添加到集合中：add
 * 6. 遍历集合：for、size、get
 **/

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        int n = 6;
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
