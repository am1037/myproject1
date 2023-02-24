package TCPServerTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args){
        BufferedReader br;
        try {
            for(int i=0; i<100; i++) {
                Socket socket = new Socket("localhost", 1234);
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("클라이언트1 연결 성공!, "+i);
                System.out.println(br.readLine());
            }
        } catch (ConnectException e){
            System.out.println("흑흑 쫓겨났어요");
        } catch (IOException e){
            System.out.println("이게 머선 129");
        }

    }
}
