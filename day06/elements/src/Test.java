import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] N = new int[10];
        int[] n = new int[10];
        for(int i=0; i<10; i++){
            N[i] = Integer.parseInt(br.readLine());
            n[i] = N[i]%42;
        }
        Arrays.sort(n);
        int j=1;
        for(int i=0; i<9; i++){
            if(n[i]!=n[i+1]) j++;
        }
        System.out.println(j);
    }
}
