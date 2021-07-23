package edu.odu.cs.cs350;

import java.util.*;

public class Website {

	private Vector<HTMLDocument> webpages;

	/**
	 * Default constructor for initializing a new Website
	 */
	public Website()
	{
		webpages = new Vector<HTMLDocument>();
	}
	
	/**
	 * Add a webpage to a container of webpages
	 */
	public void addWebpage(HTMLDocument hd)
	{
		webpages.add(hd);
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
	
}
