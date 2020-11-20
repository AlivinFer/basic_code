package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 10:47
 **/

/*
在任何版本的 java 中，接口都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称(参数列表);

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2. 这两个关键字修饰符，可以选择性省略
3. 方法的三要素，可以随意定义
三要素：返回值，方法名称，参数列表
 */

public interface MyInterfaceAbstract {

    // 这是一个抽象方法
    public abstract void method();

    // 这也是一个抽象方法
    abstract void method1();

    // 这同样是一个抽象方法
    public void method2();

    // 这还是一个抽象方法
    void method3();


}
