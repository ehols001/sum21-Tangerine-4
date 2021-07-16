package edu.odu.cs.cs350;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import org.jsoup.nodes;



public class HTMLDocument {
	private org.jsoup.nodes.Document webPage;
	private String localPath;
	private Elements links;
	private Elements media;
	
	
	
	//Default constructor for HTMLDocument
	public HTMLDocument() {
		webPage = Jsoup.parse("");
		setLocalPath("");
	}
	
	//Non-default constructor using Parse class
	public HTMLDocument(String html) {
		webPage = Jsoup.parse(html);
		links = webPage.select("a[href]");
	}
	
	//Accessor for links
	
	public Elements getLinks(String ID, String tag) {
				
		return links;
	}

	public Elements getMedia() {
		
		return media;
	}
	
	public Elements getScripts() {
		
	}
	
	public Elements getStyleSheets() {
		
	}
	
	
	public Elements getMisc() {
		
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	public void setwebPage(Document page){
		this.webPage = page;
	}
}
