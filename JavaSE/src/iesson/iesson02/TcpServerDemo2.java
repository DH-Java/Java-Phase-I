package iesson.iesson02;


import java.io.ByteArrayOutputStream;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) throws Exception {
        //服务端
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){
            byteArrayOutputStream.write(bytes,0,len);
        }
        System.out.println(byteArrayOutputStream.toString());
        byteArrayOutputStream.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
