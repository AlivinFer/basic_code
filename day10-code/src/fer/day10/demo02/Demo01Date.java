package fer.day10.demo02;

import java.util.Date;
/**
 * @author: Alivin Fer
 * @date: 2020/11/12 16:50
 **/

/*
类 Date 表示特定的瞬间，精确到毫秒。
毫秒：千分之一秒 1000毫秒=1秒
 */

public class Demo01Date {

    public static void main(String[] args) {
        // 获取 1970 年 1 月 1 日 到当前系统时间经历了多少毫秒
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
    }
}
