package fer.day06.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 15:14
 **/

public class Zi extends Fu {

    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    @Override
    public void method() {
        System.out.println("子类重名方法执行！");
    }
}
