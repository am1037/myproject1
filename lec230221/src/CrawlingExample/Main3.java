package CrawlingExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main3 {
    public static void main(String[] args) {
        String html = "<html><body><a href='https://www.google.com'>Google</a><a href='https://www.yahoo.com'>Yahoo</a></body></html>";
        Document doc = Jsoup.parse(html);

        String searchText = "Google";
        String href = null;
        Elements anchors = doc.select("a");
        for (Element anchor : anchors) {
            if (anchor.text().equals(searchText)) {
                href = anchor.attr("href");
                break;
            }
        }

        System.out.println("Href for '" + searchText + "': " + href);
    }
}