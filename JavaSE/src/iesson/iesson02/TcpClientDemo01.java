package iesson.iesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//客服端
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //要知道服务器的地址，端口号
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            int port = 8080;
            //创建一个Scoket连接
            socket = new Socket(byName,port);
            //发送消息IO流
            outputStream = socket.getOutputStream();
            outputStream.write("第二个网络编程程序".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (socket !=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
