package fer.day06.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 14:44
 **/
public class Fu {
    int num = 30;

    public void method() {
        int num = 10;
        // 10, 局部变量
        System.out.println(num);
        // 20, 本类的成员变量
        System.out.println(this.num);
    }
}
