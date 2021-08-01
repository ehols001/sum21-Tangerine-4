package edu.odu.cs.cs350;

import java.util.*;

public class Website {

	private ArrayList<HTMLDocument> webpages;
	private String root;
	private String domain;

	/**
	 * Default constructor for initializing a new Website
	 */
	public Website()
	{
		webpages = new ArrayList<HTMLDocument>();
		root = new String();
		domain = new String();
	}
	
	/**
	 * Add a webpage to a container of webpages given a url
	 * 
	 * @param url local url
	 * @param parentPath parent path of HTMLDocument being created
	 */
	public void addWebpage(String url, String parentPath)
	{
		HTMLDocument htmldoc = new HTMLDocument(url, domain, parentPath);
		webpages.add(htmldoc);
	}
	
	/**
	 * Search for a webpage within the webpages container
	 * 
	 * @param hd URL of the webpage
	 * @return true if webpage exists
	 */
	public boolean contains(HTMLDocument hd)
	{
		if(webpages.contains(hd) == true)
			return true;
		else
			return false;
	}
	
	/**
	 * Retrieves the size of the Website container for webpages
	 * 
	 * @return integer size of webpages
	 */
	public int size()
	{
		return webpages.size();
	}
	
	/**
	 * Retrieves the HTMLDocument at the given index
	 * 
	 * @param index Index of the desired HTMLDocument
	 * @return HTMLDocument at the given index
	 */
	public HTMLDocument getWebpage(int index)
	{
		return webpages.get(index);
	}
	
	/**
	 * Retrieves the root path of the website
	 * 
	 * @return root the root path of the website
	 */
	public String getWebsiteRoot()
	{
		return root;
	}
	
	/**
	 * Sets the root path of the website
	 * 
	 * @param path the root path of the website
	 */
	public void setWebsiteRoot(String path)
	{
		root = path;
	}
	
	/**
	 * Retrieves the domain of the website
	 * 
	 * @return domain the domain of the website
	 */
	public String getWebsiteDomain()
	{
		return domain;
	}
	
	/**
	 * Sets the domain of the website
	 * 
	 * @param domain the domain of the website
	 */
	public void setWebsiteDomain(String url)
	{
		domain = url;
	}
}
