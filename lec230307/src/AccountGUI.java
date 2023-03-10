import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class AccountGUI extends JFrame {
    Connection conn;

    JTextField nicknameField = new JTextField(20);
    JButton button = new JButton("Submit");

    public AccountGUI(Connection conn){
        this.conn = conn;
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        add(nicknameField);
        add(button);
        setVisible(true);

        button.addActionListener(e -> {
            AccountCreater accountCreater = new AccountCreater(conn);
            accountCreater.setNickname(nicknameField.getText());
            accountCreater.setAccount();
            System.out.println("account created");
        });


}


}