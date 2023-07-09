package fer.day06.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 14:43
 *
 * 区分子类方法中重名的三种
 * 局部变量：          直接写成员变量名
 * 本类的成员变量：     this.成员变量名
 * 父类的成员变量：     super.成员变量名
 **/

public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println("Fu 类方法：");
        fu.method();

        Zi zi = new Zi();
        System.out.println("Zi 类方法：");
        zi.method();
    }
}
