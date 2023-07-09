package fer.day06.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 14:44
 **/

public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        int num = 10;
        // 10, 局部变量
        System.out.println(num);
        // 20, 本类的成员变量
        System.out.println(this.num);
        // 30, 父类的成员变量
        System.out.println(super.num);
    }
}
