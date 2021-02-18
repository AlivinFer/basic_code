package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 14:49
 **/

/*
String 当中与转换相关的常用方法有：

public char[] toCharArray(): 将当前字符串拆分成字符数组作为返回值
public byte[] getBytes(): 获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence newSting):
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
 */

public class Demo04StringConvert {

    public static void main(String[] args) {
        // 转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);  // H
        System.out.println(chars[1]);  // e
        System.out.println(chars.length);  // 5
        System.out.println("==============");

        // 转换成为字节数组
        byte[] bytes = "Java".getBytes();
        System.out.println(bytes[0]); // 74
        System.out.println(bytes.length); // 4
        System.out.println("==============");

        // 字符串的内容替换
        String str1 = "What are you talking about!".replace("a", "*");
        System.out.println(str1); // Wh*t *re you t*lking *bout!
        System.out.println();
        System.out.println("=============");

        String lang1 = "你到底会不会玩呀！我打你大爷的，草了，fuck you！";
        String lang2 = lang1.replace("打你大爷的，草了", "爱你宝贝");
        String lang3 = lang2.replace("fuck you", "love you");
        System.out.println(lang3);

    }
}
