package fer.day06.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 16:03
 **/

public class Zi extends Fu {

    // 在前面加上覆盖重写符号 @Override 便于检测是否写对
    @Override
    public void method() {
    }

    // 覆盖重写时子类的返回值范围小于等于父类
    @Override
    public String method1(){
        return null;
    }
}
