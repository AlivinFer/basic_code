package fer.day04.demo02;

import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 14:21
 **/

// 使用匿名对象作为方法的参数
public class Demo02Anonymous {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象的方式
//        int num1 = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num1);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
