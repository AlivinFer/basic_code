package fer.day09.red;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/11/9 19:16
 **/

public interface OpenMode {
    /**
     * 红包计算
     *
     * @param totalMoney            总金额为方便计算，已经转换为整数，单位为分
     * @param totalCount            红包个数
     * @return ArrayList<Integer>   元素为各个红包的金额值，所有元素的值累计等于总金额
     */
     ArrayList<Integer> divide(int totalMoney, int totalCount);
}
