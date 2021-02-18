package fer.day12.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/11/25 19:50
 **/

public class Person implements Comparable<Person>{
    private String name;
    private int age;

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

    @Override
    public int compareTo(Person o) {
//        return 0; // 默认元素都是相同的
        // 自定义的规则，比较两个人的年龄(this,参数Person)
        // 固定形式
//        return this.getAge() - o.getAge(); // 年龄升序排序
        // 年龄降序
        return o.getAge() - this.getAge();
    }
}
