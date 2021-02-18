package fer.day21.demo01;

import java.io.Serializable;

/**
 * @author: Alivin Fer
 * @date: 2021/1/5 10:30
 **/
public class Person implements Serializable {
    private String name;
    private transient int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
