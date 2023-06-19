package fer.day01.demo02;

/**
 * @author Alivin Fer
 */

public class Demo01Method {

    public static void main(String[] args) {
        // 不允许任何魔法值（即未经定义的常量）直接出现在代码中
        int m = 5, n = 20;
        // 快捷生成 for 循环 number.fori
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
