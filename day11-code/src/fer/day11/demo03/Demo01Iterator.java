package fer.day11.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: Alivin Fer
 * @date: 2020/11/17 19:44
 **/

public class Demo01Iterator {

    public static void main(String[] args) {

        // 创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        // 往集合中添加元素
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("杜兰特");
        coll.add("霍华德");
        coll.add("诺维斯基");
        coll.add("姚明");

        /*
            1. 使用集合中的方法 iterator() 获取迭代器的实现类对象，使用 Iterator 接口接收(多态)
            注意：
                Iterator<E> 接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        // 多态 接口           实现类对象
        Iterator<String> it = coll.iterator();

        // 2. 使用 Iterator 接口中的方法 hasNext 判断还有没有下一个元素
        boolean b1 = it.hasNext();
        System.out.println(b1);

        // 3. 使用 Iterator 接口中的方法 next 取出集合中的下一个元素
        String s = it.next();
        System.out.println(s);

        /*
            发现使用迭代器取出集合中的元素的代码，是一个重复的过程
            所以可以使用循环优化
            不知道集合中有多少元素，使用 while 循环
            循环结束的条件，hasNext 方法返回 false
         */
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
