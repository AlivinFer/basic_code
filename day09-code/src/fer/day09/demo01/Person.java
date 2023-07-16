package fer.day09.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 21:11
 *
 * 对于成员变量来说，如果使用 final 关键字修饰，那么这个变量也照样是不可变
 *
 * 1. 由于成员变量具有默认值，所以用了 final 之后必须手动赋值，不会再给默认值啦
 * 2. 对于 final 的成员变量，要么使用直接赋值，要么通过构造方法赋值(二者选其一)
 * 3. 必须保证类当中所有的重载的构造方法，都最终会对 final 的成员变量进行赋值
 **/

public class Person {

//    private final String name = "小郭";
    private final String name;

    public Person() {
        name = "小杨";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 不能再进行 set 改变值
//    public void setName(String name) {
//        this.name = name;
//    }

}
