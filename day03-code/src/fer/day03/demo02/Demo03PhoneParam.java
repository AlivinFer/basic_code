package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 20:14
 *
 * 使用对象类型作为方法的参数
 **/

public class Demo03PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "华为";
        one.color = "blue";
        one.price = 6999.0;

        // 传递进去的参数其实就是地址值
        method(one);
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
