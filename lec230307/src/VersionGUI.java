import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VersionGUI extends JFrame {
    int id;
    Connection conn;


    JPanel panel = new JPanel();
    JTextField titleField = new JTextField(20);
    JTextArea contentField = new JTextArea(10, 20);
    JButton button = new JButton("Submit");

    public VersionGUI(int id, Connection conn){
        this.id = id;
        this.conn = conn;
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new BorderLayout());
        panel.add(titleField, BorderLayout.NORTH);
        panel.add(contentField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        button.setPreferredSize(new Dimension(100, 50));
        add(panel);

        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
//                    String url = "jdbc:oracle:thin:@localhost:1521:xe";
//                    String user = "OF_EXAMPLES";
//                    String password = "1111";
//                    conn = DriverManager.getConnection(url, user, password);
                    System.out.println(conn.isClosed());
                    WriteArticle wa = new WriteArticle(conn);
                    wa.setID(id);
                    wa.setContents(titleField.getText(), contentField.getText());
                    wa.sendContents();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
    });


}


}