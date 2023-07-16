package fer.day09.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 16:36
 **/

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void method() {
        System.out.println("实现类覆盖重写了方法");
    }

    @Override
    public void method1() {
        System.out.println("实现方法1");
    }
}
