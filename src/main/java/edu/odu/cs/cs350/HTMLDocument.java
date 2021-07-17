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
	private Elements scripts;
	private Elements styleSheets;
	private Elements misc;
	
	
	
	//Default constructor for HTMLDocument
	public HTMLDocument() {
		webPage = Jsoup.parse("");
		setLocalPath("");
	}
	
	//Non-default constructor using parse class
	//Parser class passes constructed HTML as document object?
	public HTMLDocument(Document doc) {
		//webPage = Jsoup.parse(html);
		webPage = doc;
		
		links = webPage.select("a[href]");
	}
	
	//Accessor for links
	
	public Elements getLinks() {
				
		return this.links;
	}

	public Elements getMedia() {
		
		return this.media;
	}
	
	public Elements getScripts() {
		return this.scripts;
	}
	
	public Elements getStyleSheets() {
		return this.styleSheets;
	}
	
	
	public Elements getMisc() {
		return this.misc;
	}

	public String getLocalPath() {
		return this.localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	public void setwebPage(Document page){
		this.webPage = page;
	}
}
