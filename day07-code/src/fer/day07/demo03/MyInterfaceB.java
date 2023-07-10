package fer.day07.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 20:00
 **/

public interface MyInterfaceB {

    /**
     * 抽象方法B
     */
    public abstract void methodB();

    /**
     * 接口 B 公共方法
     */
    public abstract void methodCommon();

    /**
     * 接口B默认方法
     */
    public default void methodDefault() {
        System.out.println("接口B中的默认方法");
    }
}
