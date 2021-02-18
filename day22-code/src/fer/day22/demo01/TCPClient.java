package fer.day22.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: Alivin Fer
 * @date: 2021/1/6 16:27
 **/

/*
    TCP 通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
    表示客户端的类：
        java.net.Socket：此类实现客户端套接字。套接字是两台机器间通信的端点。
        套接字：包含了 IP 地址和端口号的网络单位
    构造方法：
        Socket(String host, int port)
            创建一个流套接字并将其连接到指定主机上的指定端口号。
    成员方法：
        OutputStream getOutputStream()
            返回此套接字的输出流。
        InputStream getInputStream()
            返回此套接字的输入流。
        void close()
            关闭此套接字。

    实现步骤：
        1. 创建一个客户端对象 Socket，构造方法绑定服务器的 IP 地址和端口号
        2. 使用 Socket 对象中的方法 getOutputStream() 获取网络字节输出流 OutputStream 对象
        3. 使用网络字节输出流 OutputStream 对象中的方法 write，给服务器发送数据
        4. 使用 Socket 对象中的方法 getInputStream() 获取网路字节输入流的 InputStream 对象
        5. 使用网络字节输入流 InputStream 对象中的方法 read，读取服务器回写的数据
        6. 释放资源

    注意：
        1. 客户端和服务器端进行交互，必须使用 Socket 中提供的网络流，不能使用字节创建的流对象
        2. 当我们创建客户端对象 Socket 的时候，就会去请求服务器和服务器经过3次握手建立连接通路
            这时如果服务器没有启动，那么就会排除异常
            如果服务器已经启动，那么就可以进行交互
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.198.75.60", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is = socket.getInputStream();
         byte[] bytes = new byte[1024];
         int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        socket.close();

    }
}
