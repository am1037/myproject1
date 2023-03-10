import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MenuGUI extends JFrame {
    int id;
    Connection conn;

    JTextField jTextField = new JTextField();
    JButton button1 = new JButton("Create Account");
    JButton button2 = new JButton("Write Article");
    JButton button3 = new JButton("Write Comment");
    JButton button4 = new JButton("Delete Article");

    public MenuGUI(Connection conn){
        this.conn = conn;
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));
        add(jTextField);
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        ActionListener actionListener = e -> {
            if(e.getSource() == button1) {AccountGUI accountGUI = new AccountGUI(conn);}
            if(e.getSource() == button2) {WriteGUI writeGUI = new WriteGUI(Integer.parseInt(jTextField.getText()), conn);}
            if(e.getSource() == button3) {
                try(PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM BBS_USER")){
                    ResultSet rs = preparedStatement.executeQuery();
                    ResultSetMetaData rsmd = rs.getMetaData();
                    while (rs.next()) {
                        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                            System.out.print(rs.getString(rsmd.getColumnName(i))+", ");
                        }
                        System.out.println("");
                    }
                }catch (Exception ee){
                    ee.printStackTrace();
                }
            }
            if(e.getSource() == button4) {WriteGUI writeGUI = new WriteGUI(1, conn);}
        };
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);

        setVisible(true);



}


}