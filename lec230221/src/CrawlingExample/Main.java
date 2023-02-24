package CrawlingExample;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection con = Jsoup.connect("http://www.naver.com/");
        con.get();
        Document doc = null;
        try {
            doc = con.get();
        }catch (Exception e){

        }
        Elements list = doc.select(".nav");
        ArrayList<String> listStr = new ArrayList<>();
        ArrayList<String> listName = new ArrayList<>();
        for(Element e:list){
        //    listStr.add(e.text());
            listStr.add(e.attr("href"));
            listName.add(e.text());
        }
        System.out.println(listStr);
        System.out.println(listName);
    }
}
