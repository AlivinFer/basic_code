package fer.day03.Demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/12 21:12
 *
 * 当方法的局部变量和类的成员变量重名的时候，根据 “就近原则”，优先使用局部变量
 * 如果需要访问本类当中的成员变量，需要使用格式
 * this.成员变量名
 *
 * 通过谁调用的方法，谁就是 this
 **/

public class Person {

    String name;

    /**
     * 当方法的参数和成员变量的参数相同时，为了区分二者
     */
    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name);

        System.out.println(this);
    }
}
