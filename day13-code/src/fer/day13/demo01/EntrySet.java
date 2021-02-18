package fer.day13.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: Alivin Fer
 * @date: 2020/11/27 10:55
 **/

/*
    Map 集合遍历的第二种方式：使用 Entry 对象遍历

    Map 集合的方法：
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图

    实现步骤：
        1. 使用 Map 集合中的方法 entrySet(),把 Map 集合中多个 Entry 对象取出来，存储到一个 Set 集合中
        2. 遍历 Set 集合，获取每一个 Entry 对象
        3. 使用 Entry 对象中的方法 getKey() 和 getValue() 获取键和值
 */

public class EntrySet {

    public static void main(String[] args) {
        // 创建 map 集合对象
        Map<String, Integer> map = new HashMap<>();

        map.put("迪丽热巴", 25);
        map.put("古力娜扎", 22);
        map.put("易烊千玺", 20);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // 使用迭代器遍历 set 集合
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("=============");

        // 使用增强 for 循环
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
