package ArrayReview;

import java.util.Arrays;

public class Main_2 {
    public static void main(String[] args) {
        String pn = "  011-245-1245  ";
        pn = pn.trim();
        String[] PN = pn.split("-");
        String com = "";
        String comcom = "";
        int COM = 0;
        String comcomcom = "";

        System.out.println(pn);
        if(pn.substring(0, 2).equals("011")) com.concat("SK");
        else if(pn.substring(0, 2).equals("019")) com.concat("LG");
        else com.concat("APPLE");
        System.out.println(Arrays.toString(PN));
        if(PN[1].length()>3) comcom.concat("최신폰");
        else comcom.concat("올드폰");
        System.out.println(PN[2].length());
        for(int i=0; i< PN.length;i++) {
            COM += PN[i].length();
        }
        System.out.println(COM>=10);
    }
}
