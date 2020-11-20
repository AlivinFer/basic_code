package fer.day09.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/6 20:10
 **/

/*
当 final 关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写
 格式：
 修饰符 final 返回值类型 方法名称 {
    // 方法体
 }

 注意事项：
 对于类、方法来说，abstract 关键字和 final 关键字不能同时使用，因为矛盾
 */

public abstract class Fu {

    public final void method() {
        System.out.println("父类方法执行！");
    }

    public abstract /*final*/ void methodAbs();
}
