package fer.day13.demo03;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author: Alivin Fer
 * @date: 2020/12/2 15:42
 **/

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口
特点：
    底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

    HashMap集合(以及之前所学的其它集合)：可以存储 null 值，null 键
    Hashtable集合，不能存储 null 值，null 键

    Hashtable 和 Vector 集合一样，在 jdk1.2版本之后被更先进的集合(HashMap,ArrayList)取代了
    Hashtable的子类 Properties 依然活跃在历史舞台上
    Properties 集合是一个唯一和 IO 流相结合的集合

 */

public class Demo02HashTable {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> ht = new Hashtable<>();
        ht.put(null, "fer"); // NullPointerException
        ht.put("zo", null);
        ht.put(null, null);
        System.out.println(ht);
    }


}
