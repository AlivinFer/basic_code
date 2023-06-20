package fer.day02.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 19:23
 *
 * 不使用新的数组，将数组元素反转
 **/

public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // 遍历原数组元素
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("============");

        // 进行反转
        for(int min = 0, max = array.length-1; min < max; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 打印反转后的数组
        for (int value : array) {
            System.out.println(value);
        }
    }
}
