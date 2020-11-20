package fer.day10.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/11/13 20:22
 **/

/*
    StringBuilder 的常用方法
    public StringBuilder append(): 添加任意类型数据的字符串形式，并返回当前对象自身

 */
public class Demo02StringBuilder {

    public static void main(String[] args) {
        // 创建 StringBuilder 对象
        StringBuilder sbu = new StringBuilder();
        // 使用 append 方法往 StringBuilder 中添加数据
        // append 方法返回的是 this，调用方法的对象 bu
        StringBuilder sbu1 = sbu.append("abc"); // 把 sbu 的地址赋给了 sbu1
        System.out.println(sbu);
        System.out.println(sbu1);
        System.out.println(sbu == sbu1);

        sbu.append(1);
        sbu.append(true);
        sbu.append(2.5);
        sbu.append("qwer");
        sbu.append('尤');
        System.out.println(sbu);

        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        sbu1.append(1).append(2.2).append("ok").append('天');
        System.out.println(sbu1);

    }
}
