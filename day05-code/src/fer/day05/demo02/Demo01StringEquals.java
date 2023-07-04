package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/19 21:25
 *
 * == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
 *
 * public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给 true;
 * 否则返回 false
 *
 * 注意事项：
 * 1. 任何对象都能用 Object 进行接收
 * 2. equals 方法具有对称性，也就是 a.equals(b) 和 b.equals(a) 效果一样
 * 3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
 *
 * public boolean equalsIgnoreCase(String str): 忽略大小写，进行内容比较
 **/

public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        // true
        System.out.println(str1.equals(str2));
        // true
        System.out.println(str2.equals(str3));
        // true
        System.out.println(str3.equals(str1));
        // true
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        // false 严格区分大小写
        System.out.println(str4.equals(str1));
        System.out.println("============");

        String str5 = null;
        // false
        System.out.println("abc".equals(str5));
        // 不推荐，报错，空指针异常
//        System.out.println(str5.equals("abc"));
        System.out.println("==========");

        String strA = "QweR";
        String strB = "qWer";
        // true, 忽略大小写
        System.out.println(strA.equalsIgnoreCase(strB));

    }
}
