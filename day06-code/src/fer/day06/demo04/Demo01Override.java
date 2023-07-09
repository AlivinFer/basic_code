package fer.day06.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 16:02
 *
 * 方法重写的注意事项：
 *
 * 1. 必须保证父子类的方法名称相同，参数列表也相同
 *  --@override：写在方法前面，用来检测是不是有效的正确覆盖重写。
 * 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
 *
 * 2. 子类方法的返回值必须小于等于父类方法的返回值范围
 * 小扩展提示：java.lang.Object 类是所有类的公共最高父类（祖宗类），java.lang.String 就是 Object 的子类
 *
 * 3. 子类方法的权限必须【大于等于】父类方法的权限修饰符
 * 小扩展提示：public > protected > (default) > private
 * 备注：（default）不是关键字default，而是什么都不写，留空
 **/

public class Demo01Override {

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.method();
        System.out.println(fu.method1());

        Zi zi = new Zi();
        zi.method();
        System.out.println(zi.method1());


        Fu fu1 = new Zi();
        // 优先使用子类方法
        fu1.method();
        System.out.println(fu1.method1());
        fu1.method3();
    }
}
