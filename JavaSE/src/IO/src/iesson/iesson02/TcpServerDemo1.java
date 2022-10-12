package IO.src.iesson.iesson02;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpServerDemo1 {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;

        Socket socket = null;

        InputStream inputStream = null;

        ByteArrayOutputStream byteArrayInputStream = null;
        //1、我的有一个地址
        try {
            //创建绑定到指定端口的服务器套接字。
             serverSocket = new ServerSocket(8080);
            //2、等待客户端连接过来
            while (true){
                //侦听要连接到此套接字并接受它。 该方法将阻塞直到建立连接·
                socket = serverSocket.accept();
                //3、读取客户端的信息
                inputStream = socket.getInputStream();
            /*byte[] bytes = new byte[1024];
            int len;
            while ((len=inputStream.read(bytes))!=-1){
                String s = new String(bytes, 0, len);
                System.out.println(s);
            }*/
                //4、管道流
                byteArrayInputStream = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int len;
                while ((len=inputStream.read(bytes))!=-1){
                    byteArrayInputStream.write(bytes,0,len);
                }
                System.out.println(byteArrayInputStream.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (byteArrayInputStream!=null){
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream !=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket !=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }




    }
}
