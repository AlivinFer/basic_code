package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 14:31
 **/

public class Demo02Interface {

    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        // 调用抽象方法，实际运行的是右侧实现类
        a.methodAbs();
        // 调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();
        System.out.println("================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
