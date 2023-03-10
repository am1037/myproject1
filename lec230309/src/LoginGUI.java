import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class LoginGUI extends JFrame {

    JLabel labelProfile;

    JLabel labelID;
    JTextField fieldID;
    JLabel labelPW;
    JPasswordField fieldPW;

    JButton buttonLogin;
    JButton buttonFindIDPW;

    JButton buttonConnect;

    public LoginGUI(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        labelProfile = new JLabel("로그인 하지 않음");
        labelProfile.setSize(100, 20);
        labelProfile.setLocation(20, 20);
        add(labelProfile);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(2, 2, 10, 10));
        labelID = new JLabel("아이디");
        labelID.setHorizontalAlignment(JLabel.RIGHT);
        fieldID = new JTextField(10);
        labelPW = new JLabel("비밀번호");
        labelPW.setHorizontalAlignment(JLabel.RIGHT);
        fieldPW = new JPasswordField(10);
        loginPanel.add(labelID);
        loginPanel.add(fieldID);
        loginPanel.add(labelPW);
        loginPanel.add(fieldPW);
        loginPanel.setSize(200, 100);
        loginPanel.setLocation(80, 100);
        add(loginPanel);

        JPanel buttonPanel = new JPanel();
        buttonLogin = new JButton("로그인!");
        buttonFindIDPW = new JButton("IDPW찾기!");
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.setSize(200, 30);
        buttonPanel.setLocation(100, 210);
        buttonPanel.add(buttonLogin);
        buttonPanel.add(buttonFindIDPW);
        add(buttonPanel);
        setSize(400, 400);

        buttonConnect = new JButton("DB연결");
        buttonConnect.setSize(100, 30);
        buttonConnect.setLocation(150, 250);
        add(buttonConnect);

        buttonLogin.addActionListener(e -> {
            DAOforMember.getIntance().selectMember(fieldID.getText(), fieldPW.getText());
        });
        buttonFindIDPW.addActionListener(e -> {

        });
        buttonConnect.addActionListener(e -> {
//            try (Connection connection = DriverManager.getConnection(url, username, password)){
//                DAOforMember.getIntance().setConnection(connection);
//                System.out.println("접속 성공, isClosed() : "+ connection.isClosed());
//            }catch (Exception ee){
//                ee.printStackTrace();
//            }
            //여기서 오류가 이해가가는것 같은디..?
            //여기서 스코프가 끝나니까 connection도 사라지는거 같은데
            //그러니까 그냥 connection을 저쪽 클래스 안에서 해줘야 괜찮은거 같음
            DAOforMember.getIntance().setConnection();
            //이렇게 말야
        });

    }

    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
    }
}
