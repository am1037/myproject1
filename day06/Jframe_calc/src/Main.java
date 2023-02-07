import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.getContentPane().setBackground(Color.cyan);
        ImageIcon icon = new ImageIcon("123.png");
        Font font = new Font("굴림", 1, 20);
        FlowLayout flow = new FlowLayout();

        JLabel jl1 = new JLabel();
        jl1.setIcon(icon);

        JLabel jl2 = new JLabel("숫자1");
        jl2.setFont(font);
        JLabel jl3 = new JLabel("숫자2");
        jl3.setFont(font);
        JTextField jtf1 = new JTextField(15);
        jtf1.setFont(font);
        JTextField jtf2 = new JTextField(15);
        jtf2.setFont(font);
        JButton jb1 = new JButton("+");
        JButton jb2 = new JButton("-");
        JButton jb3 = new JButton("*");
        JButton jb4 = new JButton("/");
        jb1.setFont(font);
        jb2.setFont(font);
        jb3.setFont(font);
        jb4.setFont(font);

        f.setLayout(flow);
        f.add(jl1);
        f.add(jl2);
        f.add(jtf1);
        f.add(jl3);
        f.add(jtf2);
        f.add(jb1);
        f.add(jb2);
        f.add(jb3);
        f.add(jb4);

        f.setVisible(true);
    }
}