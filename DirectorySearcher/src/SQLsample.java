import java.sql.*;

public class SQLsample {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "OF_EXAMPLES";
        String password = "1111";
        String sql1 = "SELECT TESTCOLUMN FROM OF_EXAMPLES.TESTTABLE";
        String sql2 = "INSERT INTO OF_EXAMPLES.TESTTABLE (TESTCOLUMN, TESTCOLUMN2) VALUES('3', 'a')";
        try(Connection conn = DriverManager.getConnection(url, username, password)){
            System.out.println("Connected to Oracle database!");
            Statement stmt = conn.createStatement();
            PreparedStatement pstmt = conn.prepareStatement(sql2);
            pstmt.executeUpdate();
            ResultSet rs = stmt.executeQuery(sql1);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }


    }

}
