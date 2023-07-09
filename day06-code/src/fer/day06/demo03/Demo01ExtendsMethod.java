package fer.day06.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 15:19
 *
 * 在父子类的继承关系当中，创建子类对象，访问成员方法的规则
 *     创建的对象是谁，就优先用谁，如果没有则向上找
 *
 * 注意事项：
 * 无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。
 *
 * 重写（Override）
 * 概念：在继承关系当中，方法的名称一样，参数列表也一样
 *
 * 重写（Override）：方法的名称一样，参数列表【也一样】。覆盖、覆写（发生在继承的时候）
 * 重载（Overload）：方法的名称一样，参数列表【不一样】
 *
 * 方法覆盖重写特点：创建的是子类对象，则优先使用子类方法
 **/

public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();
        zi.methodFu();

        zi.method();
    }
}
