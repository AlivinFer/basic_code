package fer.day07.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 20:00
 **/

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("接口B中的默认方法");
    }
}
