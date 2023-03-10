import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class DAOforBBS {
    private static final DAOforBBS instance = new DAOforBBS();
    private DAOforBBS() {}
    public static DAOforBBS getInstance() {
        return instance;
    }

    List<RowFromBBS> reusltList = new ArrayList<>();
    private int keywordId = -1;
    private String keywordTitle;
    private int keywordAuthorId = -1;
    private String keywordContents;

    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }

    public void setKeywordTitle(String keywordTitle) {
        this.keywordTitle = keywordTitle;
    }

    public void setKeywordAuthorId(int keywordAuthorId) {
        this.keywordAuthorId = keywordAuthorId;
    }

    public void setKeywordContents(String keywordContents) {
        this.keywordContents = keywordContents;
    }

    public List<RowFromBBS> selectBBS(Connection con){
        sql = "SELECT * FROM BBS_BBS WHERE BBS_NO IS NOT NULL ";
        if(keywordId != -1) sql += "AND BBS_NO="+String.valueOf(keywordId)+" ";
        if(keywordTitle != null) sql += "AND BBS_TITLE LIKE '%"+keywordTitle+"%' ";
        if(keywordAuthorId != -1) sql += "AND BBS_AUTHORID="+String.valueOf(keywordAuthorId)+" ";
        if(keywordContents != null) sql += "AND BBS_CONTENTS LIKE '%"+keywordContents+"%' ";
        System.out.println(sql);
        try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
            rs = preparedStatement.executeQuery();
            rsmd = rs.getMetaData();
            while (rs.next()) {
                reusltList.add(new RowFromBBS(rs.getInt(rsmd.getColumnName(1)), rs.getString(rsmd.getColumnName(2)), rs.getInt(rsmd.getColumnName(3)), rs.getString(rsmd.getColumnName(4))));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return reusltList;
    }

}
