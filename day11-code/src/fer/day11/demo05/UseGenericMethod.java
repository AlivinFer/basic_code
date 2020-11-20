package fer.day11.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/11/20 18:57
 **/
public class UseGenericMethod {

    public static void main(String[] args) {
        // 创建 GenericMethod 对象
        GenericMethod gm = new GenericMethod();

        /*
            调用含有泛型的方法 method01
            传递什么类型，泛型就是什么类型
         */
        gm.method01(10);
        gm.method01("ok");
        gm.method01(1.2);
        gm.method01(true);

        // 静态方法(通过类名调用)
        GenericMethod.method02("静态方法");

    }
}
