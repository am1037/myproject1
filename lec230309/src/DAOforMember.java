import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOforMember {
    private static final DAOforMember intance = new DAOforMember();
    private DAOforMember(){}
    public static DAOforMember getIntance() {
        return intance;
    }

    Connection connection;
    String url = "jdbc:oracle:thin:@//localhost:1521/XE";
    String username = "system";
    String password = "oracle";

    private String sql;
    private ResultSet rs;
    private VOforMember vfm;
    private List<VOforMember> vfms;

    public void setConnection(){
        try{
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("접속 성공, isClosed() : "+ connection.isClosed());
        }catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public VOforMember selectMember(String id, String password){ // 로그인
        sql = "SELECT * FROM HR.BOOKMEMBER WHERE ID=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, id);
            rs = preparedStatement.executeQuery();
            if(rs.next()) {
                vfm = new VOforMember(rs.getString(1), rs.getString(2), rs.getString(3));
                if(vfm.getUSER_PASSWORD().equals(password)){
                    System.out.println("로그인 성공");
                }else{
                    System.out.println("비밀번호는 "+rs.getString(2)+" 입니다.");
                }
            } else {
                System.out.println("그런 아이디는 없다");
            }

        } catch (SQLException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }
        return vfm;
    }

    public void changePW(String id, String pw, String pw2){
        sql = "UPDATE HR.BOOKMEMBER SET PW=? WHERE ID=? AND PW=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, pw2);
            preparedStatement.setString(2, id);
            preparedStatement.setString(3, pw);
            int A = preparedStatement.executeUpdate();
            if(A==1){System.out.println("비밀번호 변경이 잘 되었어요");}
            else if(A==0){System.out.println("아무것도 안 바뀌었어요");}
            else{System.out.println("뭔가 잘못됐어요");}
        } catch (SQLException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }
    }

    public void changeName(String id, String pw, String name){
        sql = "UPDATE HR.BOOKMEMBER SET NAME=? WHERE ID=? AND PW=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, id);
            preparedStatement.setString(3, pw);
            int A = preparedStatement.executeUpdate();
            if(A==1){System.out.println("닉네임 변경이 잘 되었어요");}
            else if(A==0){System.out.println("아무것도 안 바뀌었어요");}
            else{System.out.println("뭔가 잘못됐어요");}
        } catch (SQLException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }
    }

    public List<VOforMember> showMemberById(String id){ // 아이디로 닉네임 찾기
        sql = "SELECT * FROM HR.BOOKMEMBER WHERE ID LIKE ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, "%"+id+"%");
            rs = preparedStatement.executeQuery();
            System.out.println(id+"의 문자열을 포함한 아이디를 가진 사람은");
            vfms = new ArrayList<VOforMember>();
            while(rs.next()) {
                vfms.add(new VOforMember(rs.getString(1), "", rs.getString(3)));
                System.out.println(rs.getString(1)+", "+rs.getString(3));
            }
            System.out.println("입니다.");
        } catch (SQLException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }
        return vfms;
    }

    public List<VOforMember> showMemberByNickname(String name){ // 아이디로 닉네임 찾기
        sql = "SELECT * FROM HR.BOOKMEMBER WHERE NAME LIKE ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, "%"+name+"%");
            rs = preparedStatement.executeQuery();
            System.out.println(name+"의 문자열을 포함한 닉네임을 가진 사람은");
            vfms = new ArrayList<VOforMember>();
            while(rs.next()) {
                vfms.add(new VOforMember(rs.getString(1), "", rs.getString(3)));
                System.out.println(rs.getString(1)+", "+rs.getString(3));
            }
            System.out.println("입니다.");
        } catch (SQLException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }
        return vfms;
    }

    public void insertMember(String id, String password, String nickname){ // 회원가입
        sql = "INSERT INTO HR.BOOKMEMBER VALUES (?, ?, ?)";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, nickname);
            int A = preparedStatement.executeUpdate();
            if(A==1){
                selectMember(id, password);
            }
            else{System.out.println("뭔가 잘못됐어요");}
        } catch (SQLException e){
            if(e.getErrorCode()==1){System.out.println("다른 아이디를 사용해주세요");};
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteMember(String id, String password){ // 회원탈퇴
        sql = "DELETE FROM HR.BOOKMEMBER WHERE ID=? AND PW=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, password);
            int A = preparedStatement.executeUpdate();
            if(A==1){System.out.println("삭제가 잘 되었어요");}
            else if(A==0){System.out.println("아무도 안 지워졌어요");}
            else{System.out.println("뭔가 잘못됐어요");}
        } catch (SQLException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("연결을 먼저 하세요!!!!");
        }
    }


}
