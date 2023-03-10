import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountCreater {
    Connection conn;
    private PreparedStatement pstm;

    private String nickname;

    public AccountCreater(Connection conn){
        this.conn = conn;
        System.out.println("setNickname, setAccount");
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAccount(){
        try {
            pstm = conn.prepareStatement("INSERT INTO BBS_USER VALUES (BBS_USER_SQ.nextval, ?)");
            pstm.setString(1, nickname);
            pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
