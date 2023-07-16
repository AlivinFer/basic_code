package fer.day09.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 19:31
 *
 * 当 final 关键字用来修饰一个类的时候，格式：
 * public final class 类名称 {
 *     // ...
 * }
 *
 * 含义：当前这个类不能有任何的子类
 * 注意：一个类如果是 final 的，那么其中所有的成员方法都无法进行覆盖重写(因为没有任何子类)
 **/

public final class MyClass /*extends Object*/ {

    public void method() {
        System.out.println("方法执行！");
    }
}
