package fer.day07.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:29
 **/
public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("实现方法A");
    }

    @Override
    public void methodAbs() {
        System.out.println("实现方法methodAbs");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现默认方法");
    }

}
