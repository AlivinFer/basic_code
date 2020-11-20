package fer.day10.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/11 16:33
 **/
/*
toString 的方法
1. 其是在 Object 类定义的，所有类都会有这个方法，其返回值类型为 String 类型，返回类名和它的引用地址
2. 在进行 String 类与其它类型的连接操作时，自动调用 toString() 方法
 */

public class Demo01toString {

    private String name = "剑圣";
    private int age = 20;
    private char gender = '男';

    @Override
    public String toString() {
        return "Demo01toString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {

        Demo01toString test = new Demo01toString();

        // 不重写 toString 的方法
//        System.out.println(test);  // fer.day10.demo01.Demo01toString@10f87f48
//        String s = "This is a String:" + test;
//        System.out.println(s);  // This is a String:fer.day10.demo01.Demo01toString@10f87f48

        // 对 toString 方法进行重载后
        System.out.println(test);  // Demo01toString{name='剑圣', age=20, gender=男}
        String s = "This is a String:" + test;
        System.out.println(s);  // This is a String:Demo01toString{name='剑圣', age=20, gender=男}
    }
}
