package fer.day20.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 15:09
 **/

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        // 添加 append：true , 不会覆盖原文件，直接在原文件末尾追加数据
        FileOutputStream fos = new FileOutputStream("day20-code\\src\\fer\\day20\\demo02druid\\c.txt", true);
        byte[] bytes = "你好".getBytes();
        for (int i = 0; i < 10; i++) {
            fos.write(bytes);
            fos.write("\r\n".getBytes());
        }
        fos.write(bytes);
        fos.close();
    }
}
