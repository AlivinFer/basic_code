package fer.day05.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 21:34
 **/

/*
静态代码块的格式是：

public class 类名称 {
    static {
        // 静态代码块的内容
    }
}

特点：当第一次用到本类时，静态代码块执行唯一的一次
静态内容总是优先于非静态，所以静态代码块比构造方法先执行
 */

public class Person {
    static {
        System.out.println("静态代码块执行");
    }

    public Person() {
        System.out.println("构造方法执行");
    }
}
