package fer.day04.demo02;

import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 14:21
 *
 * 使用匿名对象作为方法的参数
 **/

public class Demo02Anonymous {
    public static void main(String[] args) {
        // 普通使用方式
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("输入的第一个值是：" + num1);
        methodParam(sc);

        // 匿名对象的方式
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("输入的第二个值是：" + num2);

        Scanner scRe = methodReturn();
        int num = scRe.nextInt();
        System.out.println("输入的第三个值是：" + num);

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
