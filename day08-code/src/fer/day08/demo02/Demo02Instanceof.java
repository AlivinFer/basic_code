package fer.day08.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/11/5 16:01
 *
 * 如何才能知道一个父类的引用对象，本来是什么子类？
 * 格式：
 *     对象 instanceof 类名称
 *     这将会得到一个 boolean 值结果，也就是判断前面的对象能不能当做后面类型的实例
 **/

public class Demo02Instanceof {

    public static void main(String[] args) {
        // 向上转型
        Animal animal = new Cat();
        // 只能调用通用方法
        animal.eat();

        // 如果希望调用子类特有的方法，需要向下转型
        // 判断一下父类引用 animal 本来是不是 Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        // 判断一下父类引用 animal 本来是不是 Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
