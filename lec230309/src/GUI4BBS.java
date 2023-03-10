import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class GUI4BBS extends JFrame {
    private static final GUI4BBS instance = new GUI4BBS();
    public static GUI4BBS getInstance() {
        return instance;
    }

    JTextField fieldID;
    JTextField fieldAuthorID;
    JTextField fieldTitle;
    JTextField fieldContents;

    JTextField temporaryFields;

    JButton search;
    JButton connectButton;

    Connection con;

    private GUI4BBS(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JPanel panel4Inputs = new JPanel();
        panel4Inputs.setLayout(new GridLayout(4, 1));

        //입력창
        fieldID = new JTextField(10);
        fieldAuthorID = new JTextField(10);
        fieldTitle = new JTextField(10);
        fieldContents = new JTextField(10);
        panel4Inputs.add(fieldID);
        panel4Inputs.add(fieldAuthorID);
        panel4Inputs.add(fieldTitle);
        panel4Inputs.add(fieldContents);

        panel4Inputs.setLocation(100, 50);
        panel4Inputs.setSize(400, 160);
        add(panel4Inputs);

        //버튼
        connectButton = new JButton("CONNECT");
        connectButton.setSize(100, 30);
        connectButton.setLocation(250, 220);
        add(connectButton);

        search = new JButton("SEARCH");
        search.setSize(100, 30);
        search.setLocation(250, 260);
        add(search);

        ActionListener actionListener = e -> {
            if(e.getSource()==search){
                if(!fieldID.getText().equals("")) DAOforBBS.getInstance().setKeywordId(Integer.parseInt(fieldID.getText()));
                DAOforBBS.getInstance().setKeywordTitle(fieldTitle.getText());
                if(!fieldAuthorID.getText().equals("")) DAOforBBS.getInstance().setKeywordAuthorId(Integer.parseInt(fieldAuthorID.getText()));
                DAOforBBS.getInstance().setKeywordContents(fieldContents.getText());

                List<RowFromBBS> list = DAOforBBS.getInstance().selectBBS(con);
                    for(RowFromBBS rfb : list){
                        System.out.println(rfb.getBBS_No()+", "+rfb.getBBS_Title()+", "+rfb.getBBS_AuthorId());
                        System.out.println("");
                    }
                list.clear();
            }
            if(e.getSource()==connectButton){
                String url = "jdbc:oracle:thin:@//localhost:1521/XE";
                String username = "OF_EXAMPLES";
                String password = "1111";
                try {
                    con = DriverManager.getConnection(url, username, password);
                    System.out.println("이렇게도 연결되나?");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        };
        search.addActionListener(actionListener);
        connectButton.addActionListener(actionListener);

        setSize(600, 800);
    }
}
