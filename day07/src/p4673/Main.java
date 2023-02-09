package p4673;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] N = new int[10001];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.fill(N, 0);
        for(int i=1; i<=10000; i++){
            int k=i; boolean fc=true;
            while(k<=10000&&N[k]==0){
                N[k]++;
                if(fc) {N[k]=1; bw.write(k+"\n"); fc=false;}
                k=d(k);
            }
        }
        bw.flush();
        bw.close();



    }
    static int d(int a){
        int result = a;
        while (a!=0) {
            result = result + a % 10;
            a = a/10;
        }
        return result;
    }

}
