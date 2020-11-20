package fer.day11.demo04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author: Alivin Fer
 * @date: 2020/11/18 20:39
 **/

public class Demo01FanXing {

    public static void main(String[] args) {

//        show1();
        show2();
    }

    /*
        创建集合对象，不使用泛型
        好处：
            集合不适用泛型，默认的类型就是 Object 类型，可以存储任意类型的数据
        弊端：
            不安全，会引发异常
     */
    public static void show1() {
        // 默认是 Object 类型
        ArrayList list = new ArrayList();
        list.add("qwer");
        list.add(100);
        Iterator it = list.iterator();
        // 使用迭代器中的 hasNext 和 next 遍历集合
        while (it.hasNext()) {
            // 取出元素也是 Object 类型
            Object obj = it.next();
            System.out.println(obj);

            // 要想使用 String 类特有的方法 length() 获取字符串长度
            // 需要向下转型
            String s = (String)obj;
            System.out.println(s.length()); // 会抛出异常 ClassCastException，不能把 Integer 类型转换为 String
        }
    }

    /*
        创建集合对象，使用泛型
        好处：
            1. 避免了类型转换的麻烦，存储的是什么类型，就是什么类型
            2. 把运行期异常，提升到了编译期
        弊端：
            泛型是什么类型，只能存储什么类型的数据
     */
    public static void show2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("fine");
//        list.add(100); // add(java.lang.String) in ArrayList cannot be applied to (int)

        // 使用迭代器遍历 list 集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + "->" + s.length());
        }
    }
}
