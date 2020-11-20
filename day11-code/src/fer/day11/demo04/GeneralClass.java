package fer.day11.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/18 21:06
 **/

/*
   定义一个没有使用泛型的类
 */

public class GeneralClass {
    private String name;

    public GeneralClass() {
    }

    public GeneralClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
