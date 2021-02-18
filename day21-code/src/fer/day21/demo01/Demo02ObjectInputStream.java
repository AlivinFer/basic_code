package fer.day21.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author: Alivin Fer
 * @date: 2021/1/5 11:15
 **/

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream: 对象的反序列化流
    作用：把文件中保存的对象，以流的方式读取出来使用

    构造方法：
        ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream
        参数：
            InputStream in：字节输入流
        特有的成员方法：
            Object readObject() 从 ObjectInputStream 读取对象
 */

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day21-code\\src\\fer\\day21\\demo02druid\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);



    }
}
