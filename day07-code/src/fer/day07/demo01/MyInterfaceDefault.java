package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 14:16
 *
 * 从 java 8 开始，接口里允许定义默认方法。
 * 格式：
 * public default 返回值类型 方法名称(参数列表) {
 *     // 方法体...
 * }
 **/

public interface MyInterfaceDefault {

    /**
     *  抽象方法
     */
    public abstract void methodAbs();

    // 新添加一个抽象方法（可添加默认方法，不然每次都要在实现接口，并造成其他实现的抽象方法不可用）
//    public abstract void methodAbs1();

    /**
     * 新添加的方法，改成默认方法
     */
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法！");
    }
}
