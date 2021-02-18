package fer.day23.demo03;

/**
 * @author: Alivin Fer
 * @date: 2021/1/7 21:46
 **/

/*
    JDK中预定义的一些注解
        @Override：检查被该注解标注的方法是否是继承自父类(接口)的
        @Deprecated：表示该注解标注的内容已过时
        @SuppressWarnings：压制警告
 */
@SuppressWarnings("all")
public class Demo01Anno {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        // 有缺陷
    }

    public void show2() {
        // 替代已过时的 show1 方法
    }

    public void demo() {
        show1();
    }
}
