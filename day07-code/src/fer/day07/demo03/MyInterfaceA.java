package fer.day07.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:59
 **/
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("接口A中的默认方法");
    }
}
