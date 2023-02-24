package UDPTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws Exception{
        System.out.println("받는 쪽 소켓 준비 시작");
        DatagramSocket socket = new DatagramSocket(7100);
        System.out.println("받는 쪽 소켓 준비 끝");

        byte[] data = new byte[256];
        System.out.println("data : "+data+"\ndata.length : "+data.length);
        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.receive(packet);

        System.out.println("받은 데이터 : "+ new String(data));
        socket.close();
    }
}
