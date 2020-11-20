package fer.day09.demo08;

import fer.day09.red.OpenMode;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/11/9 20:24
 **/
public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount;  // 平均值
        int mod = totalMoney % totalCount; // 余数，零头

        // 注意 totalCount - 1，最后一个先留着
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;
    }
}
