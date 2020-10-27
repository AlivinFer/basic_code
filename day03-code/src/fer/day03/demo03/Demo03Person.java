package fer.day03.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/12 19:09
 **/

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "能年玲奈";
//        person.age = -20;  // 直接访问 private 内容，错误写法！
        person.setAge(-10);
        person.setAge(20);
        person.show();
    }
}
