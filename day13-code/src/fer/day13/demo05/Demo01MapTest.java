package fer.day13.demo05;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/12/2 19:37
 **/

/*
    计算一个字符串中每个字符出现次数

    分析：
        1. 使用 Scanner 获取用户输入得字符串
        2. 创建 Map 集合，key是字符串中得字符，value 是字符的个数
        3. 遍历字符串，获取每一个字符
        4. 使用获取到的字符，去 Map 集合判断 key 是否存在
            key 存在：
                通过字符(key),获取 value (字符个数)
                value ++
                put(key,value) 把新的 value 存储到 Map 集合中
            key 不存在：
                put(key,1)
         5. 遍历 Map 集合，输出结果
 */

public class Demo01MapTest {
    public static void main(String[] args) {
        // 1. 使用 Scanner 获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = sc.nextLine();
        // 2. 创建 Map 集合，key是字符串中得字符，value 是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();
        // 3. 遍历字符串，获取每一个字符
        for (char c : str.toCharArray()) {
            // 4. 使用获取到的字符，去 Map 集合判断 key 是否存在
            if (map.containsKey(c)) {
                // key 存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                // key 不存在
                map.put(c,1);
            }
        }
        //  5. 遍历 Map 集合，输出结果
        for (Character c : map.keySet()) {
            Integer value = map.get(c);
            System.out.println(c + "=" + value);
        }
    }
}
