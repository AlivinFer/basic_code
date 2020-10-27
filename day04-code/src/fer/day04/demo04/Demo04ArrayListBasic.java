package fer.day04.demo04;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/15 21:29
 **/

/*
如果希望向集合 ArrayList 当中存储基本类型数据，必须使用基本类型对应的 "包装类"

基本类型        包装类（引用类型，包装类都位于 java.lang 包下）
byte            Byte
short           Short
int             Integer
long            Long
char            Character
float           Float
double          Double
boolean         Boolean

从 JDK 1.5+ 开始，支持自动装箱、自动拆箱
自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */

//  ArrayList 集合存储基本数据
public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        // 错误写法！泛型只能是引用类型，不能是基本类型
//    ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(250);
        listC.add(520);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("第1号元素是：" + num);
    }


}
