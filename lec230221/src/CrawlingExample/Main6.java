package CrawlingExample;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Main6 {

    public static void main(String[] args) throws Exception {

        String urur = "https://store.nintendo.co.kr/games/sale";
        Connection con = Jsoup.connect(urur);
        Document doc = null;
        ArrayList<String> linkList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> priceSpecialList = new ArrayList<>();
        ArrayList<Integer> priceOriginalList = new ArrayList<>();
        ArrayList<Double> discountList = new ArrayList<>();

        ArrayList[] totalList = new ArrayList[5];
        totalList[0] = nameList;
        totalList[1] = priceSpecialList;
        totalList[2] = priceOriginalList;
        totalList[3] = discountList;
        totalList[4] = linkList;

        try {
            doc = con.get();
            Elements codeList = doc.select("a.category-product-item-title-link");
            Elements pricesSpecial = doc.select(".special-price");
            Elements pricesOriginal = doc.select(".old-price");

            for(Element e:codeList) {
                linkList.add(e.attr("href"));
                nameList.add(e.text());
            }
            for (Element price : pricesSpecial) {
                String priceAmount = price.select("span.price-wrapper").attr("data-price-amount");
                priceSpecialList.add(Integer.parseInt(priceAmount));
            }
            for (Element price : pricesOriginal) {
                String priceAmount = price.select("span.price-wrapper").attr("data-price-amount");
                priceOriginalList.add(Integer.parseInt(priceAmount));
            }
            for (int i=0; i<priceSpecialList.size(); i++){
                discountList.add(0.1*Math.round(1000*(1-(double)priceSpecialList.get(i)/(double)priceOriginalList.get(i))));
            }

            //Collections.sort(totalList[0]);
            //System.out.println(totalList[0]);
            //System.out.println(totalList[1]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
