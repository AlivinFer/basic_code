package fer.day06.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 16:03
 **/

public class Zi extends Fu {

    /**
     * 在前面加上覆盖重写符号 @Override 便于检测是否写对
     */
    @Override
    public void method() {
        System.out.println("执行子类方法！");
    }

    /**
     * 覆盖重写时子类的返回值范围小于等于父类
     */
    @Override
    public String method1(){
        return "zi class method";
    }

    public void method2(){
        System.out.println("belong to zi class method3");
    }
}
