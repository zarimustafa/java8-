package com.jsoup.tutorials;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
//    	 System.setProperty("http.proxyHost", "127.0.0.1");
//         System.setProperty("http.proxyPort", "80");

         
    	
    	Document doc = Jsoup.parse(new File("D:\\tmp\\raw\\Mkyong.com.html"),"utf-8");
    	String title = doc.title();
    	System.out.println("Title - " + title);
    	
    	Elements elements = doc.select("a[href]");
    	
    	for (Element element : elements) {
			System.out.println(/*"Link - " +*/ element.attr("href"));
//			System.out.println("Text - " + element.text());
		}
    }
}
