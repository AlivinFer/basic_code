package fer.day09.demo02.sub;

import fer.day09.demo02.MyClass;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 21:47
 **/
public class MySon extends MyClass {

    public void methodSon() {
        System.out.println(super.num2);  // protected
        System.out.println(super.num3);  // public
    }
}
