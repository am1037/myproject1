package ImSleepy;

import javax.swing.*;
import java.awt.*;

public class FrameExample extends JFrame {
    JButton[] jbs = new JButton[3];
    public FrameExample() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        setSize(400, 400);
        setVisible(true);
        for(JButton jb : jbs){
            jb = new JButton();
            add(jb);
        }
    }

    public static void main(String[] args) {
        FrameExample fe = new FrameExample();

    }
}
