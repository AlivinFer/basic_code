package fer.day07.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:11
 **/
public interface MyInterfaceB {

    /**
     * 抽象方法B
     */
    public abstract void methodB();

    /**
     * 抽象方法Abs
     */
    public abstract void methodAbs();

    /**
     * 默认方法
     */
    public default void methodDefault() {
        System.out.println("默认方法");
    }
}
