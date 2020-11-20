package fer.day10.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Alivin Fer
 * @date: 2020/11/12 18:58
 **/

/*
来源：java.text.DataFormat
是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
作用：
    格式化(也就是将 日期 -> 文本)、解析(文本 -> 日期)
成员方法：
    String format(Date date) 按照指定的格式，把 Date 日期，格式化为符合模式的字符串
    Date parse(String source) 把符合模式的字符串，解析为 Date 日期
DateFormat 类是一个抽象类，无法直接创建对象使用，可以使用 DateFormat 类的子类
 */
public class Demo02DateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    // String format(Date date) 方法
    private static void demo01() {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf1.format(date);
        System.out.println(date);
        System.out.println(d);
    }

    // Date parse(String source) 方法
    // 此方法如果字符串和构造方法的模式不一样，那么程序就会抛出异常
    // 解决：可通过 throws 继续抛出这个异常，要么 try catch 自己处理
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf2.parse("2020年11月12日 20时28分45秒");
        System.out.println(date);
    }
}
