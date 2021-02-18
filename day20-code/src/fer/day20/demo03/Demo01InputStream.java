package fer.day20.demo03;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 15:21
 **/
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream("day20-code\\src\\fer\\day20\\demo02druid\\a.txt");
        // 读取文件中的一个字节并返回，读取到文件的末尾返回 -1
        int len = fls.read();
        System.out.println(len);
        fls.close();
    }
}
