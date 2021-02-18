package fer.day14.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/3 20:59
 **/

// Error
public class Demo03Error {
    public static void main(String[] args) {
        /*
         java.lang.OutOfMemoryError: Java heap space
         内存溢出的错误，创建的数组太大了，超出了给 JVM 分配的内存
         */
        int[] arr = new int[1024*1024*1024];
        // 必须修改代码，创建的数组小一点
        System.out.println("loading...");
    }
}
