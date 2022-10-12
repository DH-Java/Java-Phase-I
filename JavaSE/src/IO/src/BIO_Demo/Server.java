package IO.src.BIO_Demo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/16/9:16
 * @Description:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
    服务端接收来自客户端的信息并打印出来
 */
@SuppressWarnings("all")
public class Server {
    public static void main(String[] args) {
        System.out.println("==服务端启动==");
        try {
            //1、定义一个Socket对象进行服务器端口的注册
            ServerSocket serverSocket = new ServerSocket(8080);
            while (true){
                //2、监听客户端的Scoket链接请求
                Socket socket = serverSocket.accept();
                //3、从Socket管道中得到一个字节流输入对象
                InputStream inputStream = socket.getInputStream();
                //4、把字节流输入对象包装成缓冲字符输入流对象
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String msg = "";
                if ((msg=bufferedReader.readLine())!=null){
                    System.out.println("服务端接收到的请求："+msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
