package fer.day09.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 20:11
 **/

public class Zi extends Fu {

    // 错误写法，final 方法不能覆盖重写
//    @Override
//    public void method() {
//        System.out.println("子类方法！");
//    }


    @Override
    public void methodAbs() {
        System.out.println("子类方法");
    }
}
