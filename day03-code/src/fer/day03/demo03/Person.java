package fer.day03.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/12 19:06
 *
 * 问题描述：定义 Person 的年龄时，无法阻止不合理的数值被设置进来
 * 解决方案：用 private 关键字将需要保护的成员变量进行修饰
 * 但是，超出了本类范围之外就不能再直接访问了
 *
 * 间接访问 private 成员变量，就是定义一对儿 Setter/Getter 方法
 *
 * 必须叫 setXXX 或者是 getXXX 命名规则
 * 对于 Setter 来说，不能有返回值，参数类型和成员变量对应
 * 对于 Getter 来说，不能有参数，返回值类型和成员变量对应
 **/

public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫：" + name + ",年龄：" + age);
    }

    /**
     * 这个成员方法，专门用于向 age 设置数据
     */
    public void setAge(int num) {
        int n = 100;
        if(num < n && num >= 0) {
            age = num;
        }else {
            System.out.println("数据不合理！");
        }

    }

    /**
     * 这个成员方法，专门用于获取 age 的数据
     */
    public int getAge() {
        return age;
    }
}
