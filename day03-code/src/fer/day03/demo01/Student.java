package fer.day03.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/10 21:54
 *
 * 成员变量（属性）
 *
 * 成员方法（行为）
 *
 * 注意事项：
 * 1. 成员变量是直接定义在类当中的，在方法外边
 * 2. 成员方法不要写 static 关键字
 **/

public class Student {

    // 成员变量
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;

    /**
     * 成员方法
     */
    public void eat(){
        System.out.println("吃饭饭！");
    }

    public void sleep(){
        System.out.println("睡觉觉！");
    }

    public void study(){
        System.out.println("我爱学习！");
    }
}
