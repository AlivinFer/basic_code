package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 11:02
 **/

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();

        System.out.println(one.brand); // null
        System.out.println(one.color); // null
        System.out.println(one.price); // 0.0
        System.out.println("========");

        one.brand = "苹果";
        one.color = "玫瑰金";
        one.price = 8888.0;

        System.out.println(one.brand); // 苹果
        System.out.println(one.color); // 玫瑰金
        System.out.println(one.price); // 8888.0
        System.out.println("========");

        one.call("能年玲奈");
        one.sendMessage();
    }
}
