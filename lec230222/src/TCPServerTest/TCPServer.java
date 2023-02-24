package TCPServerTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("TCP 소켓 열림");
        System.out.println("연결 기다리는 중");
        int count = 0;
        Socket socket;
        PrintWriter out;
        BufferedReader br;
        while(true){
            socket = server.accept();
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("안녕하세요!");
            out.close();
            socket.close();
            count++;
            System.out.println("승인완료, count 수 : "+count);
        }

    }
}
