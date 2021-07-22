package edu.odu.cs.cs350;

import java.util.ArrayList;


public class HTMLDocument {
	private String localPath;
	private ArrayList<String> links;
	private ArrayList<String> media;
	private ArrayList<String> scripts;
	private ArrayList<String> styleSheets;
	private ArrayList<String> misc;
	
	
	
    /**
     * Construct an HTML Document with all
     * containers empty
     */
	public HTMLDocument() {
		setLocalPath("");
		links = new ArrayList<String>();
		media = new ArrayList<String>();
		scripts = new ArrayList<String>();
		misc = new ArrayList<String>();
		styleSheets = new ArrayList<String>();
	}
	
    /**
     * Add a link URL
     *
     * @param linkURL new url of a link
     */	
	public void setLinks(String linkURL) {
		this.links.add(linkURL);
	}
	
    /**
     * Add a media file URL
     *
     * @param media new url of a some media (IMG, MP4, etc)
     */	
	public void setMedia(String media) {
		this.media.add(media);
	}
	
    /**
     * Add a JavaScript file URL
     *
     * @param scripts  a new url of a JavaScript file
     */	
	public void setScripts(String scripts) {
		this.scripts.add(scripts);
	}
	
	
    /**
     * Add a CSS URL
     *
     * @param styleSheets new url of a CSS file
     */	
	public void setStyleSheets(String styleSheets) {
		this.styleSheets.add(styleSheets);
	}
	
    /**
     * Add a misc URL
     *
     * @param misc new url of a misc file (zip, rar, etc)
     */	
	public void setMisc(String misc) {
		this.misc.add(misc);
	}
	
    /**
     * Retrieve the links container
     */
	public ArrayList<String> getLinks() {
				
		return this.links;
	}

    /**
     * Retrieve the media container
     */
	public ArrayList<String> getMedia() {
		
		return this.media;
	}
	
    /**
     * Retrieve the scripts container
     */
	public ArrayList<String> getScripts() {
		return this.scripts;
	}
	
    /**
     * Retrieve the stylesheets container
     */
	public ArrayList<String> getStyleSheets() {
		return this.styleSheets;
	}
	
    /**
     * Retrieve the misc container
     */
	public ArrayList<String> getMisc() {
		return this.misc;
	}

    /**
     * Retrieve the local path of this HTMLDoc
     */
	public String getLocalPath() {
		return this.localPath;
	}

    /**
     * Set the HTMLDoc localpath
     *
     * @param localPath new local path where this document was found
     */	
	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	
}
