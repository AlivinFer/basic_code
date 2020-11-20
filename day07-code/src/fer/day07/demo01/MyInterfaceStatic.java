package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 15:56
 **/

/*
从 java 8 开始，接口当中允许定义静态方法
格式：
public static 返回值类型 方法名称(参数列表) {
    方法体
}
提示：就是将 abstract 或者 default 换成 static 即可
 */

public interface MyInterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是接口的静态方法！");
    }
}
