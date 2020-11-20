package fer.day07.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 20:00
 **/

/*
这个子接口一共有 4 个方法

 */

public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
