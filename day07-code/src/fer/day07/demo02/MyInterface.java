package fer.day07.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:45
 **/
public interface MyInterface {

    /**
     * 接口默认方法
     */
    public default void method() {
        System.out.println("接口默认方法");
    }
}
