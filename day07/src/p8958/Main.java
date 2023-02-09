package p8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        for(int i=0; i<N; i++){
            str = br.readLine();
            String[] strArr = str.split("");
            int j = 0, result = 0;
            for(String c : strArr){
                switch (c){
                    case "O":
                        j++;
                        result += j;
                        break;
                    case "X":
                        j = 0;
                        break;
                }
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();

    }
}
