package fer.day11.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/18 21:12
 **/

// 没有使用泛型的方法
public class Demo03UseGeneralClass {

    public static void main(String[] args) {
        // 不写泛型默认是 Object 类型
        GeneralClass generalClass = new GeneralClass();
        generalClass.setName("小天");

        String name = generalClass.getName();
        System.out.println(name);
    }
}
