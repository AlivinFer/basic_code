package fer.day09.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/7 13:52
 **/
public class Body {

    // 外部类的成员变量
    private String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 定义成员内部类
    public class Heart {

        public void beat() {
            System.out.println("心脏跳动：bangbangbang");
            System.out.println("我叫：" + name);  // 正确写法
        }
    }

    // 外部类的方法
    public void methodBody() {
        Heart heart = new Heart();
        heart.beat();
    }

}
