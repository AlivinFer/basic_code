package fer.day06.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 19:20
 **/

/*
继承关系中，父子类构造方法的访问特点：

1. 子类构造方法当中有一个默认隐含的 "super()调用" 所以一定是先调用的父类构造，后执行的子类构造

2. 子类构造可以通过 super 关键字来调用父类重载构造

3. super 的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次 super 构造

总结：
子类必须调用父类构造方法，不写则赠送 super()；写了则用写的指定的 super 调用，super 只能有一个，还必须是第一个
 */

public class Demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
