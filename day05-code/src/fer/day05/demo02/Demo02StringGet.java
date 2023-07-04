package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/21 21:14
 *
 * String 当中与获取相关的常用方法有：
 *
 * pubLic int length(): 获取字符串当中含有的字符个数，获取字符串长度
 * public String concat(String str): 将当前字符串和参数字符串拼接成为返回值新的字符串
 * public char charAt(int index): 获取指定索引位置的的单个字符
 * public int indexOf(String str): 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回 -1 值
 **/

public class Demo02StringGet {

    public static void main(String[] args) {

        // 获取字符串的长度
        int length = "what is your problem ?".length();
        // 22
        System.out.println(length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        // HelloWorld
        System.out.println(str3);
        System.out.println("==========");

        // 获取指定索引位置的单个字符
        char ch = "Beautiful".charAt(6);
        // f
        System.out.println("在6号索引位置的字符是：" + ch);
        System.out.println("===========");

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回 -1 值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        // 2
        System.out.println("llo 第一次出现的索引位置: " + index);
        int index1 = original.indexOf("a");
        // -1
        System.out.println("a 第一次出现的索引位置: " + index1);

    }
}
