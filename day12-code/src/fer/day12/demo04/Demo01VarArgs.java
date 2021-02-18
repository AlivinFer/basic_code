package fer.day12.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/25 15:20
 **/

/*
    可变参数：是 JDK1.5 之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：定义方法时使用
        修饰符 返回值类型 方法名(数据类型 ... 变量名){}
    可变参数的原理：
        可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递参数的个数，可以是 0 个(不传递)，1，2...多个
 */

public class Demo01VarArgs {

    public static void main(String[] args) {
//        int i = add();
//        int i = add(10);
        int i = add(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(i);
    }

    /*
        定义计算 (0-n) 个整数和的方法
        已知：计算整数的和，数据类型已经确定
        但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
        add(); 就会创建一个长度为 0 的数组 new int[0]
        add(10); 就会创建一个长度为 1 的数组 new int[1]
        add(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10); 就会创建一个长度为 10 的数组 new int[10]

        注意事项：
            1. 一个方法的参数列表，只能有一个可变参数
            2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾

        特殊写法：可接收任意类型的参数
        public static int add(Object...obj) {
        }
     */
    public static int add(int...arr) {
        System.out.println(arr); // [I@10f87f48 底层是一个数组
        System.out.println(arr.length);
        // 定义初始化的变量，记录累加求和
        int sum = 0;
        for (int num:arr) {
            sum += num;
        }
        return sum;
    }
}
