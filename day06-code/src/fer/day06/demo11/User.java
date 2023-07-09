package fer.day06.demo11;

/**
 * @author: Alivin Fer
 * @date: 2020/10/28 19:52
 **/

public class User {

    /**
     * 姓名
     */
    private String name;
    /**
     * 余额，也就是当前用户拥有的钱数
     */
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("我叫" + name + "," + "有 " + money + " 块钱");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
