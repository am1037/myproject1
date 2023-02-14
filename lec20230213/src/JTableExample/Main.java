package JTableExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.setSize(500, 500);
        String[] header = {"a", "b", "c"};
//        String[][] contents = {
//                {"A", "B", "C"},
//                {"D", "E", "F"},
//                {"G", "H", "I"}
//        };
        ArrayList<String[]> contents = new ArrayList<>();
        contents.add(new String[]{"A", "B", "C"});
        contents.add(new String[]{"D", "E", "F"});
        contents.add(new String[]{"G", "H", "I"});
        String[][] contentsS = contents.toArray(new String[0][0]);
        JTable jTable = new JTable(contentsS, header);
        JScrollPane jsp = new JScrollPane(jTable);
        f.add(jsp, BorderLayout.CENTER);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Random r = new Random();
        JButton jb = new JButton("add data");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] tempstr = new String[3];
                for(int i=0; i<header.length; i++){
                    tempstr[i] = Character.toString((char)r.nextInt(100));
                }
                contents.add(tempstr);
                String[][] contentsSS = contents.toArray(new String[0][0]);
            }
        });
        f.add(jb, BorderLayout.SOUTH);
    }
}
