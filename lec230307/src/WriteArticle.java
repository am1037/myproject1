import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteArticle {
    Connection conn;
    private PreparedStatement pstm;
    private int ID;

    private String title;
    private String contents;

    public WriteArticle(Connection conn){
        this.conn = conn;
        System.out.println("setID, setContents, sendContents");
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setContents(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void sendContents(){
        try {
            pstm = conn.prepareStatement("INSERT INTO BBS_BBS values (BBS_BBS_SQ.nextval, ?, ?, ?)");
            System.out.println("hmm"+conn.isClosed());
            pstm.setString(1, title);
            pstm.setInt(2, ID);
            pstm.setString(3, contents);
            pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
