package fer.day04.demo05;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/16 19:34
 **/

/*
题目：
定义以指定格式打印集合的方法（ArrayList 类型作为参数），使用 {} 扩起集合，使用 @ 分隔每个集合
格式参照 {元素@元素@元素}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("提莫");
        list.add("德邦");
        list.add("德玛西亚皇子");
        System.out.println(list);

        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list) {
        // {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }
}
