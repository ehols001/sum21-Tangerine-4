package edu.odu.cs.cs350;

import java.util.Vector;

//import org.jsoup.nodes;



public class HTMLDocument {
	private String localPath;
	private Vector<String> links;
	private Vector<String> media;
	private Vector<String> scripts;
	private Vector<String> styleSheets;
	private Vector<String> misc;
	
	
	
	//Default constructor for HTMLDocument
	public HTMLDocument() {
		setLocalPath("");
	}
	
	
	//Accessor for links
	
	public Vector<String> getLinks() {
				
		return this.links;
	}

	public Vector<String> getMedia() {
		
		return this.media;
	}
	
	public Vector<String> getScripts() {
		return this.scripts;
	}
	
	public Vector<String> getStyleSheets() {
		return this.styleSheets;
	}
	
	
	public Vector<String> getMisc() {
		return this.misc;
	}

	public String getLocalPath() {
		return this.localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	
}
