package fer.day12.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/11/23 20:55
 **/

/*
    哈希值：是一个十进制的整数，由系统随机给出(就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址
                                           不是数据实际存储的物理地址)
    在 Object 类中有一个方法，可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值
    hashCode 方法的源码：
        public native int hashCode();
        native: 代表该方法调用的是本地操作系统的方法
 */

public class Demo01HashCode {
    public static void main(String[] args) {
        // Person 类继承了 Object 类，所以可以使用 Object 类的 hashCode 方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1); // 189568618  | 重写 hasCode 后 1

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2); // 793589513  | 重写 hasCode 后 1

        /*
            toString 方法的源码
                return getClass().getName + "@" + Integer.toHexString(hasCode());
         */
        System.out.println(p1); // fer.day12.demo03.Person@b4c966a
        System.out.println(p2); // fer.day12.demo03.Person@2f4d3709

        /*
            String 类的哈希值
                String 类重写 Object 类的 hashCode 方法
         */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
