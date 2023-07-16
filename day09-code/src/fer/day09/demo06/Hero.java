package fer.day09.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 21:22
 *
 * 游戏当中的英雄角色类
 **/

public class Hero {

    /**
     * 英雄名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 英雄的武器
     */
    private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("年龄为" + age + "的" + name + "用" + weapon.getCode() + "攻击对方");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
