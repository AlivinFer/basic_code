package fer.day20.demo05;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 19:48
 **/

/*
    java.io.Reader: 字符输入流，是字符输入流最顶层的父类，定义了一些共性的成员方法，是一个抽象类
    FileReader：文件字符输入流
    作用：把硬盘文件中的数据以字符的方式读取到内存中
 */

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day20-code\\src\\fer\\day20\\demo02druid\\b.txt");
        char[] cs = new char[1024]; // 存储读取到的多个字符
        int len = 0;
        while ((len = fr.read(cs)) != -1) {
            System.out.println((char)len);
        }

        fr.close();
    }
}
