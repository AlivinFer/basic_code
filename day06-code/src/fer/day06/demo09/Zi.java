package fer.day06.demo09;

/**
 * @author: Alivin Fer
 * @date: 2020/10/27 21:12
 **/

public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        super.method();
        System.out.println("子类方法！");
    }

    public void show() {
        // 5
        int num = 5;
        System.out.println(num);
        // 20
        System.out.println(this.num);
        // 10
        System.out.println(super.num);
    }
}
