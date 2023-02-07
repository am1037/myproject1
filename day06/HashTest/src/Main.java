import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        HashSet hs = new HashSet<Integer>();
        for(int i=0; i<10;i++){
            str += br.readLine()+" ";
        }
        StringTokenizer st = new StringTokenizer(str);
        for(int i=0; i<10;i++){
            hs.add(Integer.parseInt(st.nextToken())%42);
        }
        System.out.println(hs.size());

    }
}