package fer.day13.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Alivin Fer
 * @date: 2020/11/26 10:38
 **/

public class Demo01Map {

    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中
            返回值：v
                存储键值对的时候，key不重复，返回值 V 是 null
                存储键值对的时候，key不重复，会使用新的 value 替换 map 中重复的 value，返回被替换的 value 值
     */
    private static void show01() {
        // 使用多态创建 Map 集合对象
        Map<Integer, String> map = new HashMap<>();

        String name0 = map.put(0, "李白");
        System.out.println(name0); // null

        String name1 = map.put(0, "杜甫");
        System.out.println(name1); // 李白

        System.out.println(map); // {0=杜甫}

        map.put(1, "高适");
        map.put(2, "白居易");
        map.put(3, "杜甫");
        System.out.println(map); // {0=杜甫, 1=高适, 2=白居易, 3=杜甫} K 不能重复，V 可以重复

    }

    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素，在Map集合中删除，返回被删除元素的值
            返回值：V
                key存在，v 返回被删除的值
                key不存在，v 返回null
     */
    private static void show02() {
        // 创建 Map 集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("韩信", 170);
        map.put("虞姬", 165);
        map.put("鲁班七号", 160);
        System.out.println(map); // {鲁班七号=160, 韩信=170, 虞姬=165}

        Integer v1 = map.remove("虞姬");
        System.out.println("v1:" + v1);

        Integer v2 = map.remove("小乔");
        System.out.println("v2:" + v2);

//        int v3 = map.remove("大乔"); // 基本类型不能赋值为 null，尽量使用包装类
//        System.out.println("v3:" + v3); // NullPointerException

        System.out.println(map);
    }

    // get 函数，key 存在，返回对应的 value 值，不存在，返回 null
    private static void show03() {
        // 创建 map 集合对象
        Map<String, Integer> map = new HashMap<>();

        map.put("迪丽热巴", 25);
        map.put("古力娜扎", 22);
        map.put("易烊千玺", 20);

        Integer v1 = map.get("易烊千玺");
        System.out.println("v1:" + v1);

        Integer v2 = map.get("佟丽娅");
        System.out.println("v2:" + v2);
    }

    // containsKey(Object key) 判断集合中是否包含指定的键
    // 包含返回 true，不包含返回 false
    private static void show04() {
        // 创建 map 集合对象
        Map<String, Integer> map = new HashMap<>();

        map.put("迪丽热巴", 25);
        map.put("古力娜扎", 22);
        map.put("易烊千玺", 20);

        Boolean b1 = map.containsKey("易烊千玺");
        System.out.println("b1:" + b1);

        Boolean b2 = map.containsKey("佟丽娅");
        System.out.println("b2:" + b2);
    }
}

