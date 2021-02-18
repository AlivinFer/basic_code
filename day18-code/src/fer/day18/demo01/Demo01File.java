package fer.day18.demo01;


import java.io.File;

/**
 * @author: Alivin Fer
 * @date: 2020/12/21 19:27
 **/

/*
    与 File 相关的一些方法
    static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
    static char pathSeparatorChar 与系统有关的路径分隔符。

    static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
    static char separatorChar 与系统有关的默认名称分隔符。

    操作路径：路径不能写死了
    C:\develop\a\a.txt  windows
    C:/develop/a/a.txt  linux
    "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
 */

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // 路径分隔符 windows：分号;  linux 冒号:

        String separator = File.separator;
        System.out.println(separator); // 文件名称分隔符 windows：分隔符 \  linux /

    }
}
