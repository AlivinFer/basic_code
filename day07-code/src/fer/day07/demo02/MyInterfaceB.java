package fer.day07.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:11
 **/
public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法");
    }
}
