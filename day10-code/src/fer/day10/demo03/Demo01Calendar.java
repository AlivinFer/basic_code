package fer.day10.demo03;

import java.util.Calendar;

/**
 * @author: Alivin Fer
 * @date: 2020/11/12 20:56
 **/
/*
    java.util.Calendar 类：日历类
    Calendar 类是一个抽象类
    它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法
    Calendar 提供了一个类方法 getInstance，以获得此类型的一个通用的对象。
    Calendar 的 getInstance 方法返回一个 Calendar 对象
 */
public class Demo01Calendar {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();  // 多态
        System.out.println(c);
    }
}
