package fer.day10.demo01;

// util 是 java 的工具类，需要导包
import java.util.Objects;

/**
 * @author: Alivin Fer
 * @date: 2020/11/11 21:03
 **/

/*
Objects 类的 equals 方法：对两个对象进行比较，防止空指针异常
 */
public class Demo03Objects {

    public static void main(String[] args) {
        String s1= null;
        String s2 = "abc";
        String s3 = "abc";

        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
        System.out.println(Objects.equals(s2, s3));
    }
}
