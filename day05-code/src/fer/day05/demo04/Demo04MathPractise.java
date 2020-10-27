package fer.day05.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/25 20:02
 **/

/*
题目：
计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个
 */

public class Demo04MathPractise {

    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        int count = 0;

        for(int i = (int) min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count ++;
            }
        }
        System.out.println("总共有：" + count);
    }
}
