package ChatExample;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ChatFrame2 extends JFrame {
    final int sPORT = 0000; //내가 보내는 주소, 상대의 rPORT
    final int rPORT = 1111; //내가 받는 주소, 상대의 sPORT

    JTextArea JTA;
    public ChatFrame2(){
        setTitle("send : "+sPORT+", receive : "+rPORT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTA = new JTextArea(); //채팅창
        JTA.setEnabled(false);
        JTextField JTF = new JTextField(); //입력창
        JButton JB = new JButton("보내요"); //보냄 버튼

        setLayout(new BorderLayout());
        JTA.setMinimumSize(new Dimension(400, 500));
        JTA.setBackground(Color.gray);
        JTF.setMinimumSize(new Dimension(400, 50));
        JB.setMinimumSize(new Dimension(400, 50));
        add(JTA, BorderLayout.NORTH);
        add(JTF, BorderLayout.CENTER);
        add(JB, BorderLayout.SOUTH);
        pack();
        setSize(400, 600);

        JB.addActionListener(e->{
            try {
                //System.out.println(JTF.getText());
                JTA.append("보낸 데이터 : "+JTF.getText()+"\n");
                byte[] data;
                InetAddress ip;
                data = JTF.getText().getBytes();
                ip = InetAddress.getByName("127.0.0.1");
                DatagramSocket socket = new DatagramSocket();
                DatagramPacket packet = new DatagramPacket(data, data.length, ip, sPORT);
                socket.send(packet);
                JTF.setText("");
            } catch (Exception ee){
                ee.printStackTrace();
            }
        });
    }

    public void receiveProcess(){
        try {
        System.out.println("받는 쪽 소켓 준비 시작");
        DatagramSocket socket = new DatagramSocket(rPORT);
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
                JTA.append("받은 데이터 : " + new String(data)+"\n");
                }
            } catch (SocketException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChatFrame2 cf = new ChatFrame2();
        cf.receiveProcess();
    }
}
