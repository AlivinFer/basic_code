package fer.day05.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/19 20:09
 **/

/*
java.lang.Sting 类代表字符串。
API 当中说。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
就是说：程序当中所有的双引号字符串，都是 String 类的对象。(就算没有 new，也照样是)

字符串的特点：
1. 字符串的内容永不改变。 【重点】
2. 正是因为字符串不可改变，所以字符串是可以共享使用的。
3. 字符串效果上相当于是 char[] 字符数组，但是底层原理是 byte[] 字节数组

创建字符串的常见 3+1 种方式
三种构造方法：
public String(): 创建一个空白字符串，不含有任何内容
public String(char[] array): 根据字符数组的内容，来创建对应的字符串
public String(byte[] array): 根据字节数组的内容，来创建对应的字符串

一种直接创建：
String str = "Hello";

注意：直接写上双引号，JVM 会自动帮你 new
 */

public class Demo01String {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        // 根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        // 根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);
    }
}
