import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] N = new int[10];
        int[] n = new int[10];
        for(int i=0; i<10; i++){
            N[i] = Integer.parseInt(br.readLine());
            n[i] = N[i]%42;
        }
        Set<String> set = new HashSet<String>(Arrays.asList(N.toString()));
        List<String> newList = new ArrayList<String>(set);

        System.out.println(newList.toString());
//        Arrays.sort(n);
//        int j=1;
//        for(int i=0; i<9; i++){
//            if(n[i]!=n[i+1]) j++;
//        }
//        System.out.println(j);


    }
}
