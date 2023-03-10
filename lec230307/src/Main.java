import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "OF_EXAMPLES";
        String password = "1111";
            System.out.println("연결되었답니당");
////            AccountCreater ac = new AccountCreater(conn);
////            ac.setNickname("저또한아이디입니다");
////            ac.setAccount();
//
//            WriteArticle wc = new WriteArticle(conn);
//            wc.setID(1);
//            wc.setContents("제목이랍니다", "내용내용\n내내용");
//            wc.sendContents();
        Connection conn = DriverManager.getConnection(url, user, password);
            MenuGUI versionGUI = new MenuGUI(conn);

    }
}