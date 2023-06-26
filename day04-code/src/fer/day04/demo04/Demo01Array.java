package fer.day04.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 16:19
 *
 * 定义一个数组，用来存储 3 个 Person 对象
 *
 * 数组的缺陷：一旦创建，程序运行期间长度不可以发生改变
 **/

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("尤尤", 23);
        Person two = new Person("fer", 24);
        Person three = new Person("能年", 28);

        // 将 one 当中的地址值赋值到数组的 0 号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());

    }
}
