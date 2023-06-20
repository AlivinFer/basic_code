package fer.day02.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 11:09
 *
 * 遍历数组
 **/

public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 20, 25, 30, 35};
        // 快捷方式 数组名称.fori,自动生成
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===========");

        // 更简洁的方式遍历
        for (int j : array) {
            System.out.println(j);
        }
    }
}
