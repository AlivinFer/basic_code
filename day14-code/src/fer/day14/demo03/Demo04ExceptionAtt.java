package fer.day14.demo03;

import java.util.List;

/**
 * @author: Alivin Fer
 * @date: 2020/12/5 16:00
 **/

/*
    多个异常如何处理
        1. 多个异常分别处理
        2. 多个异常一次捕获，多次处理
        3. 多个异常一次捕获一次处理
 */
public class Demo04ExceptionAtt {
    public static void main(String[] args) {

        // 多个异常分别处理
        /*try {
            int[] arr = {1, 2, 3};
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/

        // 2. 多个异常一次捕获，多次处理
       /* try {
            int[] arr = {1, 2, 3};
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            System.out.println(arr[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/

        // 3. 多个异常一次捕获一次处理
        /*try {
            int[] arr = {1, 2, 3};
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            System.out.println(arr[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        int[] arr = {1, 2, 3};
        // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println(arr[3]);

        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.get(3));

        System.out.println("后续代码");
    }
}
