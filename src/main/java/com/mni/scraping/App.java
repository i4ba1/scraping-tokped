package com.mni.scraping;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scraping scraping = new ScrapingWithSelenium();
        scraping.doScraping();
        System.out.println( "Hello World!" );
    }
}
