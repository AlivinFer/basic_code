package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 16:07
 **/

public interface MyInterfacePrivateB {

    /**
     * 静态方法1
     */
    public static void methodStatic1() {
        System.out.println("默认方法1");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
        // 进行封装
        methodStaticCommon();
    }

    /**
     * 静态方法2
     */
    public static void methodStatic2() {
        System.out.println("默认方法2");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
        // 进行封装调用
        methodStaticCommon();
    }

    /**
     * 实现静态公共方法
     */
    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }


}
