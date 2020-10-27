package fer.day06.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 14:43
 **/

/*
 区分子类方法中重名的三种
局部变量：          直接写成员变量名
本类的成员变量：     this.成员变量名
父类的成员变量：     super.成员变量名

 */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.method();
    }
}
