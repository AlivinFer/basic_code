package fer.day02.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 10:59
 *
 * 如何获得数组的长度，格式
 * 数组名称.length
 *
 * 这将会得到一个 int 数字，代表数组的长度
 *
 * 数组一旦创建，程序运行期间，长度不可改变
 **/

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println("arrayA[0]:" + arrayA[0]);

        int[] arrayB = {0, 10, 1, 2, 5, 6, 7, 12, 11, 22, 33, 16, 15};
        int len = arrayB.length;
        System.out.println("arrayB的数组长度为："+ len);
        System.out.println("=============");
        System.out.println(arrayB[3]);

        int[] arrayC = new int[3];
        // 3
        System.out.println(arrayC.length);
        arrayC = new int[5];
        // 5
        System.out.println(arrayC.length);
    }
}
