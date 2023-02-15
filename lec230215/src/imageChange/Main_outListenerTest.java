package imageChange;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_outListenerTest implements ActionListener {

    private JLabel label;

    public Main_outListenerTest() {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.addActionListener(this);
        button2.addActionListener(this);

        label = new JLabel("No button clicked");

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();
        label.setText(buttonText + " clicked");
    }

    public static void main(String[] args) {
        new Main_outListenerTest();
    }
}