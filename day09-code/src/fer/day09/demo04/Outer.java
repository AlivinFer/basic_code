package fer.day09.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 14:49
 *
 * 如果一个类是定义在一个方法内部，那么这就是一个局部内部类
 * “局部”：只有当前所属的方法才能使用它，出了这个方法外面就不能用了
 *
 * 定义格式：
 * 修饰符 class 外部类名称 {
 *     修饰符 返回值类型 外部类方法名称(参数列表) {
 *         class 局部内部类名称 {
 *             // ...
 *         }
 *     }
 * }
 *
 * public > protected > (default) > private
 * 定义一个类的时候，权限修饰符规则
 * 1. 外部类：public / (default)
 * 2. 成员内部类：public / protected / (default) / private
 * 3. 局部内部类：什么都不能写
 **/

public class Outer {

    public void methodOuter() {
        class Inner {  // 局部内部类
            final int num = 10;
            public void  methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
