package fer.day06.demo11;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/28 20:41
 **/

/*
实现一个发红包的案例
包括三个类：
父类：用户
子类：群主、成员
群主发红包，用户平均收，零余的给最后一位领红包的
成员收红包
 */

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("肥仔", 100);

        Member member1 = new Member("小郭",0);
        Member member2 = new Member("阿松", 2);
        Member member3 = new Member("小杨", 10);
        Member member4 = new Member("黑猪", 3);
        Member member5 = new Member("志龙", 1);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();
        System.out.println("================");

        // 群主总共发 20 块钱，分成 3 个红包
        ArrayList<Integer> redList = manager.send(20, 3);
        // 三个普通成员收红包
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        manager.show();  // 100-20=80
        // 6、6、8 随机分给3个人
        member1.show();
        member2.show();
        member3.show();
    }
}
