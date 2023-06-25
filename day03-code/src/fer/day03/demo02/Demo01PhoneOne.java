package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 11:02
 **/

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();

        /*
          默认值 对象默认值为null
          null、null、0.0
         */
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("========");

        one.brand = "苹果";
        one.color = "玫瑰金";
        one.price = 8888.0;

        // 苹果
        System.out.println(one.brand);
        // 玫瑰金
        System.out.println(one.color);
        // 8888.0
        System.out.println(one.price);
        System.out.println("========");

        one.call("能年玲奈");
        one.sendMessage();
    }
}
