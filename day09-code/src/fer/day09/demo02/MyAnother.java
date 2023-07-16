package fer.day09.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 21:45
 *
 *  同一个包不同类
 **/

public class MyAnother {

    public void anotherMethod() {
        // (default)
        System.out.println(new MyClass().num1);
        // protected
        System.out.println(new MyClass().num2);
        // public
        System.out.println(new MyClass().num1);
    }
}
