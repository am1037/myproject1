import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Inserter {
    List<String> stringList = new ArrayList<>();
    String head;
    String tail = "')";
    String sql = "";

    public Inserter(){

    }

    public void setHead(String str){
        head = "INSERT INTO " + str + " VALUES('";
    }

    public void setSet(Set<String> set){
        for(String str:set){
            stringList.add(head + str + tail);
        }
    }
}
