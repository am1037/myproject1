package p4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str_temp = br.readLine();
            StringTokenizer st = new StringTokenizer(str_temp);
            int[] scoreArr = new int[1+Integer.parseInt(st.nextToken())];
            scoreArr[0] = scoreArr.length-1;
            double scoreAvg = 0;
                for(int j=1; j<scoreArr[0]+1; j++){
                    scoreArr[j] = Integer.parseInt(st.nextToken());
                    scoreAvg += scoreArr[j];
                }
                scoreAvg = scoreAvg / scoreArr[0];
                int k=0;
                for(int j=1; j<scoreArr[0]+1; j++){
                    if(scoreArr[j]>scoreAvg) {
                        k++;
                    }
                    //if(i==2)System.out.println(k+" "+scoreArr[j]+" "+scoreAvg);
                }
                System.out.println(String.format("%.3f", 100*(double)k/scoreArr[0])+"%");

        }
    }
}
