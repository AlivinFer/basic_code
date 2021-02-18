package fer.day19.demo01;

import java.io.File;

/**
 * @author: Alivin Fer
 * @date: 2020/12/29 12:23
 **/

/*
    递归打印多级目录
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\IntelliJ IDEA Community Edition 2019.1.3\\" +
                "basic_code\\day19-code\\src\\fer\\day19\\movie");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            }else
                System.out.println(f);
        }
    }
}
