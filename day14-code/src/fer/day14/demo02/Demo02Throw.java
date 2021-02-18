package fer.day14.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/12/4 15:20
 **/

/*
    throw 关键字
    作用：
        可以使用 throw 关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因")
    注意：
        1. throw 关键字必须写在方法的内部
        2. throw 关键字后边 new 的对象必须是 Exception 或者 Exception 的子类对象
        3. throw 关键字抛出指定的异常对象，就必须处理这个异常对象
            throw 关键字后边创建的是 RuntimeException 或者是 RuntimeException 的子类对象，可以不处理
            默认交给 JVM 处理(打印异常对象，中断程序)
            throw 关键字后边创建的是编译异常(写代码的时候报错)，就必须处理这个异常，要么 throws，要么 try...catch
 */

public class Demo02Throw {

    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = {1, 2, 3};
        getElement(arr, 3);
    }

    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int index
        在工作中，首先必须对方法传递过来的参数进行合法性校验
        如果参数不合法，那么就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
        注意：
            NullPointerException 是一个运行期异常，不用处理，默认交给 JVM 处理
     */
    public static int getElement(int[] arr,int index) {
        /*
            对传递过来的参数数组，进行合法性校验
            如果数组 arr 的值是 null
            那么就抛出空指针异常，告知方法的调用者 传递的数组的值是 null
         */
        if (arr == null) {
            throw new NullPointerException("传递的数组的值是 null");
        }
        /*
            如果 index 的范围不在数组的索引范围内
            那么就抛出数组索引越界异常，告知方法的调用者 "传递的索引超出了数组的使用范围"
         */
        if (index < 0 || index > arr.length-1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }
}
