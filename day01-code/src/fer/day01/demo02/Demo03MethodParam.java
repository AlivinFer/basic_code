package fer.day01.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/9/28 20:30
 **/

/*
有参数：小括号中有参数，当一个方法需要一些数据条件，才能完成任务，就是有参数

无参数：小括号中留空。一个方法不需要任何数据条件，自己就能单独完成任务，就是无参数
 */


public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(5, 6);
        method2();
    }

    /**
     * 有参数，必须知道两个数字各自是多少，否则无法进行计算
     */
    public static void method1(int a, int b){
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    /**
     *  无参数，自己能单独完成任务
     */
    public static void method2(){
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
