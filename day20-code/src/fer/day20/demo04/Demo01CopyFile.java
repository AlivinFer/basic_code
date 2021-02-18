package fer.day20.demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 16:46
 **/

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fls = new FileInputStream("C:\\Users\\94212\\Pictures\\Saved Pictures\\wh.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\IntelliJ IDEA Community Edition 2019.1.3\\" +
                "basic_code\\day20-code\\src\\fer\\day20\\demo04\\wh.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fls.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fls.close();
        long e = System.currentTimeMillis();
        System.out.println("复制时间：" + (e-s) + "毫秒");
    }
}
