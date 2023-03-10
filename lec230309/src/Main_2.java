import java.sql.Connection;
import java.sql.DriverManager;

public class Main_2 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "system";
        String password = "oracle";
        try(Connection connn = DriverManager.getConnection(url, username, password)){
            System.out.println("연결이 잘 되었어요");
            DAOforMember.getIntance().selectMember("hong", "43333321");
//            DAOforMember.getIntance().insertMember("hong", "12234", "홍길동");
//            DAOforMember.getIntance().insertMember("hong", "1234", "홍길동");
//            DAOforMember.getIntance().showMemberById("ho");
//            DAOforMember.getIntance().showMemberByNickname("홍");
//            VOforMember vOforMember = DAOforMember.getIntance().selectMember("hong", "122334");
//            System.out.println(vOforMember.getUSER_ID()+", "+vOforMember.getUSER_PASSWORD()+", "+vOforMember.getUSER_NICKNAME());
//            DAOforMember.getIntance().deleteMember("hong", "1234");
//            DAOforMember.getIntance().changePW("honghong", "3214", "1234");
//          DAOforMember.getIntance().changeName("honghong", "1234", "동길홍");
        }catch (Exception e){

        }
    }
}
