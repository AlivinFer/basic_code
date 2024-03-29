package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 15:53
 *
 * 注意事项：不能通过接口实现类的对象来调用接口当中的静态方法
 * 正确用法：通过接口名称，直接调用其中的静态方法
 * 格式：
 * 接口名称.静态方法名(参数);
 * **/

public class Demo03Interface {

    public static void main(String[] args) {

        // 创建实现类对象无法调用
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
