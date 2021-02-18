package fer.day18.demo01;

import java.io.File;

/**
 * @author: Alivin Fer
 * @date: 2020/12/28 16:30
 **/

/*
    File 类获取功能的方法
 */

public class Demo03File {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\fer\\day18\\Demo03File.java");
        // 获取此 File 的绝对路径名字字符串
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);

        // 返回此 File 表示的文件或目录的名称
        String name = f1.getName();
        System.out.println(name); // Demo03File.java

        // 将 File 转换为路径名字串
        String path = f1.getPath();
        System.out.println(path);

        // 返回此 File 表示的文件的长度，以字节为单位
        // 注意：文件夹是没有大小概念，不能获取文件夹的大小
        //       如果构造方法中给出的路径不存在，那么 length 方法返回 0
        File f2 = new File("C:\\Users\\94212\\Pictures\\Saved Pictures\\wh.jpg");
        long length = f2.length();
        System.out.println(length);

    }
}
