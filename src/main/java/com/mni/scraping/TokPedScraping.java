package com.mni.scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TokPedScraping extends Scraping {
    private static final int MAX_PAGE = 2;

    @Override
    void doScraping() {
        try {
            Document doc = Jsoup.connect("https://www.tokopedia.com/p/handphone-tablet/handphone/android-os").timeout(7000).get();
            //Document doc = Jsoup.parse("https://www.tokopedia.com/p/handphone-tablet/handphone/android-os");
            Elements elementsByClass = doc.getElementsByClass("css-bk6tzz e1nlzfl3");
            int page = 2;

            while (page <= MAX_PAGE){
                for (Element e:elementsByClass) {
                    System.out.println(e.toString());
                    Element div16vw0vn = e.getElementsByClass("css-16vw0vn").first();
                    assert div16vw0vn != null;
                    Element div79elbk = div16vw0vn.getElementsByClass("css-79elbk").first();
                    assert div79elbk != null;
                    Element div1c0vu8l = div79elbk.getElementsByClass("css-1c0vu8l").first();
                    assert div1c0vu8l != null;
                    Element div1d28ct9 = div1c0vu8l.getElementsByClass("css-1d28ct9").first();
                    assert div1d28ct9 != null;
                    Element img = div1d28ct9.getElementsByTag("img").first();
                    String imageSource = img.attr("src");


                }
                page++;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
