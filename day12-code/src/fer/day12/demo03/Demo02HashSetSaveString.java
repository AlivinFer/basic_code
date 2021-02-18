package fer.day12.demo03;

import java.util.HashSet;

/**
 * @author: Alivin Fer
 * @date: 2020/11/24 20:59
 **/

/*
    Set 集合不允许重复元素的原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        // 创建 Set 集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("right");
        set.add("sure");
        System.out.println(set);
    }
}
