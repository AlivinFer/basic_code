package fer.day08.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 14:55
 **/
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 子类特有的方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
