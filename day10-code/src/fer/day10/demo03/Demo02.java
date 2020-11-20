package fer.day10.demo03;

import java.util.Calendar;

/**
 * @author: Alivin Fer
 * @date: 2020/11/12 21:07
 **/
public class Demo02 {

    private static void demo01() {
        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);

        Calendar c2 = Calendar.getInstance();
        int month = c2.get(Calendar.MONTH);
        System.out.println(month);

        Calendar c3 = Calendar.getInstance();
        int day = c3.get(Calendar.DATE);
        System.out.println(day);
    }
}
