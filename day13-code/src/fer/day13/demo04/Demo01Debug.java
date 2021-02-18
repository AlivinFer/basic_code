package fer.day13.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/27 15:43
 **/

/*
    Debug 调试程序
        可以让代码逐行执行，查看代码执行的过程，调试程序出现的 bug
    使用方式：
        在行号的右边，添加断点(最开始添加在每个方法的第一行
                            熟悉后哪里有 bug 添加到哪里)
        右键，选择 Debug 执行程序
        程序就会停留在添加的第一个断点处
    执行程序
        按 f8：逐行执行程序
        按 f7：进入方法
        按 shift+f8：跳出方法
        按 f9：跳到下一个断点，如果没有下一个断点，那么就结束程序
        按 ctrl+f2：退出 Debug 模式，停止程序
        Console：切换到控制台
 */

public class Demo01Debug {
    public static void main(String[] args) {
        /*int a = 20;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);*/

       /* for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }*/
       print();
    }

    private static void print() {
        System.out.println("HelloWorld");
        System.out.println("I am fine");
        System.out.println("Thank you!");
    }
}
