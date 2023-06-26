package fer.day04.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 15:59
 *
 * 用代码模拟猜数字的小游戏
 *
 * 思路：
 * 1. 首先需要产生一个随机数字，并且一旦产生就不再变化 用 Random 的 nextInt 方法
 * 2. 需要键盘输入，所以用到了 Scanner
 * 3. 获取键盘输入的数字，用 Scanner 当中的 nextInt 方法
 * 4. 已经得到了两个数字，判断（if）一下
 * 5. 重试就是再来一次，循环次数不确定，用 while(true).
 **/

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        // 随机生成 [1, 100] 内的数
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("请输入你猜测的数字：");
            // 键盘输入猜测的数字
            int guessNum = sc.nextInt();
            count += 1;
            if (guessNum > randomNum) {
                System.out.println("你猜测的数字太大，请重试。");
            }else if (guessNum < randomNum) {
                System.out.println("你猜测的数组太小，请重试。");
            }else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
            if (count == 10) {
                System.out.println("次数用完，请充值！");
                break;
            }

        }
        System.out.println("游戏结束。");
    }
}
