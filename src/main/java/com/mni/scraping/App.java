package com.mni.scraping;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scraping tokpedScrapped = new TokPedScraping();
        tokpedScrapped.doScraping();
        System.out.println( "Hello World!" );
    }
}
