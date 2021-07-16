package edu.odu.cs.cs350;

import org.w3c.dom.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import org.jsoup.nodes;



public class HTMLDocument {
	private org.jsoup.nodes.Document webPage;
	private String localPath;
	
	
	//Default constructor for HTMLDocument
	public HTMLDocument() {
		webPage = Jsoup.parse("");
		setLocalPath("");
	}
	
	//Non-default constructor using Parse class
	public HTMLDocument(String html) {
		webPage = Jsoup.parse(html);
	}
	
	//Accessor for links
	
	public Elements getLinks(String ID, String tag) {
		Element content = (Element) webPage.getElementById(ID);
		Elements links = content.getElementsByTag(tag);
		
		return links;
	}

	public Elements getImages() {
		
	}
	
	public Elements getScripts() {
		
	}
	
	public Elements getStyleSheets() {
		
	}
	
	public Elements getAudio() {
		
	}
	
	public Elements getMisc() {
		
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
}
