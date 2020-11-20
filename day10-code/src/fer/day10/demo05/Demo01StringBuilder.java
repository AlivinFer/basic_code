package fer.day10.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/11/13 20:13
 **/

/*
    java.lang.StringBuilder 类：字符串缓冲区，可以提高字符串的效率
 */

// 构造方法
public class Demo01StringBuilder {

    public static void main(String[] args) {

        // 空参数构造类
        StringBuilder sbu = new StringBuilder();
        System.out.println("sbu:" + sbu);  // 返回空值 sbu:

        // 带字符串的构造方法
        StringBuilder sbu2 = new StringBuilder("abc");
        System.out.println("sbu2:" + sbu2); // sbu2:abc



    }
}
