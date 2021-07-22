package edu.odu.cs.cs350;

import java.util.*;

public class Website {

	private Vector<HTMLDocument> webpages;

	//Default constructor for initializing a new Website
	public Website()
	{
		webpages = new Vector<HTMLDocument>();
	}
	
	//Add a webpage to a Container of webpages
	public void addWebpage(HTMLDocument hd)
	{
		webpages.add(hd);
	}
	
	/*
	 * Search for a webpage
	 * return true if that webpage exists
	 * @param URL of the webpage
	 */
	public boolean contains(HTMLDocument hd)
	{
		if(webpages.contains(hd) == true)
			return true;
		else
			return false;
	}
	
	//Return the size of the Website Container for webpages
	public int size()
	{
		return webpages.size();
	}
	
}
