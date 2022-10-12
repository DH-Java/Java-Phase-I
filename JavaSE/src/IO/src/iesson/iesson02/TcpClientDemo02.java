package IO.src.iesson.iesson02;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        //客户端
        //获取ip和创建端口
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int port = 8080;
        Socket socket = new Socket(byName, port);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("第二次网络编程".getBytes(StandardCharsets.UTF_8));

        outputStream.close();
        socket.close();
    }
}
