package fer.day14.demo02;

import java.util.Objects;

/**
 * @author: Alivin Fer
 * @date: 2020/12/4 21:56
 **/

/*
    Objects 的用法 (用于判断方法的参数是否为 null)
    public static <T> requireNonNull(T obj): 查看指定引用对象不是 null
 */
public class Demo03Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
        // 对传递过来的参数进行合法性判断，判断是否为 null
        /*if (obj == null) {
            throw new NullPointerException("传递的对象的值是 null");
        }*/

        // 使用 Objects 进行简化
        // Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象的值为 null");
    }
}
