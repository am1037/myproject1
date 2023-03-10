import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class DAOforUSER {
    private static final DAOforUSER instance = new DAOforUSER();
    private DAOforUSER() {}
    public static DAOforUSER getInstance() {
        return instance;
    }

    List<RowFromUSER> reusltList = new ArrayList<>();
    private int keywordId = -1;
    private String keywordNICKNAME;
    private String keywordPASSWORD;

    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }

    public void setKeywordNICKNAME(String keywordNICKNAME) {
        this.keywordNICKNAME = keywordNICKNAME;
    }

    public void setKeywordPASSWORD(String keywordPASSWORD) {
        this.keywordPASSWORD = keywordPASSWORD;
    }

    public List<RowFromUSER> selectUSER(Connection con){
        sql = "SELECT * FROM BBS_USER WHERE USER_ID IS NOT NULL ";
        if(keywordId != -1) sql += "AND USER_ID="+String.valueOf(keywordId)+" ";
        if(keywordNICKNAME != null) sql += "AND USER_NICKNAME LIKE '%"+ keywordNICKNAME +"%' ";
        if(keywordPASSWORD != null) sql += "AND USER_PASSWORD LIKE '%"+ keywordPASSWORD +"%' ";
        System.out.println(sql);
        try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
            rs = preparedStatement.executeQuery();
            rsmd = rs.getMetaData();
            while (rs.next()) {
                reusltList.add(new RowFromUSER(rs.getInt(rsmd.getColumnName(1)), rs.getString(rsmd.getColumnName(2)), rs.getString(rsmd.getColumnName(3))));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return reusltList;
    }

}
