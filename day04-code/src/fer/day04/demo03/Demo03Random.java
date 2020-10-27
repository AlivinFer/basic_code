package fer.day04.demo03;

import java.util.Random;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 15:37
 **/

/*
题目要求：
根据 int 变量 n 的值，来获取随机数字，范围是 [1,n],可以取到 1 也可以取到 n
 */

public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {

            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}
