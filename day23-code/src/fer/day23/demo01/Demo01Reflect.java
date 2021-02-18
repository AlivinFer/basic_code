package fer.day23.demo01;

/**
 * @author: Alivin Fer
 * @date: 2021/1/7 18:24
 **/

/*
    获取 class 对象的方式：
    1. Class.forName("全类名")：将字节码文件加载进内存，返回 class 对象
    2. 类名.class：通过类名的属性 class 获取
    3. 对象.getClass()：getClass() 方法在 object 类中定义
 */

public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        // 1. Class.forName("全类名")：将字节码文件加载进内存，返回 class 对象
        Class cls1 = Class.forName("fer.day23.demo01.Person");
        System.out.println(cls1);
        // 2. 类名.class：通过类名的属性 class 获取
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        // 3. 对象.getClass()：getClass() 方法在 object 类中定义
        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        // 比较三个对象(==)
        System.out.println(cls1 == cls2); // true
        System.out.println(cls1 == cls3); // true

    }
}
