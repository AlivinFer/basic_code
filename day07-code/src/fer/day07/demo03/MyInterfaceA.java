package fer.day07.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:59
 **/
public interface MyInterfaceA {

    /**
     * 抽象方法A
     */
    public abstract void methodA();

    /**
     * 抽象公共方法
     */
    public abstract void methodCommon();

    /**
     * 默认方法
     */
    public default void methodDefault() {
        System.out.println("接口A中的默认方法");
    }
}
