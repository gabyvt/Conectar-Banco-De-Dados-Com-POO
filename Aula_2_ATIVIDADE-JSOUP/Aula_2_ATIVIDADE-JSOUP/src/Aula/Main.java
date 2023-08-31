package Aula;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Descoberta_do_Brasil").get();
		
		System.out.println(doc.getElementsByTag("p"));
		
		
	}
}



	

