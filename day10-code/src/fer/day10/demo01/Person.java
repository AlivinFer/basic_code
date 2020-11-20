package fer.day10.demo01;

import java.util.Objects;

/**
 * @author: Alivin Fer
 * @date: 2020/11/11 19:14
 **/
public class Person {

    private String name;

//    @Override
//    public boolean equals(Object obj) {
//        // 增加一个判断，如果是空值，直接返回
//        if (obj == null) {
//            return false;
//        }
//        // 增加一个判断，传递的参数 obj 是 this 本身，直接返回 true，提高程序效率
//        if (obj == this) {
//            return true;
//        }
//        // 增加一个判断，防止类型转换错误 ClassCastException
//        if (obj instanceof Person) {
//            // 使用向下转型，把 obj 转换为 Person 类型
//            Person p = (Person)obj;
//            // 比较两个对象的属性，一个对象是this(person),一个对象p(obj->person1)
//            boolean b = this.name.equals(p.name);
//            return b;
//        }
//        // 如果不是 person 类直接返回 false
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用的是反射技术，判断 o 是否是 Person 类型
        // 等同于 o instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        // 使用的是 Objects.equals() 防止空指针异常
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
