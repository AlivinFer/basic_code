package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 15:45
 **/

// 根据匹配给定的正则表达式来拆分字符串

public class Demo05StringSplit {

    public static void main(String[] args) {
        String str = "Hello, Java: and Hello, world!";
        String str2 = "hh|ss||aa";
        // split() 方法 根据匹配给定的正则表达式来拆分字符串
        // 注意： . 、 $、 | 和 * 等转义字符，必须得加 \\。
        // 注意：多个分隔符，可以用 | 作为连字符。
        String[] str1 = str2.split("\\|", 3);
        // String[] str2 = str.split("o", 0);
        for (String s : str1) {
            System.out.print(s); // hhss|aa
        }





    }
}
