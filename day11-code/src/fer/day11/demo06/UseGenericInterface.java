package fer.day11.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/11/20 20:04
 **/

/*
    测试含有泛型的接口
 */

public class UseGenericInterface {

    public static void main(String[] args) {
        // 创建对象
        GenericInterfaceImpl gi = new GenericInterfaceImpl();
        gi.method("字符串");

        GenericInterfaceImpl01<Integer> gi1 = new GenericInterfaceImpl01<>();
        gi1.method(10);

        GenericInterfaceImpl01<Float> gi2 = new GenericInterfaceImpl01<>();
        gi2.method(2.1f);

        GenericInterfaceImpl01<String> gi3 = new GenericInterfaceImpl01<>();
        gi3.method("handsome");
    }
}
