package classTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Page {
    JFrame f;
    JPanel ff;
    JTextField title;
    JTextField dateText;
    JTextArea text;
    JButton jb;

    public Page(){
        f = new JFrame();
        ff = new JPanel();
        f.setLayout(new BorderLayout());
        ff.setLayout(new BorderLayout());
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Date date = new Date();
        String[] strAdate = date.toString().split(" ");
        String strdata = strAdate[0]+" "+strAdate[1]+" "+strAdate[2];

        title = new JTextField("제목 칸입니다");
        dateText = new JTextField(strdata);
        dateText.setEnabled(false);
        text = new JTextArea("아무 말이나 적으세요");
        jb = new JButton("제출 버튼입니다");

        ff.add(title, BorderLayout.NORTH);
        ff.add(dateText, BorderLayout.SOUTH);
        f.add(ff, BorderLayout.NORTH);
        f.add(text, BorderLayout.CENTER);
        f.add(jb, BorderLayout.SOUTH);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = title.getText();
                String str2 = text.getText();
                Main_3.getContent(str1, str2);
                try {
                    FileWriter file = new FileWriter(strdata+" "+strAdate[3].replace(":", "")+".txt");
                    file.write(str1+"\n");
                    file.write(date.toString()+"\n");
                    file.write(str2+"\n");
                    file.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }
}
