package fer.day08.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 14:56
 *
 * 向上转型一定是安全的，没有问题的，正确的，但是也有一个弊端
 * 对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
 *
 * 解决方案：
 * 向下转型，其实就是一个【还原】的动作
 * 格式：子类名称 对象名 = (子类名称) 父类对象
 * 含义：将父类对象，【还原】成为本来的子类对象
 *
 * 注意事项：
 * 1. 必须保证对象本来创建的时候，就是猫，才能向下转型成为猫
 * 2. 如果对象创建的时候本来就不是猫，现在非要向下转型成为猫，就会报错  // ClassCastException
 **/

public class Demo01Main {

    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        // 错误写法 父类无法调用子类单独的方法
//        animal.catchMouse();

        // 向下转型,【还原】动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        // 错误写法，编译正确，运行错误
//        Dog dog = (Dog) animal;
//        dog.eat();

    }
}
