package ChatExample;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.*;

public class ChatFrame extends JFrame {
    JTextArea JTA;
    public ChatFrame(){
        setSize(400, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JTA = new JTextArea(); //채팅창
        JTA.setEnabled(false);
        JTextField JTF = new JTextField(); //입력창
        JButton JB = new JButton("보내요"); //보냄 버튼

        add(JTA);
        add(JTF);
        add(JB);

        pack();

        JB.addActionListener(e->{
            try {
                //System.out.println(JTF.getText());
                JTA.append("보낸 데이터 : "+JTF.getText() + "\n");
                byte[] data;
                InetAddress ip;
                data = JTF.getText().getBytes();
                ip = InetAddress.getByName("127.0.0.1");
                DatagramSocket socket = new DatagramSocket();
                DatagramPacket packet = new DatagramPacket(data, data.length, ip, 1111);
                socket.send(packet);
            } catch (Exception ee){
                ee.printStackTrace();
            }
        });
    }

    public void receiveProcess(){
        try {
        System.out.println("받는 쪽 소켓 준비 시작");
        DatagramSocket socket = new DatagramSocket(1111);
        System.out.println("받는 쪽 소켓 준비 끝");
        System.out.println("바이트 배열 준비 시작");
        byte[] data = new byte[256];
        System.out.println("data : "+data+"\ndata.length : "+data.length+"\n바이트 배열 준비 끝");
        System.out.println("패킷 준비 시작");
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("패킷 준비 끝");

            while (true) {
                System.out.println("receive while문 시작");
                socket.receive(packet);
                System.out.println("받은 데이터 : " + new String(data));
                JTA.append("받은 데이터 : " + new String(data));
                }
            } catch (SocketException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChatFrame cf = new ChatFrame();
        cf.receiveProcess();
    }
}
