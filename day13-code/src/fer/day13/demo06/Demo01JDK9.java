package fer.day13.demo06;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: Alivin Fer
 * @date: 2020/12/2 20:33
 **/

/*
    JDK9的新特性：
        List 接口，Set接口，Map 接口：里面增加了一个静态的方法 of，可以给集合一次性添加多个元素
        static <E> List<E> of (E...elements)
        使用前提：
            当集合中存储的元素的个数以及确定了，不子啊改变时使用
        注意：
            1. of 方法只适用于 List 接口，Set 接口，Map 接口，不适用于接口的实现类
            2. of 方法的返回值时一个不能改变的集合，结合不能再使用 add，put 方法添加元素，会抛出异常
            3. Set 接口和 Map 接口在调用 of 方法的时候，不能有重复的元素，否则会抛出异常
 */

public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e");
        System.out.println(list);
//        list.add("f"); // UnsupportedOperationException, 不支持操作异常

//        Set<String> set = Set.of("a", "b", "a", "c"); // IllegalArgumentException,非法参数异常，有重复的元素
//        System.out.println(set);

        Map<String, Integer> map = Map.of("科比", 24, "詹姆斯", 23, "库里",30);
        System.out.println(map);
//        map.put("安东尼", 7); // UnsupportedOperationException
    }
}