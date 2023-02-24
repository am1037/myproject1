package CrawlingExample;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Main5 {

    static ArrayList<String> valueList = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        int N=50000;
        System.out.println(N);
        do{

        String urur = "https://finance.naver.com/item/main.naver?code=";
        String num = String.valueOf(N);
        while(num.length() != 6) {
            num = "0" + num;
        }
        System.out.println(num);
        Connection con = Jsoup.connect(urur+num);
        Document doc = null;
        try {
            doc = con.get();
            Elements codeList = doc.select("span.blind");
            for(int i = 12; i<codeList.size(); i++) {
                valueList.add(codeList.get(i).text());
            }
        }catch (Exception e){
        }
        N--;
        }while (valueList.size()<6);
        System.out.println("현재가, 전일대비, 전일대비2, 전일, 고가, 거래량, 시가, 저가, 거래대금(백만)");
        System.out.println(valueList);
    }
}
