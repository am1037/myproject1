package imageChange;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    static int i = 0;
    //static String[] images = {"1s.webp", "2s.webp", "3.webp"};
    //static String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
    static String[][] images = {
            {"1s.jpg", "1st digital single", "<html>1.fever<html>", "『fever』"},
            {"2s.jpg", "2nd digital single", "<html>1.東京の夜<html>", "『東京の夜』"},
            {"3s.jpg", "3rd digital single", "<html>1.happyend<br>2.happyend(instrumental)<html>", "『happyend』"}
    };
    static int N = -1+images.length;
    public static void main(String[] args) {
        Font fontBig = new Font("굴림", 1, 30);
        Font fontMiddle = new Font("굴림", 1, 20);
        Font fontSmall = new Font("굴림", 1, 10);

        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel contentPane = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("여기 제목이 나옵니다");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.CENTER);
        titleLabel.setPreferredSize(new Dimension(400, 60));
        titleLabel.setBackground(Color.YELLOW);
        titleLabel.setOpaque(true);
        titleLabel.setFont(fontBig);

        JLabel scoreLabel = new JLabel("여기 점수가 나옵니다");
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setVerticalAlignment(JLabel.CENTER);
        scoreLabel.setPreferredSize(new Dimension(400, 40));
        scoreLabel.setBackground(Color.green);
        scoreLabel.setOpaque(true);
        titleLabel.setFont(fontMiddle);

        JLabel descriptionLabel = new JLabel("여기 설명이 나옵니다");
        descriptionLabel.setHorizontalAlignment(JLabel.CENTER);
        descriptionLabel.setVerticalAlignment(JLabel.CENTER);
        descriptionLabel.setPreferredSize(new Dimension(400, 60));
        scoreLabel.setBackground(Color.gray);
        descriptionLabel.setFont(fontSmall);

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.add(titleLabel, BorderLayout.NORTH);
        titlePanel.add(scoreLabel, BorderLayout.CENTER);
        titlePanel.add(descriptionLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.pink);
        Image image = new ImageIcon("1s.jpg").getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        JButton prevButton = new JButton("<");
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(i>0) {i--;
                    Image image = new ImageIcon(images[i][0]).getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(image));
                    titleLabel.setText(images[i][3]);
                    scoreLabel.setText(images[i][1]);
                    descriptionLabel.setText(images[i][2]);
                }
            }
        });
        JButton nextButton = new JButton(">");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(i<N) {i++;
                    Image image = new ImageIcon(images[i][0]).getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(image));
                    titleLabel.setText(images[i][3]);
                    scoreLabel.setText(images[i][1]);
                    descriptionLabel.setText(images[i][2]);
                }
            }
        });

        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        contentPane.add(titlePanel, BorderLayout.NORTH);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        contentPane.add(imagePanel, BorderLayout.CENTER);

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        frame.setContentPane(contentPane);
        frame.setVisible(true);
    }

}
