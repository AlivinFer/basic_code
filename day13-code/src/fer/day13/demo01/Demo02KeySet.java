package fer.day13.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: Alivin Fer
 * @date: 2020/11/27 10:22
 **/

/*
    Map 集合第一种遍历方式，通过键找值的方式
    Map 集合中的方法：
        Set<K> keySet()  返回此映射中包含的键的 Set 视图
    实现步骤：
        1. 使用 Map 集合中的方法 keySet(),把 Map 集合所有的key取出来，存储到一个 Set 集合中
        2. 遍历 Set 集合，获取 Map 集合中的每一个 key
        3. 通过 Map 集合中的方法 get(key),通过 key 找到 value
 */

public class Demo02KeySet {

    public static void main(String[] args) {
        // 创建 map 集合对象
        Map<String, Integer> map = new HashMap<>();

        map.put("迪丽热巴", 25);
        map.put("古力娜扎", 22);
        map.put("易烊千玺", 20);

        Set<String> set = map.keySet();

        // 使用迭代器遍历 Set 集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("==============");

        // 使用增强 for 遍历 Set 集合
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }

}
