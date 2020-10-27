package fer.day04.demo03;

import java.util.Random;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 15:33
 **/

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
