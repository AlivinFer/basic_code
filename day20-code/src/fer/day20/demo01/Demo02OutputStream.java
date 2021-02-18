package fer.day20.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 14:40
 **/

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("day20-code\\src\\fer\\day20\\demo02druid\\b.txt"));
        byte[] bytes = {65, 66, 67, 68, 69}; // ABCDE
        // byte[] bytes1 = {-65, -66, -67, -68, 69}; // 烤郊E
        // 如果写的第一个字节是正数(0-127),那么显示的时候会查询 ASCII 表
        // 负数的话，那第一个字节会和第二个字节组成一个中文显示，查询 系统默认码表(GBK)
        fos.write(bytes);
        // fos.write(bytes1);
        fos.close();
    }
}
