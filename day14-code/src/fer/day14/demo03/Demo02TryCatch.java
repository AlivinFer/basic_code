package fer.day14.demo03;

import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2020/12/5 14:42
 **/

/*
    try...catch：异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常的常量，用来接收 try 中抛出的异常对象){
            异常的处理逻辑，异常对象之后，怎么处理异常对象
            在工作中，会把异常的信息记录到一个日志中
        }
        ... // 可以有多个
        catch(异常类名 变量名){

        }
     注意：
        1. try 中可能会抛出多个异常对象，那么就可以使用多个 catch 处理这些异常对象
        2. 如果 try 中产生了异常，就会执行 catch 中的异常处理逻辑，执行完毕 catch 中的处理逻辑
            继续执行 try...catch 之后的代码
            如果没有产生异常，那么就不会执行 catch 中的异常处理逻辑，直接执行 try...catch 之后的代码
 */

public class Demo02TryCatch {

    public static void main(String[] args) {
        try {
            // 可能产生异常的代码
            // readFile("d:\\a.tx");
            readFile("d:\\a.tx");
        }catch (IOException e) { // try 中抛出什么异常对象，catch 就定义什么异常变量，用来接收这个异常对象
            // 异常的处理逻辑，捕捉异常对象之后，怎么处理异常对象
            // System.out.println("catch - 传递的文件后缀不是 .txt");
            // System.out.println(e.getMessage());
            // System.out.println(e.toString()); // 重写 Object 类的 toString java.io.IOException: 文件的后缀名不对
            e.printStackTrace();
        }
        System.out.println("后续代码"); // 后续代码可以执行
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
