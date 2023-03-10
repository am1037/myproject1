import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "OF_EXAMPLES";
        String password = "1111";

        GUI4BBS.getInstance();

//        try(Connection con = DriverManager.getConnection(url, username, password)){
//
//        //DAOforBBS.getInstance().setKeywordTitle("");
//        //DAOforBBS.getInstance().setKeywordId(2);
//        List<RowFromBBS> list = DAOforBBS.getInstance().selectBBS(con);
//        List<RowFromUSER> list2 = DAOforUSER.getInstance().selectUSER(con);
//        for(RowFromUSER rfb : list2){
//            System.out.println(rfb.getUSER_ID()+", "+rfb.getUSER_NICKNAME()+", "+rfb.getUSER_PASSWORD());
//            System.out.println("");
//        }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }
}