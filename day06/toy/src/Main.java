import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer tokens;

    public static void main(String[] args) throws IOException {
        String[] numList = {};
        for(int i=0; i<10; i++) {
            String num = br.readLine();
            int left = Integer.parseInt(num) % 42;

            numList = Add(numList, Integer.toString(left));
        }
        List<String> list = Arrays.asList(numList);
        Set<String> set = new HashSet<String>(list);
        List<String> newList = new ArrayList<String>(set);
        String[] resultArr = newList.toArray(new String[0]);

        System.out.println(resultArr.length);
    }

    private static String[] Add(String[] numList, String num) {
        // TODO Auto-generated method stub
        String[] newArray = new String[numList.length + 1];
        for(int index=0; index<numList.length; index++) {
            newArray[index] = numList[index];
        }
        newArray[numList.length] = num;
        return newArray;
    }
}