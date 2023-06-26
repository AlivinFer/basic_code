package fer.day04.demo04;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 20:18
 *
 * ArrayList 当中常用方法有：
 *
 * public boolean add(E e): 向集合当中添加元素，参数类型和泛型一致
 * 备注：对于 ArrayList 集合来说，add 添加动作一定是成功的，所以返回值可用可不用
 * 但是对于其他集合来说，add 添加动作不一定成功
 *
 * public E get(int index): 从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
 *
 * public E remove(int index): 从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
 *
 * public int size(): 获取集合的尺寸长度，返回值就是集合当中包含的元素个数
 **/

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 向集合中添加元素：add
        boolean success = list.add("尤尤");
        System.out.println(list);
        System.out.println("添加操作是否成功：" + success);

        list.add("能年玲奈");
        list.add("伊泽瑞尔");
        list.add("盖伦");
        list.add("诺克萨斯");
        list.add("亚索");

        // 从集合中获取元素：get 索引值从 0 开始
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);

        // 从集合中删除元素：remove 索引值从 0 开始
        String whoRemoved = list.remove(5);
        System.out.println("被删除的人是：" + whoRemoved);
        System.out.println(list);

        // 获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);

        // 遍历数组
        for (String s : list) {
            System.out.println(s);
        }
    }

}
