package fer.day11.demo02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: Alivin Fer
 * @date: 2020/11/17 16:13
 **/

/*
    java.util.Collection 接口
        所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
        任意单列集合都可以使用 Collection 接口中的方法

    共性的方法：
        public boolean add(E e): 把给定的对象添加到当前集合中
        public void clear(): 清空集合中所有的元素
        public boolean remove(E e): 把给定的对象在当前集合中删除
        public boolean contains(E e): 判断当前集合中是否包含给定的对象
        public Object[] toArray(): 把集合中的元素，存储到数组中
        public int size(): 返回集合中元素的个数
        public void clear(): 清空集合当中所有的元素，但是不删除集合，集合还存在
 */

public class Demo01Collection {

    public static void main(String[] args) {

        // 创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // 重写了 toString 方法 []

        /*
            public boolean add(E e):  把给定的对象添加到当前集合中
            返回值是一个 boolean 值，一般都返回 true，所以可以不用接收
         */
        boolean b1 = coll.add("德玛");
        System.out.println("b1:" + b1); // true
        coll.add("皇子");
        coll.add("德邦");
        coll.add("诺手");
        coll.add("船长");
        coll.add("剑姬");
        System.out.println(coll); // [德玛, 皇子, 德邦, 诺手, 船长, 剑姬]

        /*
            public boolean remove(E e): 把给定的对象在当前集合中删除
            返回值是一个 boolean 值：集合中存在元素，删除元素，返回 true
                                   集合中不存在元素，删除失败，返回 false
         */
        boolean b2 = coll.remove("船长");
        System.out.println("b2:" + b2); // true

        boolean b3 = coll.remove("纳尔");
        System.out.println("b3:" + b3); // false
        System.out.println(coll); // [德玛, 皇子, 德邦, 诺手, 剑姬]

        /*
            public boolean contains(E e): 判断当前集合中是否包含给定的对象
            包含返回 true
            不包含返回 false
         */
        boolean b4 = coll.contains("皇子");
        System.out.println(b4); // true
        boolean b5 = coll.contains("船长");
        System.out.println(b5); // false

        /*
            public boolean isEmpty(): 判断当前集合是否为空
            空返回 true
            不为空返回 false
         */
        boolean b6 = coll.isEmpty();
        System.out.println(b6); // false

        /*
            public int size(): 返回集合中元素的个数
            返回值类型为 整型
         */
        int num = coll.size();
        System.out.println(num); // 5

        /*
            public Object[] toArray(): 把集合中的元素，存储到数组中

         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
            public void clear(): 清空集合当中所有的元素，但是不删除集合，集合还存在
         */
        coll.clear();
        System.out.println(coll); // []
        System.out.println(coll.isEmpty()); // true
    }
}
