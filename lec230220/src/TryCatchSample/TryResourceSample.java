package TryCatchSample;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class TryResourceSample {
    public static void main(String[] args) {
        String str = "h,w!";
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write(str);
            bw.newLine();
        } catch (Exception e){

        }
    }
}
