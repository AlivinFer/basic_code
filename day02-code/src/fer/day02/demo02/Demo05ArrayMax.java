package fer.day02.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 19:14
 **/

// 求数组中最大的值
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 50, 100, 50, 0, 112};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
