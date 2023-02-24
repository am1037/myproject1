package CrawlingExample;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Connection con = Jsoup.connect("https://gall.dcinside.com/board/lists?id=comic_new3&exception_mode=recommend");
        con.get();
        Document doc = null;
        try {
            doc = con.get();
        }catch (Exception e){
        }
        Elements list = doc.select("td.gall_tit a");
        ArrayList<String> listStr = new ArrayList<>();
        for(Element e:list){
        //    listStr.add(e.text());
            listStr.add(e.attr("href"));
        }
        System.out.println(listStr);
    }
}
