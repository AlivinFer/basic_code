package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 20:28
 **/

// 使用对象类型作为方法的返回值
public class Demo04PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "土豪金";
        one.price = 9999.0;
        return one;
    }
}
