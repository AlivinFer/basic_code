package fer.day22.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: Alivin Fer
 * @date: 2021/1/7 14:25
 **/

/*
    文件上传案例的客户端：读取本地文件，上传到服务器，读取服务器回写的数据

    明确：
        数据源：C:\Users\\94212\\Pictures\\Saved Pictures\\nnln2.jpg
        目的地：服务器

        实现步骤：
            1. 创建一个本地字节输入流 FileInputStream 对象，构造方法中绑定要读取的数据源
            2. 创建一个客户端 Socket 对象，构造方法中绑定服务器的 IP 地址和端口号
            3. 使用 Socket 中的方法 getOutputStream，获取网络字节输出流 OutputStream 对象
            4. 使用本地字节输入流 FileInputStream 对象中的方法 read，读取本地文件
            5. 使用网络字节输出流 OutputStream 对象中的方法 write，把读取到的文件上传到服务器
            6. 使用 Socket 中的方法 getInputStream，获取网络字节输入流 InputStream 对象
            7. 使用网络字节输入流 InputStream 对象中的方法 read 读取服务器回写的数据
            8. 释放资源(FileInputStream, Socket)
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个本地字节输入流 FileInputStream 对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\94212\\Pictures\\Saved Pictures\\nnln2.jpg");
        // 2. 创建一个客户端 Socket 对象，构造方法中绑定服务器的 IP 地址和端口号
        Socket socket = new Socket("10.198.75.60", 7777);
        // 3. 使用 Socket 中的方法 getOutputStream，获取网络字节输出流 OutputStream 对象
        OutputStream os = socket.getOutputStream();
        // 4. 使用本地字节输入流 FileInputStream 对象中的方法 read，读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            // 5. 使用网络字节输出流 OutputStream 对象中的方法 write，把读取到的文件上传到服务器
            os.write(bytes, 0, len);
        }
        // 6. 使用 Socket 中的方法 getInputStream，获取网络字节输入流 InputStream 对象
        InputStream is = socket.getInputStream();
        // 7. 使用网络字节输入流 InputStream 对象中的方法 read 读取服务器回写的数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        // 8. 释放资源(FileInputStream, Socket)
        fis.close();
        socket.close();
    }
}
