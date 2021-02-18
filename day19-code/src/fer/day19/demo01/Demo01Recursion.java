package fer.day19.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/28 17:24
 **/
public class Demo01Recursion {
    public static void main(String[] args) {
//        a();
        b(0);
    }

    // 编译时报错，构造方法是创建对象使用的，一直递归会导致内存中有无数个对象
    /*public Demo01Recursion() {
        Demo01Recursion();
    }*/

    // Exception in thread "main" java.lang.StackOverflowError (递归的次数不能太多)
    private static void b(int i) {
        System.out.println(i);
        if (i == 20000) {
            return;
        }
        b(++i);
    }

    // java.lang.StackOverflowError (抛出异常，栈内存溢出)
    private static void a() {
        System.out.println("a 方法！");
        a();
    }
}
