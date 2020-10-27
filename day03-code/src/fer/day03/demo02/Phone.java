package fer.day03.demo02;

/**
 * @author: Alivin Fer
 * @date: 2020/10/11 11:00
 **/


public class Phone {
    // 定义成员变量
    String brand;  // 品牌
    double price;  // 价格
    String color; // 颜色

    // 定义成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public  void sendMessage(){
        System.out.println("群发短信");
    }
}
