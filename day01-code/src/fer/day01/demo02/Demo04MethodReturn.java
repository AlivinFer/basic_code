package fer.day01.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/9/29 12:19
 *
 * 对于 void 没有返回值的方法，只能单独，不能打印或者赋值使用
 **/

public class Demo04MethodReturn {
    public static void main(String[] args) {
        // main方法进行调用，并把计算完后的结果返回
        int num = getSum(10, 20);
        System.out.println("返回值是：" + num);
        printSum(1, 10);
    }

    /**
     * 有返回值，负责自己的单元计算，谁调用我，就把计算结果告诉谁
     */
    public static int getSum(int a, int b){
        return a + b;
    }

    /**
     * 无返回值，不会把结果告诉任何人，而是自己进行输出
     */
    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("和是：" + result);
    }
}
