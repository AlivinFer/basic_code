package fer.day09.demo07;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List 正是 ArrayList 所实现的接口
 */

/**
 * @author: Alivin Fer
 * @date: 2020/11/8 17:00
 **/

// 接口作为方法的参数或返回值
public class DemoInterface {

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        // 左边是接口名称，右边是实现类名称（多态写法）
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addName(List<String> list) {
        list.add("伊泽瑞尔");
        list.add("图奇");
        list.add("希维尔");
        list.add("艾希");
        return list;
    }
}
