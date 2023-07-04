package fer.day05.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 16:11
 *
 * 定义一个方法：把数组 {1， 2， 3} 按照指定格式拼接成一个字符串
 * [word1#word#2word3]
 **/

public class Demo06StringPractise {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String result = fromArrayToString(array);
        System.out.print(result);

    }

    public static String fromArrayToString(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str.append("word").append(array[i]).append("]");
            } else {
                str.append("word").append(array[i]).append("#");
            }
        }
        return str.toString();
    }
}
