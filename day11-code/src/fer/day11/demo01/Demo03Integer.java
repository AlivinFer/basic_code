package fer.day11.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/16 19:57
 **/

/*
    基本数据类型与字符串类型之间的相互转换
    基本数据类型 -> 字符串(String)
        1. 基本数据类型的值 +"" 最简单的方法(常用)
        2. 包装类的静态方法 toString(参数)，不是 Object 类的 toString() 重载
            static String toString(int i) 返回一个表示指定整数的 String 对象
        3.  String 类的静态方法 valueOf(参数)
            static String valueOf(int i) 返回 int 参数的字符串表示形式

    字符串(String) -> 基本类型
        使用包装类的静态方法 parseXXX
        Integer 类：static int parseInt(String s)
        Double 类：static double parseDouble(String s)
 */

public class Demo03Integer {

    public static void main(String[] args) {

        // 基本数据 -> 字符串
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200); // 100200

        String s2 = Integer.toString(106);
        System.out.println(s2 + 250); // 106250

        String s3 = String.valueOf(300);
        System.out.println(s3 + 520); // 300520

        // 字符串 -> 基本类型
        int i = Integer.parseInt(s1); // 100
        System.out.println(i-10); // 90

    }
}
