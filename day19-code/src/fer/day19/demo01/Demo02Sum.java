package fer.day19.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/28 17:37
 **/
public class Demo02Sum {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
        System.out.println(factorial(5));
    }

    /*
        递归计算 1-n 之间的和
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }

    /*
        递归计算 n！
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
