package fer.day05.demo02;

import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 18:45
 *
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数
 * 种类有：大写字母、小写字母、数字、其他
 **/

public class Demo07StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从键盘输入一个字符串：");
        // 获取键盘输入的一个字符串
        String input = sc.next();

        // 大写字母
        int countUpper = 0;
        // 小写字母
        int countLower = 0;
        // 数字
        int countNumber = 0;
        // 其他
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            // 当前单个字符
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母个数：" + countUpper);
        System.out.println("小写字母个数：" + countLower);
        System.out.println("数字个数：" + countNumber);
        System.out.println("其他字符个数：" + countOther);
    }
}
