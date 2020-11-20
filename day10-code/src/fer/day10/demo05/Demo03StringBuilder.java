package fer.day10.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/11/16 19:02
 **/

/*
    StringBuilder 和 String 可以想换转换
        String -> StringBuilder 可以使用 StringBuilder 的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder -> String 可以使用 StringBuilder 中的 toString 方法
            public String toString(): 将当前 StringBuilder 对象转换为 String 对象
 */

public class Demo03StringBuilder {

    public static void main(String[] args) {

        // String -> StringBuilder
        String str = "Hello";
        System.out.println("str:" + str);
        StringBuilder sbu = new StringBuilder(str);
        // 往 StringBuilder 中添加数据
        sbu.append("World");
        System.out.println("sbu:" + sbu);

        // StringBuilder -> String
        String s = sbu.toString();
        System.out.println("s:" + s);
    }
}
