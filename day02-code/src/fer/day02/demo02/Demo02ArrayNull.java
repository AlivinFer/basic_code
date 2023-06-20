package fer.day02.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 10:27
 *
 * 所有的引用类型变量，都可以赋值为一个 null 值。但是代表其中什么都没有
 *
 * 数组必须进行 new 初始化才能使用其中的元素
 * 如果只是赋值了一个 null，没有进行 new 创建
 * 那么将会发生：
 * 空指针异常 NullPointerException
 *
 * 原因：忘了 new
 * 解决：补上 new
 **/

public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
//        array = new int[3];
        try {
            System.out.println(array[0]);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("NullPointerException");
        }


    }
}
