package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/21 21:31
 *
 * 字符串的截取方法
 *
 * public String substring(int index): 截取从参数位置一致到字符串末尾，返回新字符串
 * public String substring(int begin, int end): 截取从 begin 开始，一直到 end 结束，中间的字符串（左闭右开）
 **/

public class Demo03Substring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        System.out.println("str1: " + str1);
        String str2 = str1.substring(4);
        // oWorld
        System.out.println("str2: " + str2);
        String str3 = str1.substring(4, 7);
        // oWo
        System.out.println("str3: " + str3);
        System.out.println("==========");

        // 下面这种写法，字符串的内容仍然没有改变
        // 下面有两个字符串："Hello"、 "Java"
        String strA = "Hello";
        System.out.println("strA: " + strA);
        System.out.println("strA 改变前哈希值: " + strA.hashCode());
        // 改变的实际上是地址值
        strA = "Java";
        System.out.println("strA 改变后哈希值: " + strA.hashCode());
    }
}
