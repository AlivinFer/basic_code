package fer.day22.demo02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Alivin Fer
 * @date: 2021/1/7 14:46
 **/

/*
    文件上传案例服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写 上传成功

    明确：
        数据源：客户端上传的文件
        目的地：服务器的硬盘 E:\IntelliJ IDEA Community Edition 2019.1.3\basic_code\day22-code\src\fer\day22\demo02druid\nnln2.jpg
 */

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个服务器 ServerSocket 对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(7777);
        // 2. 使用 ServerSocket 对象中的方法 accept，获取到请求的客户端 Socket 对象
        Socket socket = server.accept();
        // 3. 使用 Socket 对象中的方法 getInputStream，获取到网络字节输入流 InputStream 对象
        InputStream is = socket.getInputStream();
        // 4. 判断目的文件夹是否存在
        File file = new File("E:\\IntelliJ IDEA Community Edition 2019.1.3\\basic_code\\day22-code\\src\\fer\\day22\\demo02druid");
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file + "\\nnln2.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        socket.getOutputStream().write("上传成功".getBytes());
        // 释放资源
        fos.close();
        socket.close();
        server.close();

    }
}
