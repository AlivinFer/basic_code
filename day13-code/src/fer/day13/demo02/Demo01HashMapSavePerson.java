package fer.day13.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: Alivin Fer
 * @date: 2020/11/27 11:09
 **/

/*
    HashMap 存储自定义类型键值
    Map 集合保证 key 是唯一的
        作为 key 的元素，必须重写 hashCode 方法和 equals 方法，以保证 key 唯一
 */
public class Demo01HashMapSavePerson {

    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        HashMap 存储自定义类型键值
        key：String 类型
            String 类重写 hashCode 方法和 equals 方法，可以保证 key 唯一
        value：使用 Person 类型
            value 可以重复(同名同年龄的人视为同一个)
     */
    private static void show01() {
        // 创建 HashMap 集合
        HashMap<String, Person> map = new HashMap<>();
        // 往集合中添加元素
        map.put("商丘", new Person("拽子松", 23));
        map.put("孝感", new Person("小郭", 24));
        map.put("黄冈", new Person("黑猪", 25));
        map.put("商丘", new Person("小李", 20)); // key 值相同，后面的会替代前面
        // 使用 keySet 加增强 for 循环遍历 Map 集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("===================");

    }

    /*
        HashMap 存储自定义类型键值
        key：Person 类型
            Person 类就必须重写 hashCode 和 equals 方法
        value：String 类型
            可以重复
     */
    private static void show02() {
        // 创建 HashMap 集合
        HashMap<Person, String> map = new HashMap<>();

        map.put(new Person("科比", 25), "湖人");
        map.put(new Person("詹姆斯", 23), "骑士");
        map.put(new Person("艾弗森", 26), "76人");
        map.put(new Person("加索尔",28), "湖人");
        // Person 类没有重写 hashCode 和 equals 方法，key不唯一
        map.put(new Person("詹姆斯", 23), "热火"); // 重写后 key 值唯一


        // 使用 entrySet 和 增强 for 循环遍历 set 集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
