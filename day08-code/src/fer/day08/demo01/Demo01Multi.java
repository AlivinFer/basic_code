package fer.day08.demo01;

import fer.day08.demo01.Fu;
import fer.day08.demo01.Zi;

/**
 * @author: Alivin Fer
 * @date: 2020/11/4 16:48
 **/

/*
代码当中体现多态性：
父类引用指向子类对象
格式：父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();

访问成员变量的两种方式：
1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找

在多态的代码当中，成员方法的访问规则则是：
    看 new 的是谁，就优先用谁，没有则向上找

口诀：
成员方法：编译看左边，运行看右边
成员变量：编译看左边，运行还看左边

 */
public class Demo01Multi {

    public static void main(String[] args) {
        // 使用多态的写法
        Fu obj = new Zi();

        obj.method();  // 父子都有，优先用子
        obj.methodFu();  // 子类没有，父类由，向上找到父类
        System.out.println(obj.num);  // 父：10
        System.out.println("============");

        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
        obj.showNum();

        // 编译看左边，左边是 Fu，Fu 当中没有 methodZi 方法，所以编译报错
//        obj.methodZi();  // 错误写法

    }
}
