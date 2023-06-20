package fer.day02.demo01;

import java.util.Arrays;

/**
 * @author: Alivin Fer
 * @date: 2020/10/9 20:31
 *
 * 直接打印数组名称，得到的是数组对应的：内存地址哈希值
 *
 * 访问数组元素的格式：数组名称[索引值]
 **/

public class Demo04ArrayUse {
    public static void main(String[] args) {
        // 静态初始化的省略模式
        int[] arrayA = {10, 20, 30};

        System.out.println(arrayA);

        // 直接打印数组中的元素
        // 10
        System.out.println(arrayA[0]);
        // 20
        System.out.println(arrayA[1]);
        // 30
        System.out.println(arrayA[2]);
        System.out.println("========");

        // 传给一个变量
        int num = arrayA[1];
        System.out.println(num);
    }
}
