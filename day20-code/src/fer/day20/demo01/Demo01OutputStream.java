package fer.day20.demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Alivin Fer
 * @date: 2021/1/4 13:48
 **/

/*
    java.io.OutputStream：此抽象类是表示输出字节流的所有类的超类

    定义一些公共的方法
        void close()：关闭此输出流并释放与此流有关的所有系统资源。
        void flush()：刷新此输出流并强制写出所有缓冲的输出字节。
        void write(byte[] b)：将 b.length 个字节从指定的 byte 数组写入此输出流。
        void write(byte[] b, int off, int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        abstract void write(int b)：将指定的字节写入此输出流。

    public class FileOutputStream extends OutputStream
        文件输出流是用于将数据写入 File 或 FileDescriptor 的输出流。

    构造方法：
        FileOutputStream(File file)
            创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        FileOutputStream(File file, boolean append)
            创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        FileOutputStream(FileDescriptor fdObj)
            创建一个向指定文件描述符处写入数据的输出文件流，该文件描述符表示一个到文件系统中的某个实际文件的现有连接。
        FileOutputStream(String name)
            创建一个向具有指定名称的文件中写入数据的输出文件流。
        FileOutputStream(String name, boolean append)
            创建一个向具有指定 name 的文件中写入数据的输出文件流。

    作用：
        1. 创建一个 FileOutputStream 对象
        2. 会根据构造方法中传递的文件/文件路径，创建一个空的文件
        3. 会把 FileOutputStream 对象指向创建好的文件
 */

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\IntelliJ IDEA Community Edition 2019.1.3\\" +
                                               "basic_code\\day20-code\\src\\fer\\day20\\demo02druid\\a.txt");
        fos.write(97);
        fos.close();
    }
}
