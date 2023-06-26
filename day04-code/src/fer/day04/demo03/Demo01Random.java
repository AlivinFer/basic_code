package fer.day04.demo03;

import java.util.Random;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 14:55
 *
 * Random 类用来生成随机数字。
 *
 * 1. 导包
 * import java.util.Random
 *
 * 2. 创建
 * Random r = new Random();
 *
 * 3. 使用
 * 获取一个随机的 int 数字（范围是 int 所有范围，有正负两种）：int num = r.nextInt();
 * 获取一个随机的 int 数字 (参数代表了范围，左闭右开区间)：int num = r.nextInt(3);
 * 实际上代表的含义是：[0:3)，
 **/

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("生成的随机数是：" + num);

        int num1 = r.nextInt(3);
        System.out.println("生成的随机数是：" + num1);
    }
}
