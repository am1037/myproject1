import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteArticle {
    Connection conn;
    private PreparedStatement pstm;
    private int ID;
    private int num;


    public DeleteArticle(Connection conn){
        this.conn = conn;
        System.out.println("setNo");
    }

    public void setNo(int ID) {
        this.ID = ID;
    }
    public void deleteContents(){
        try {
            pstm = conn.prepareStatement("DELETE FROM BBS_BBS WHERE BBS_NO=?");
            pstm.setInt(1, ID);
            pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
