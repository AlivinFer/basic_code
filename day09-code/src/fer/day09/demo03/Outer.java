package fer.day09.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 14:38
 *
 * 内部类的同名变量访问
 **/

public class Outer {

    /**
     * 外部类的成员变量
     */
    int num = 10;

    public class Inner /*extends Object*/ {

        // 内部类的成员变量
        int num = 20;

        public void methodInner() {
            // 内部类方法的局部变量
            int num = 30;
            // 局部变量，就近原则
            System.out.println(num);
            // 内部类的成员变量
            System.out.println(this.num);
            // 外部类的成员变量
            System.out.println(Outer.this.num);
        }
    }
}
