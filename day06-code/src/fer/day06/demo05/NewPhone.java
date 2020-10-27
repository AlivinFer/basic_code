package fer.day06.demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/10/26 18:41
 **/

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();  // 把父类的 show 方法拿过来用，避免代码重复
        System.out.println("显示姓名");
        System.out.println("显示图像");
    }
}
