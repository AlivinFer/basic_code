package fer.day05.demo02;

import java.util.Arrays;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 15:45
 *
 * 根据匹配给定的正则表达式来拆分字符串
 **/

public class Demo05StringSplit {

    public static void main(String[] args) {
        String str = "Hello, Java: and Hello, world!";
        System.out.println(Arrays.toString(str.split(":", 3)));
        // split() 方法 根据匹配给定的正则表达式来拆分字符串
        // 注意： . 、 $、 | 和 * 等转义字符，必须得加 \\。
        // 注意：多个分隔符，可以用 | 作为连字符。
        String str2 = "hh|.ss||aa";
        String[] str1 = str2.split("\\|\\.", 8);
        // limit即使大于可分割的字符串，最终只会返回能够分割的字符数组
        System.out.println("分割后的数组为: " + Arrays.toString(str1));
        for (String s : str1) {
            // hh ss||aa
            System.out.println(s);
        }
    }
}
