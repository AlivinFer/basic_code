package fer.day07.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:06
 **/

public interface MyInterfaceA {

    // 错误写法！接口不能有静态代码块
// static {
//
//    }

    // 错误写法！接口不能有构造方法
//    public MyInterfaceA() {
//
//     }

    /**
     * 接口方法A
     */
    public abstract void methodA();

    /**
     * 接口方法Abs
     */
    public abstract void methodAbs();

    /**
     * 接口默认方法
     */
    public default void methodDefault() {
        System.out.println("接口的默认方法");
    }
}
