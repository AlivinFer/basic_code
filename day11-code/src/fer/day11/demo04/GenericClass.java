package fer.day11.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/18 21:06
 **/

/*
    定义一个含有泛型的类，模拟 ArrayList 集合
    泛型是一个未知的数据类型，当我们不确定使用什么数据类型的时候，可以使用泛型
    泛型可以接收任意的数据类型，可以使用 Integer, String, Student...
    创建对象的时候确定泛型的数据类型
 */

public class GenericClass<E> {
    private E name;
    private E age;

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public GenericClass() {
    }

    public GenericClass(E name, E age) {
        this.name = name;
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
