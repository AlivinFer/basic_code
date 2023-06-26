package fer.day04.demo01;

import java.util.Scanner;  // 1. 创建

/**
 * @author: Alivin Fer
 * @date: 2020/10/13 21:20
 *
 * Scanner 类的功能：可以实现键盘输入数据，到程序中。
 *
 * 引用类型的一般使用步骤：
 *
 * 1. 导包
 * import 包路径.类名称
 * 如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语不写
 * 只有 java.lang 包下的内容不需要导包，其他的包都需要 import 语句
 *
 * 2. 创建
 * 类名称 对象名 = new 类名称();
 *
 * 3. 使用
 * 对象名.成员方法名()
 *
 * 获取键盘输入的一个 int 数字：int num = sc.nextInt();
 * 获取键盘输入的一个字符串： String str = sc.next();
 **/

public class Demo01Scanner {
    public static void main(String[] args) {
        // 2. 创建
        // System.in 代表从键盘进行输入 (其实从键盘输入的都是字符串，只不过会转换成对应的类型)
        Scanner sc = new Scanner(System.in);

        // 3. 获取键盘输入的 int 数字
        System.out.print("输入数字：");
        int num = sc.nextInt();
        System.out.println("输入的 int 数字是：" + num);

        // 4. 获取键盘输入的字符串
        System.out.print("输入字符串：");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);


    }

}
