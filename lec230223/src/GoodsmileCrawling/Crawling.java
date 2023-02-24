package GoodsmileCrawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;

public class Crawling {
    String url;
    String contents;
    Connection con;
    Document doc;
    Elements elements;
    ArrayList<String> itemNames;

    public Crawling(String str){
        url = str;
        con = Jsoup.connect(url);
        itemNames = new ArrayList<>();
        try {
            doc = con.get();
            elements = doc.select("span.itemname");
            for(Element e:elements){
                itemNames.add(e.text());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Crawling cr = new Crawling("https://www.goodsmile.info/");
        System.out.println(cr.itemNames);
    }
}
