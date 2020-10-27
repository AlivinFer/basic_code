package fer.day04.demo01;

import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/10/14 21:25
 **/

/*
题目：
键盘输入三个 int 数字，求出其中最大的值
 */

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = c > temp ? c : temp;
        System.out.println("最大值为： " + max);
    }
}
