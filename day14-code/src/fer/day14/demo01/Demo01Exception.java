package fer.day14.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Alivin Fer
 * @date: 2020/12/3 20:27
 **/

/*
    java.lang.Throwable: 是 java 语言中所有错误或异常的超类
        Exception：编译器异常，进行编译(写代码) java 程序出现的问题
            RuntimeException：运行期异常，java 程序运行过程中出现的问题
 */

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        // Exception：编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd"); // 用来格式化日期
        // 1. 抛出异常，交给虚拟机来处理
        Date date = null;
        // 2. 使用 try catch 处理异常，使得异常外的代码可以执行
        try {
            date = sdf.parse("1999 - 07-02"); // 把字符串格式的日期，解析为 Date 格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("loading....");
    }
}
