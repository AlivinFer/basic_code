package fer.day05.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/25 19:46
 *
 * Math 类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
 *
 * public static double abs(double num):  获取绝对值
 *
 * public static double ceil(double num):  向上取整
 *
 * public static double floor(double num):  向下取整
 *
 * public static long round(double num):  四舍五入
 *
 * Math.PI 代表近似的圆周率常量
 **/

public class Demo03Math {

    public static void main(String[] args) {
        // 获取绝对值
        // 3.14
        System.out.println(Math.abs(3.14));
        // 0
        System.out.println(Math.abs(0.0));
        // 5
        System.out.println(Math.abs(-5));
        // 2.5
        System.out.println(Math.abs(-2.5));
        System.out.println("==============");

        // 向上取整
        // 3.0
        System.out.println(Math.ceil(2.1));
        // 4.0
        System.out.println(Math.ceil(3.5));
        // 3.0
        System.out.println(Math.ceil(3.0));

        // 向下取整
        // 3.0
        System.out.println(Math.floor(3.9));
        // 3.0
        System.out.println(Math.floor(3.0));

        // 四舍五入
        // 4
        System.out.println(Math.round(3.6));
        // 3
        System.out.println(Math.round(3.15));

        // PI 的使用
        System.out.println(Math.PI);
    }
}
