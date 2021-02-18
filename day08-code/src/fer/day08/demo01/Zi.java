package fer.day08.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/4 16:51
 **/
public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    @Override
    public void showNum() {
        System.out.println(num);
    }

    public void methodZi() {
        System.out.println("子类特有的方法");
    }
}
