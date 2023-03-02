import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Openframeworks 예제를 oracle db에 넣기위한 프로그램
// 여기서는 path로 examples 폴더 경로를 받은 뒤에,
// 예제를 이름과 분류로 나눈다.
// 이름은 프로젝트 파일이 들어있는 폴더의 이름이고
// 분류는 그 parent의 parent 폴더의 이름이다.

public class Main {
    public static void main(String[] args)
    {
        List<String>[] stringList = DirectorySearcher.searchFolder("C:\\of_v0.11.2_vs2017_release\\examples");
        for(int i=0; i<stringList[0].size(); i++) {
            System.out.println(stringList[0].get(i)+" is a example of "+stringList[1].get(i));
        }

        HashSet<String> name_Project = new HashSet<>(stringList[0]);
        HashSet<String> name_Classification = new HashSet<>(stringList[1]);
        Inserter inserterClass = new Inserter();
        inserterClass.setHead("OF_EXAMPLES.CLASSIFICATION");
        inserterClass.setSet(name_Classification);
        System.out.println(inserterClass.stringList);

        List<String> stringList2 = new ArrayList<>();
        for(int i=0; i<stringList[0].size(); i++) {
            System.out.println(stringList[0].get(i)+" is a example of "+stringList[1].get(i));
            stringList2.add("INSERT INTO OF_EXAMPLES.EXAMPLES VALUES('"+stringList[0].get(i)+"', '"+stringList[1].get(i)+"', NULL, NULL)");
        }
        System.out.println(stringList2);

        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "OF_EXAMPLES";
        String password = "1111";
        try(Connection conn = DriverManager.getConnection(url, username, password)){
            for(String str:stringList2) {
                PreparedStatement pstmt = conn.prepareStatement(str);
                pstmt.executeUpdate();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}