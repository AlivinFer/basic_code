package fer.day06.demo09;

/**
 * @author: Alivin Fer
 * @date: 2020/10/27 21:14
 *
 * 继承的三个特点：
 *
 * 1. 只能单继承
 * 一个类的直接父类只能有唯一一个
 *
 * 2. 可以多级继承
 * class A {}
 * class B extends A {}
 * class C extends B {}
 *
 * 3. 一个子类的直接父类是唯一的，但是一个父类可以拥有很多个子类
 *
 * class A {}
 * class B extends A {}
 * class C extends A {}
 **/

public class Demo01 {

    public static void main(String[] args) {

        Zi zi = new Zi();
        zi.show();
        zi.method();
    }
}
