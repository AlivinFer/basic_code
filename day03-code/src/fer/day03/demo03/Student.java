package fer.day03.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/12 20:42
 **/

public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }
}
