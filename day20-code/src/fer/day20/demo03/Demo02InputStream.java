package fer.day20.demo03;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 16:09
 **/

/*
    字节输入流一次读取多个字节的方法
        int read(byte[] b) 从输入流中读取一定数量的字节，并将起存储在缓冲区数组 b 中
    注意：
        1. 方法的参数 byte[] 作用：
            起到缓冲作用，存储每次读取到的多个字节
            数组的长度一般定义为 1024 或其整数倍
        2. 方法的返回值 int 意义：
            每次读取的有效字节个数
    String 类的构造方法
        String(byte[] bytes): 把字节数组转换为字符串
        String(byte[] bytes, int offset, int length): 把一部分转换为字符串
 */

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream("day20-code\\src\\fer\\day20\\demo02druid\\b.txt");
        byte[] bytes = new byte[1024];
        int len = 0; // 用来记录读取的有效字节个数
        // 当读取完文件后，返回 -1
        while ((len = fls.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fls.close();
    }
}
