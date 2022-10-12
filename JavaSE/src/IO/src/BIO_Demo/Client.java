package IO.src.BIO_Demo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/16/9:22
 * @Description:
 */
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                //1、创建Socket对象请求服务器的链接
                Socket socket = new Socket("176.225.131.86",8080);
                //2、从Scoket对象中获取一个字节输出流
                OutputStream outputStream = socket.getOutputStream();
                //3、把字节输出流包装成一个打印流
                PrintStream printStream = new PrintStream(outputStream);
                printStream.println(scanner.next());
                printStream.flush();

            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
