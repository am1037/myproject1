package buttonEventEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(330, 350);
        f.getContentPane().setBackground(Color.green);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String str = "123";

        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);
        JButton b1 = new JButton();
        b1.setText("별10개");
        JButton b2 = new JButton();
        b2.setText("커피*5");
        JButton b3 = new JButton();
        b3.setText("커피*우유3개");
        JButton b4 = new JButton();
        b4.setText("1:짱!");

        Font font = new Font("D2Coding", 1, 45);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1();
            }
        });
    }

    public static void button1(){
     for(int i=0; i<10; i++){
         System.out.printf("*");
     }
     System.out.println("\n");
    }

    public static void button2(){
        for(int i=0; i<5; i++){
            System.out.printf("커피");
        }
        System.out.println("\n");
    }

    public static void button3(){
        for(int i=0; i<3; i++){
            System.out.printf("커피우유");
        }
        System.out.println("\n");
    }

    public static void button4(){
        for(int i=0; i<5; i++){
            System.out.printf((i+1)+"머여");
        }
        System.out.println("\n");
    }
}
