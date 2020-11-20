package fer.day09.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 14:44
 **/

public class Demo02InnerClass {

    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
