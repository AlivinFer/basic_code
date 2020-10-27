package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 15:45
 **/

// 根据匹配给定的正则表达式来拆分字符串

public class Demo05StringSplit {

    public static void main(String[] args) {
        String str = "Hello, Java: and Hello, world!";
        String[] str1 = str.split(",", 2);
        String[] str2 = str.split("o", 0);
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i]);
        }





    }
}
