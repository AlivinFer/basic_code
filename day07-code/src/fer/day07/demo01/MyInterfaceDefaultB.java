package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 14:32
 **/

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象的方法: BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类 B 覆盖重写了接口的默认方法");
    }
}
