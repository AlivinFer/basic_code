package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 18:51
 *
 * 两个引用指向同一个对象
 **/

public class Demo02PhoneTwo {
    public static void main(String[] args) {
        Phone demo02 = new Phone();

        System.out.println(demo02.brand);
        System.out.println(demo02.color);
        System.out.println(demo02.price);
        System.out.println("========");

        demo02.brand = "苹果";
        demo02.color = "玫瑰金";
        demo02.price = 8888.0;

        System.out.println(demo02.brand);
        System.out.println(demo02.color);
        System.out.println(demo02.price);
        System.out.println("========");

        demo02.call("能年玲奈");
        demo02.sendMessage();


        Phone two = new Phone();

        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("========");

        two.brand = "小米";
        two.color = "黑色";
        two.price = 2888.0;

        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("========");

        two.call("尤尤");
        two.sendMessage();
    }
}
