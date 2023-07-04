package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 14:49
 *
 * String 当中与转换相关的常用方法有：
 *
 * public char[] toCharArray(): 将当前字符串拆分成字符数组作为返回值
 * public byte[] getBytes(): 获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString, CharSequence newSting):
 * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
 **/

public class Demo04StringConvert {

    public static void main(String[] args) {
        // 转换成为字符数组
        char[] chars = "Hello".toCharArray();
        // H
        System.out.println("第一位值是: " + chars[0]);
        // e
        System.out.println("第二位值是: " + chars[1]);
        // 5
        System.out.println("数组长度是: " + chars.length);
        System.out.println("==============");

        // 转换成为字节数组
        byte[] bytes = "Java".getBytes();
        // 74
        System.out.println("ASCII值为: " + bytes[0]);
        // 4
        System.out.println("数组长度为: " + bytes.length);
        System.out.println("==============");

        // 字符串的内容替换
        String str1 = "What are you talking about!".replace("a", "*");
        // Wh*t *re you t*lking *bout!
        System.out.println("str1: " + str1);
        System.out.println("=============");

        String lang1 = "一曲终了、繁花散尽、伊人已逝，只余一声空叹";
        String lang2 = lang1.replace("繁花散尽", "曲终离散");
        System.out.println(lang2);
        String lang3 = lang1.replace("aaa", "曲终离散");
        // 如目标字符不存在，则返回原字符串
        System.out.println(lang3);
    }
}
