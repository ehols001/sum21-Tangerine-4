package edu.odu.cs.cs350;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.io.File;
//import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class HTMLDocument {
	
	private String websiteRoot;
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
		websiteRoot = new String();
		setLocalPath("");
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
	 * @param root domain of the website
	 */
	public HTMLDocument(String url, String root, String parentPath)
	{
		websiteRoot = root;
		setLocalPath(url);
		generateHtml(url, parentPath);
	}
	
	/**
	 * Generate an HTMLDocument from the given url
	 * 
	 * @param url page to generate an HTMLDocument from
	 */
	public void generateHtml(String url, String parentPath)
	{
		try
		{
			
			File content = new File(url);
			System.out.println(content);
			Document doc = Jsoup.parse(content, "UTF-8");
			extractLinks(doc);
			extractMedia(doc);
			//extractScripts(doc);
			//extractStyleSheets(doc);
			//extractMisc(doc);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Retrieve the full file path
	 * @param url URL of file 
	 * @param parentPath the parent path of the file
	 * @return filePath the full local file path
	 */
	public String getFullPath(String url, String parentPath)
	{
		//String filePath = stripUrl(url);
		Path path = Paths.get(url);
		String fileName = path.getFileName().toString();
		String filePath = parentPath + fileName;
		return filePath;
	}
	
	/**
	 * Translates a URL to the local directory structure
	 * of a local copy of a site
	 * 
	 * @param url URL to be stripped of protocol
	 * @return filePath url translated to its local file path
	 */
	public String stripUrl(String url)
	{
		String fileName = new String();
		try
		{
			URL tempUrl = new URL(url);
			String protocol = tempUrl.getProtocol() + "://";
			fileName = url.replace(protocol, "");
		}
		catch (MalformedURLException mue)
		{
			System.err.println(mue);
		}
		return fileName;
	}
	
	/**
	 * Find and retrieve all links from a given HTMLDocument
	 * 
	 * @param doc to retrieve all links from
	 */
	public void extractLinks(Document doc)
	{
		String type = new String();
		Elements anchors = doc.select("a[href]"); //collect a list of all link tags on the page
		
		for(Element anchor : anchors) //for each link in the list
		{
			String url = stripUrl(anchor.attr("abs:href")); //get the full link path and strip the protocol from it (e.g. https://)
			if(url.contains(websiteRoot)) //if stripped url domain matches website domain, it's internal and added to links
			{
				type = "internal";
				Anchor link = new Anchor(url, type);
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
				String url = stripUrl(src.attr("abs:src")); //get the full path of the media src and strip the protocol from it
				if(url.contains(websiteRoot)) //if stripped url domain matches website domain, it's internal and added to media
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
			String url = stripUrl(script.attr("abs:src")); //get the full path of the script src and strip the protocol from it
			if(url.contains(websiteRoot)) //if stripped url domain matches website domain, it's internal and added to scripts
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
			String url = stripUrl(stylesheet.attr("abs:src")); //get the full path of the stylesheet src and strip the protocol from it
			if(url.contains(websiteRoot)) //if stripped url domain matches website domain, it's internal and added to stylesheets
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
     * @param localPath new local path where this document was found
     */	
	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	
	
}
