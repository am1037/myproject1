package CrawlingExample;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) throws Exception {
        String urur = "https://finance.naver.com/item/main.naver?code=";
        String num = "005930";
        Connection con = Jsoup.connect(urur+num);
        con.get();
        Document doc = null;
        try {
            doc = con.get();
            Elements codeList = doc.select(".code");
            System.out.println(codeList.size());
            Element tag = codeList.get(0);
            String code = tag.text();
            System.out.println("코드는 " + code);

            //sptxt sp_txt9
            Elements textList = doc.select(".sptxt.sp_txt9");
            System.out.println("sptxt9");

            Element tag2 = textList.get(0);
            String text1 = tag2.text();
            System.out.println("text1 " + text1);

            Elements textList2 = doc.select(".sptxt.sp_txt10");
            System.out.println(textList2.size());

            Element tag3 = textList2.get(0);
            String text2 = tag3.text();
            System.out.println("text2 " + text2);
//        try {
//            doc = con.get();
//            //Elements codeList = doc.select(".new_totalinfo");
//            Elements codeList = doc.select(".sptxt.sp_txt9");
//            ArrayList<String> list = new ArrayList<>();
//            System.out.println(codeList);
////            for(Element e:tag){
////                list.add(e.text());
////                System.out.println(list.get(list.size()-1));
////            }
        }catch (Exception e){

        }
    }
}
