package fer.day14.demo03;

import java.io.FileNotFoundException;

/**
 * @author: Alivin Fer
 * @date: 2020/12/4 22:07
 **/

/*
    throws 关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，那么就必须处理这个异常对象
        可以使用 throws 关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理(自己不处理)
        最终交给JVM处理 --> 中断处理
    使用格式：在方法声明时使用
        修饰符 返回值类型 方法名(参数列表) throws AAAException BBBException...{
            throw new AAAException("产生原因");
            throw new BBBException("产生原因");
        }
     注意：
        1. throws 关键字必须写在方法声明处
        2. throws 关键字后边声明的异常必须是 Exception 或者是 Exception 的子类
        3. 方法内部如果抛出了多个异常对象，那么 throws 后边必须声明多个异常
            如果抛出的多个异常有子父类关系，那么直接声明父类异常即可
        4. 调用了一个声明抛出异常的方法，就必须处理声明的异常
            要么继续使用 throws 声明抛出，交给方法的调用者处理，最终交给 JVM
            要么 try...catch 自己处理异常
 */

public class Demo01Throws {
    public static void main(String[] args) throws FileNotFoundException {
//        readFile("c:\\a.txt");
        readFile("d:\\a.txt");
        System.out.println("后续代码"); // 后续代码没有执行
    }

    /*
        定义一个方法，对传递的文件路径进行合法性判断
        如果路径不是 "c:\\a.txt" 那么就抛出文件找不到异常对象，告知方法的调用者
        注意:
            FileNotFoundException 是编译异常，抛出了编译异常，就必须处理这个异常
            可以使用 throws 继续声明抛出 FileNotFoundException 这个异常对象，让方法的调用者处理
     */
    public static void readFile(String fileName) throws FileNotFoundException{
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是 c:\\\\a.txt");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
