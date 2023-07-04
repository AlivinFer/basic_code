package fer.day05.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/19 20:55
 *
 * 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池当中
 *
 * 对于基本类型来说， == 是进行数值的比较
 * 对于引用类型来说， == 是进行 [地址值] 的比较
 **/

public class Demo02StringBool {
    public static void main(String[] args) {
        // 放入的是字符串常量池里
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        // true
        System.out.println(str2 == str1);
        // false
        System.out.println(str1 == str3);
        // false
        System.out.println(str2 == str3);
    }
}
