package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 11:00
 **/


public class Phone {
    /**
     * 定义成员变量
     * brand: 品牌
     * price：价格
     * color：颜色
     */
    String brand;
    double price;
    String color;

    /**
     * 定义成员方法
     */
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}
