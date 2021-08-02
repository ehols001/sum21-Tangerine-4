package edu.odu.cs.cs350;

import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.io.File;

public class HTMLDocument {
	
	private String localPath;
    private ArrayList<Anchor> links;
    private ArrayList<Element> media;
    private ArrayList<Element> scripts;
    private ArrayList<Element> styleSheets;
    private ArrayList<Element> misc;
	
    /**
     * Construct an HTMLDocument with all
     * containers empty
     */
	public HTMLDocument() {
		setLocalPath("", "");
		links = new ArrayList<Anchor>();
		media = new ArrayList<Element>();
		scripts = new ArrayList<Element>();
		misc = new ArrayList<Element>();
		styleSheets = new ArrayList<Element>();
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
		media = new ArrayList<Element>();
		scripts = new ArrayList<Element>();
		misc = new ArrayList<Element>();
		styleSheets = new ArrayList<Element>();
		generateHtml(localPath);
	}
	
	/**
	 * Generate an HTMLDocument from the given url
	 * 
	 * @param localPath full local path of current HTMLDocument
	 */
	public void generateHtml(String localPath)
	{
		try
		{
			String fullPath = Website.getLocalRoot() + localPath;
			File content = new File(fullPath);
			Document doc = Jsoup.parse(content, "UTF-8");
			extractLinks(doc);
			//extractMedia(doc);
			//extractScripts(doc);
			//extractStyleSheets(doc);
			//extractMisc(doc);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//test output to make sure it's grabbing/converting links correctly
		for(int i = 0; i < links.size(); ++i)
		{
			System.out.println(links.get(i).getType() + ", " + links.get(i).getURL());
		}
	}
	
	/**
	 * Find and retrieve all links from a given HTMLDocument
	 * 
	 * @param doc to retrieve all links from
	 */
	public void extractLinks(Document doc)
	{
		String type = new String();
		Elements anchors = doc.select("a[href]");
		
		for(Element anchor : anchors)
		{
			String url = anchor.attr("abs:href");
			Anchor link = new Anchor(url, type);
			String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
			String strippedUrl = UrlHandler.stripProtocol(url);
			String convertedUrl = UrlHandler.urlToLocal(strippedUrl, strippedRoot);
			if(url.contains(strippedRoot))
			{
				if(convertedUrl == this.localPath)
				{
					link.setType("Intra-page");
					link.setURL(convertedUrl);
					setLink(link);
				}
				else
				{
					link.setType("Intra-site");
					link.setURL(convertedUrl);
					setLink(link);
				}
			}
			else
			{
				link.setType("External");
				setLink(link);
			}
		}
	}
	
	/**
	 * Find and retrieve all media from a given HTMLDocument
	 * 
	 * @param doc to retrieve all media from
	 */
	public void extractMedia(Document doc)
	{
		Elements media = doc.select("[src]"); //collect a list of all media-like tags containing src on the page
		
		for(Element src : media) //for each src in the media list
		{
			if(src.normalName().equals("img")) //check if that src is an img
			{
				String url = src.attr("abs:src"); //get the full path of the media src
				String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
				if(url.contains(strippedRoot))
				{
					setMedia(src);
				}
			}
		}
	}
	
	/**
	 * Find and retrieve all scripts from a given HTMLDocument
	 * 
	 * @param doc to retrieve all scripts from
	 */
	public void extractScripts(Document doc)
	{
		Elements scripts = doc.select("script[src]"); //collect a list of all script tags containing src on the page
		
		for(Element script : scripts) //for each script in the scripts list
		{
			String url = script.attr("abs:src"); //get the full path of the script
			String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
			if(url.contains(strippedRoot))
			{
				setScript(script);
			}
		}
	}
	
	/**
	 * Find and retrieve all sytlesheets from a given HTMLDocument
	 * 
	 * @param doc to retrieve all sytlesheets from
	 */
	public void extractStyleSheets(Document doc)
	{
		Elements stylesheets = doc.select("[style]"); //collect a list of all tags containing style on the page
		
		for(Element stylesheet : stylesheets) //for each stylesheet in the stylesheets list
		{
			String url = stylesheet.attr("abs:src"); //get the full path of the stylesheet src
			String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
			if(url.contains(strippedRoot))
			{
				setStyleSheet(stylesheet);
			}
		}
	}
	
    /**
     * Add a link URL
     *
     * @param link new url of a link
     */	
	public void setLink(Anchor link) {
		this.links.add(link);
	}
	
    /**
     * Add a media file URL
     *
     * @param media new url of a some media (IMG, MP4, etc)
     */	
	public void setMedia(Element media) {
		this.media.add(media);
	}
	
    /**
     * Add a JavaScript file URL
     *
     * @param script a new url of a JavaScript file
     */	
	public void setScript(Element script) {
		this.scripts.add(script);
	}
	
	
    /**
     * Add a CSS URL
     *
     * @param styleSheet new url of a CSS file
     */	
	public void setStyleSheet(Element styleSheet) {
		this.styleSheets.add(styleSheet);
	}
	
    /**
     * Add a misc URL
     *
     * @param misc new url of a misc file (zip, rar, etc)
     */	
	public void setMisc(Element misc) {
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
	public ArrayList<Element> getMedia() {
		
		return this.media;
	}
	
    /**
     * Retrieve the scripts container
     */
	public ArrayList<Element> getScripts() {
		return this.scripts;
	}
	
    /**
     * Retrieve the stylesheets container
     */
	public ArrayList<Element> getStyleSheets() {
		return this.styleSheets;
	}
	
    /**
     * Retrieve the misc container
     */
	public ArrayList<Element> getMisc() {
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
