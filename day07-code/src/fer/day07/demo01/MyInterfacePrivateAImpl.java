package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 16:18
 **/

public class MyInterfacePrivateAImpl implements  MyInterfacePrivateA {

    public void methodAnother() {
        // 直接访问到了接口的默认方法,这样是错误的
//        methodCommon();
    }
}
