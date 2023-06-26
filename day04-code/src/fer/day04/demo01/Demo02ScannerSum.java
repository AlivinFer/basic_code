package fer.day04.demo01;

import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/10/14 21:06
 *
 * 键盘输入两个 int 数字，并且求出和值
 **/

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner str1 = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = str1.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = str1.nextInt();

        int result = num1 + num2;

        System.out.println("结果是：" + result);


    }
}
