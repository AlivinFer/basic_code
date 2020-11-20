package fer.day07.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/29 16:07
 **/

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("默认方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("默认方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
          methodStaticCommon();
    }

    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }


}
