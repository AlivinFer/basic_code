package fer.day19.demo01;

import java.io.File;

/**
 * @author: Alivin Fer
 * @date: 2020/12/29 12:44
 **/

/*
    FileFilter 的用法
    java.io.FileFilter 接口：用于抽象路径名(File 对象)的过滤器
        作用：用来过滤文件(File 对象)
        抽象方法：用来过滤文件的方法
            boolean accept(File pathname)：测试指定抽象路径名是否应该包含在某个路径名列表中
            参数：
                File pathname：使用 listFiles 方法遍历目录，得到的每一个文件对象
    java.io.FilenameFilter 接口：实现此接口的类实例可用于过滤器文件名
        作用：用来过滤文件(File 对象)
        抽象方法：用来过滤文件的方法
            boolean accept(File dir, String name)：测试指定文件是否应该包含在某一文件列表中
            参数：
                File dir：构造方法中传递的被遍历的目录
                String name：使用 listFiles 方法遍历目录，获取的每一个文件/文件夹的名称
    注意事项：
        两个过滤器接口是没有实现类的，需要自己写实现类，重写过滤的方法 accept，在方法中走开定义过滤的规则
 */

public class Demo04Recursion {
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
