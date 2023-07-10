package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 16:57
 *
 * 接口当中也可以定义 "成员变量" 但是必须使用 public static final 三个关键字进行修饰
 * 从效果上看，这其实就是接口的【常量】
 * 格式：
 * public static final 数据类型 常量名称 = 数据值;
 *
 * 注意事项：
 * 1. 一旦使用 final 关键字进行修饰，说明不可改变
 * 2. 接口当中的常量，可以省略 public static final，但不写也照样是
 * 3. 接口中常量的名称，使用完全大写的字母，用下划线进行分隔。(推荐命名规则)
 **/

public interface MyInterfaceConst {

    /**
     * 这其实就是一个常量，一旦赋值，不可以修改，final 的常量一定要进行初始化赋值
     */
    public static final int NUM_OF_MY_CLASS = 10;
}
