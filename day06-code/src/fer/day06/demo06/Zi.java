package fer.day06.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 19:20
 **/

public class Zi extends Fu {

    public Zi() {
//        super();  // 会默认有一个调用父类无参构造方法
        // 在调用父类重载的构造方法
        super(20);
//        super();  // 错误写法，只能调用一次
        System.out.println("子类构造方法！");
    }

    public void method() {
//        super();  // 错误写法，只有子类构造方法
    }


}
