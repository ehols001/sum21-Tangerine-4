package edu.odu.cs.cs350;

import java.util.*;

public class Website {

	private ArrayList<HTMLDocument> webpages;
	private static String localRoot;
	private static String rootUrl;

	/**
	 * Default constructor for initializing a new Website
	 */
	public Website()
	{
		webpages = new ArrayList<HTMLDocument>();
		localRoot = new String();
		rootUrl = new String();
	}
	
	/**
	 * Website constructor that takes in two parameters
	 * 
	 * @param path the local root directory of the website
	 * @param url the root url of the website
	 */
	public Website(String path, String url)
	{
		webpages = new ArrayList<HTMLDocument>();
		localRoot = path;
		rootUrl = url;
	}
	
	/**
	 * Add a webpage to a container of webpages
	 * 
	 * @param htmldoc HTMLDocument to add to the list of webpages
	 */
	public void addWebpage(HTMLDocument htmldoc)
	{
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
	 * Retrieves the root url of the website
	 * 
	 * @return rootUrl the root url of the website
	 */
	public static String getRootUrl()
	{
		return rootUrl;
	}
	
	/**
	 * Retrieves the local root directory of the website
	 * 
	 * @return localRoot the local root directory of the website
	 */
	public static String getLocalRoot()
	{
		return localRoot;
	}
	
}
