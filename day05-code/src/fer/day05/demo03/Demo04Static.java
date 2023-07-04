package fer.day05.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/22 21:37
 **/

public class Demo04Static {

    public static void main(String[] args) {
        Person one = new Person();
        System.out.println("one.num: " + one.getNum());
        one.setNum(20);
        System.out.println("one.num set: " + one.getNum());
        Person two = new Person(30);
        System.out.println("two.num: " + two.getNum());
    }
}
