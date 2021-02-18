package fer.day14.demo03;

import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2020/12/5 15:53
 **/

/*
    finally 代码块，和 try 一起使用
无论是否出现异常都会执行
注意：
    1. finally 不能单独使用，必须和 try 一起使用
    2. finally 一般用于资源释放(资源回收)，无论程序是否出现异常，最后都要资源释放(IO)
 */

public class Demo03Finally {
    public static void main(String[] args) {
        try {
            // 可能会产生异常的代码
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
    }

    /*
        如果传递的不是路径，不是 .txt 结尾
        那就抛出 IO 异常对象，告知方法的调用者，文件的后缀名不对
     */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }

}
