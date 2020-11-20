package fer.day11.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/11/16 19:23
 **/
public class Demo01Integer {

    public static void main(String[] args) {

        // 装箱
        // 构造方法(int value)&&(String s)
        Integer in1 = new Integer(1);  // 此方法已过时
        System.out.println(in1);

        Integer in2 = new Integer('a');
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

//        Integer in4 = Integer.valueOf("a");  // NumberFormatException 数字格式化异常
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);
        System.out.println("=============");

        // 拆箱
        int i = in1.intValue();
        System.out.println(i);

    }

}
