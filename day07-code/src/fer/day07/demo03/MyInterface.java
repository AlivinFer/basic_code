package fer.day07.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 20:00
 **/

public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    /**
     * 抽象接口方法
     */
    public abstract void method();

    /**
     * 重写继承接口A和B方法
     */
    @Override
    default void methodDefault() {

    }
}
