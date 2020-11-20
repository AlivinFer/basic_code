package fer.day07.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 19:16
 **/
public class MyInterfaceIpl implements MyInterfaceB, MyInterfaceA {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了 B 方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodDefault() {

    }


}
