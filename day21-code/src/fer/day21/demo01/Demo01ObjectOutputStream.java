package fer.day21.demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author: Alivin Fer
 * @date: 2021/1/5 10:29
 **/

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        // 1. 创建 ObjectOutputStream 对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day21-code\\src\\fer\\day21\\demo02druid\\person.txt"));
        // 2. 使用 ObjectOutputStream 对象中的方法 writeObject 把对象写入到文件中
        oos.writeObject(new Person("小花", 18));
        // 3. 释放资源
        oos.close();



    }

}
