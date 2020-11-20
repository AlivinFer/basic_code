package fer.day09.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 21:28
 **/

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并且设置年龄
        hero.setName("亚索");
        hero.setAge(20);

        // 创建一个武器类
        Weapon weapon = new Weapon("叶之风刃");
        // 为英雄配备一个武器
        hero.setWeapon(weapon);

        hero.attack();

    }
}
