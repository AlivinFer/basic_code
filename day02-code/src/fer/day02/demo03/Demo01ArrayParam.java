package fer.day02.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 19:45
 **/

// 将数组作为方法参数传递
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(array);  // 地址值

        printArray(array);  // 传递进去的就是 array 当中保存的地址值
        System.out.println("=======AAA=======");
        printArray(array);
        System.out.println("=======BBB=======");
        printArray(array);
    }

    public static void printArray(int[] array){
        System.out.println("printArray方法收到的参数是：");
        System.out.println(array);  // 地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
