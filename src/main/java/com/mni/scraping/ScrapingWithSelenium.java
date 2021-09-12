package com.mni.scraping;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ScrapingWithSelenium extends Scraping {
    @Override
    void doScraping() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        WebDriver firefoxDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(firefoxDriver, Duration.ofSeconds(10).toMillis());
        try {
            firefoxDriver.get(TOKPED_SMARTPHONE_ANDROID);
            List<WebElement> dive1nlzfl3;
            // Javascript executor
            ((JavascriptExecutor) firefoxDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            dive1nlzfl3 = firefoxDriver.findElements(By.cssSelector("div[class='css-bk6tzz e1nlzfl3']"));
            int lengthDive1nlzfl3 = dive1nlzfl3.size();

            IntStream.range(0, lengthDive1nlzfl3).forEach(idx -> {
                WebElement webElement = dive1nlzfl3.get(idx);
                WebElement element16vw0vn = webElement.findElement(By.cssSelector("div[class='css-16vw0vn']"));
                WebElement element79elbk = null;
                WebElement element1c0vu8l = null;
                WebElement element1d28ct9 = null;

                if (element16vw0vn != null) {
                    element79elbk = element16vw0vn.findElement(By.cssSelector("div[class='css-79elbk']"));
                }

                if (element79elbk != null) {
                    element1c0vu8l = element79elbk.findElement(By.cssSelector("div[class='css-1c0vu8l']"));
                }

                System.out.println(element1c0vu8l);
                if (element1c0vu8l != null) {
                    element1d28ct9 = element1c0vu8l.findElement(By.cssSelector("div[class='css-1d28ct9']"));
                }

                if (element1d28ct9 != null) {
                    String imageSource = element1d28ct9.findElement(By.tagName("img")).getAttribute("src");
                    System.out.println("ImageLink#"+idx+ " => "+imageSource);
                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
