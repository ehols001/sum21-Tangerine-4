package edu.odu.cs.cs350;

import java.util.ArrayList;

//import org.jsoup.nodes;



public class HTMLDocument {
	private String localPath;
	private ArrayList<String> links;
	private ArrayList<String> media;
	private ArrayList<String> scripts;
	private ArrayList<String> styleSheets;
	private ArrayList<String> misc;
	
	
	
	//Default constructor for HTMLDocument
	public HTMLDocument() {
		setLocalPath("");
		links = new ArrayList<String>();
		media = new ArrayList<String>();
		scripts = new ArrayList<String>();
		misc = new ArrayList<String>();
		styleSheets = new ArrayList<String>();
	}
	
	public void setLinks(String linkURL) {
		this.links.add(linkURL);
	}
	
	public void setMedia(String media) {
		this.media.add(media);
	}
	
	public void setScripts(String scripts) {
		this.scripts.add(scripts);
	}
	
	public void setStyleSheets(String styleSheets) {
		this.styleSheets.add(styleSheets);
	}
	
	public void setMisc(String misc) {
		this.misc.add(misc);
	}
	
	public ArrayList<String> getLinks() {
				
		return this.links;
	}

	public ArrayList<String> getMedia() {
		
		return this.media;
	}
	
	public ArrayList<String> getScripts() {
		return this.scripts;
	}
	
	public ArrayList<String> getStyleSheets() {
		return this.styleSheets;
	}
	
	
	public ArrayList<String> getMisc() {
		return this.misc;
	}

	public String getLocalPath() {
		return this.localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	
}
