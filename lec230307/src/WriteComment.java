import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteComment {
    Connection conn;
    private PreparedStatement pstm;
    private int ID;

    private int mainN;
    private String contents;

    public WriteComment(Connection conn){
        this.conn = conn;
        System.out.println("setID, setContents, sendContents");
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setContents(int n, String contents) {
        this.mainN = n;
        this.contents = contents;
    }

    public void sendContents(){
        try {
            pstm = conn.prepareStatement("INSERT INTO BBS_COMMENT values (?, ?, ?, ?)");
            pstm.setInt(1, mainN);
            pstm.setInt(2, ID);
            pstm.setString(3, contents);
            pstm.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
