package classTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Door extends JFrame {
    JFrame f;
    ImageIcon titleIcon;
    JLabel titleLabel;
    JLabel idLabel;
    JLabel pwLabel;
    JTextField id;
    JPasswordField pw;
    JButton login;

    public Door(){
        titleIcon = new ImageIcon("diary.png");
        System.out.println(titleIcon);
        f = new JFrame();
        f.setTitle("일기장");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(400, 600);
        f.setLayout(null);
        f.setVisible(true);

        titleLabel = new JLabel(titleIcon);//new JLabel("일기장", SwingConstants.CENTER);
        idLabel = new JLabel("아이디");
        id = new JTextField("root",10);
        pwLabel = new JLabel("비밀번호");
        pw = new JPasswordField("5678");
        f.add(titleLabel);
        titleLabel.setBounds(50, 50, 300, 300);
        f.add(idLabel);
        f.add(id);
        f.add(pwLabel);
        f.add(pw);
        idLabel.setBounds(100, 400, 100, 20);
        id.setBounds(160, 400, 100, 20);
        pwLabel.setBounds(100, 420, 100, 20);
        pw.setBounds(160, 420, 100, 20);

        login = new JButton("로그인");
        f.add(login, BorderLayout.SOUTH);
        login.setBounds(110, 440, 140, 20);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idstr = id.getText();
                String pwstr = pw.getText();
                if(idstr.equals("root")&&pwstr.equals("5678")){
                    Page page = new Page();
                    //f.dispose();
                }else {JOptionPane.showMessageDialog(null, "아이디는 root 비밀번호는 5678");}
            }
        });
    }
}
