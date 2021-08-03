package edu.odu.cs.cs350;

import java.util.ArrayList;

public class HTMLDocument {
	
	private String localPath;
    private ArrayList<Anchor> links;
    private ArrayList<FileResource> media;
    private ArrayList<FileResource> scripts;
    private ArrayList<FileResource> styleSheets;
    private ArrayList<FileResource> misc;
	
    /**
     * Construct an HTMLDocument with all
     * containers empty
     */
	public HTMLDocument() {
		setLocalPath("", "");
		links = new ArrayList<Anchor>();
		media = new ArrayList<FileResource>();
		scripts = new ArrayList<FileResource>();
		misc = new ArrayList<FileResource>();
		styleSheets = new ArrayList<FileResource>();
	}
	
	/**
	 * Construct an new HTMLDocument from the given url
	 * 
	 * @param url page to generate an HTMLDocument from
	 */
	public HTMLDocument(String url)
	{
		setLocalPath(url, Website.getRootUrl());
		links = new ArrayList<Anchor>();
		media = new ArrayList<FileResource>();
		scripts = new ArrayList<FileResource>();
		misc = new ArrayList<FileResource>();
		styleSheets = new ArrayList<FileResource>();
	}
		
    /**
     * Add a link URL
     *
     * @param link new url of a link
     */	
	public void setLinks(Anchor link) {
		this.links.add(link);
	}
	
    /**
     * Add a media file URL
     *
     * @param media new url of a some media (IMG, MP4, etc)
     */	
	public void setMedia(FileResource media) {
		this.media.add(media);
	}
	
    /**
     * Add a JavaScript file URL
     *
     * @param script a new url of a JavaScript file
     */	
	public void setScripts(FileResource script) {
		this.scripts.add(script);
	}
	
	
    /**
     * Add a CSS URL
     *
     * @param styleSheet new url of a CSS file
     */	
	public void setStyleSheets(FileResource styleSheet) {
		this.styleSheets.add(styleSheet);
	}
	
    /**
     * Add a misc URL
     *
     * @param misc new url of a misc file (zip, rar, etc)
     */	
	public void setMisc(FileResource misc) {
		this.misc.add(misc);
	}
	
    /**
     * Retrieve the links container
     */
	public ArrayList<Anchor> getLinks() {
				
		return this.links;
	}

    /**
     * Retrieve the media container
     */
	public ArrayList<FileResource> getMedia() {
		
		return this.media;
	}
	
    /**
     * Retrieve the scripts container
     */
	public ArrayList<FileResource> getScripts() {
		return this.scripts;
	}
	
    /**
     * Retrieve the stylesheets container
     */
	public ArrayList<FileResource> getStyleSheets() {
		return this.styleSheets;
	}
	
    /**
     * Retrieve the misc container
     */
	public ArrayList<FileResource> getMisc() {
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
     * @param url Url of the current page
     * @param rootUrl the root url of the website
     */	
	public void setLocalPath(String url, String rootUrl) {
		String strippedRoot = UrlHandler.stripProtocol(rootUrl);
		String filePath = UrlHandler.urlToLocal(url, strippedRoot);
		this.localPath = filePath;
	}
	
}
