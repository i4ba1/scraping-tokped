package com.mni.scraping;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ScrapingWithHtmlUnit extends Scraping {
    @Override
    void doScraping() {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        //webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);

        try {
            //fetching the web page
            HtmlPage page = webClient.getPage(TOKPED_SMARTPHONE_ANDROID);
            List<HtmlDivision> dive1nlzfl3 = page.getByXPath("//div");
            HtmlDivision divImageLink = dive1nlzfl3.stream().filter(o ->
                     o.getByXPath("//div[@class='css-1d28ct9'") != null).findFirst().orElse(null);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
