package fer.day01.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/9/27 21:47
 * 方法其实就是若干语句的功能集合
 *
 * 定义方法的完整格式
 * 修饰符 返回值类型 方法名称（参数类型 参数名称, ...）{
 *     方法体
 *     return 返回值;
 * }
 *
 * 修饰符：现阶段的固定写法，public static
 * 返回值类型：也就是方法最终产生的数据结果是什么类型
 * 方法名称：方法的名字，规则和变量一样，小驼峰
 * 参数类型：进入方法的数据是什么类型
 * 参数名称：进入方法的数据对应的变量名称
 * 方法体：方法需要做的事情，若干行代码
 * return：两个作用，第一停止当前方法，第二将后面的返回值还给调用处 （必须和方法名称前面的“返回值类型”，保持对应）
 *
 * 方法的三种调用格式
 * 1. 单独调用，方法名称（参数）
 * 2. 打印调用
 * 3. 赋值调用
 *
 * 注意：返回值类型固定写为 void，这种方法只能够单独调用
 **/

public class Demo02MethodDefine {
    public static void main(String[] args) {
        // 单独调用
        sum(10, 20, 5);
        System.out.println("========");

        // 打印调用
        System.out.println(sum(15, 20));
        System.out.println("========");

        // 赋值调用
        int number = sum(66, 90);
        System.out.println("变量的值：" + number);

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public  static void sum(int a, int b, int c){
        int res = a + b + c;
        System.out.println("res = " + res);
    }
}
