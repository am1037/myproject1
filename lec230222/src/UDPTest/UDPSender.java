package UDPTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket;
        String str;
        byte[] data;
        InetAddress ip;

        socket = new DatagramSocket();
        str = "Hello, World!";
        data = str.getBytes();
        ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket packet =  new DatagramPacket(data, data.length, ip, 7100);

        socket.send(packet);
        System.out.println("클라이언트 포트 >> "+socket.getLocalPort());
        socket.close();
    }
}
