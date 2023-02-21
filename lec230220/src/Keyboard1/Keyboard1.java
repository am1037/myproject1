package Keyboard1;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Keyboard1 extends JFrame{
    ImageIcon icon = new ImageIcon("drop.png");

    JLabel k = new JLabel();


    Keyboard1(){


        this.setTitle("10픽셀씩 이미지 이동");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);


        k.setIcon(icon);
        k.setLocation(10, 10);
        k.setSize(64, 64);

        this.add(k);

        this.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e){
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        k.setLocation(k.getX(), k.getY()-10);
                        break;

                    case KeyEvent.VK_DOWN:
                        k.setLocation(k.getX(), k.getY()+10);
                        break;
                    case KeyEvent.VK_LEFT:
                        k.setLocation(k.getX()-10, k.getY());
                        break;
                    case KeyEvent.VK_RIGHT:
                        k.setLocation(k.getX()+10, k.getY());
                        break;


                }

            }
        });


        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Keyboard1();

    }
}