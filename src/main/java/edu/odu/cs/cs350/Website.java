package edu.odu.cs.cs350;

public class Website {
	/*
	 * private DATASTRUCTURE<type> pageURLs;
	 * private DATASTRUCTURE<type> pages;
	 * (potentially combine the two, maybe using ?map?)
	 */

	//Default constructor for initializing a new Website
	public Website()
	{
		
	}
	
	/*
	 * Determine whether a page contains the type of 
	 * HTML content we are looking for
	 */
	static boolean containsHTMLContent(String page)
	{
		if(/*page contains HTML content*/)
			return true;
		else
			return false;
	}
	
	//Add a page URL to a Container of page URLs
	public void addPageURL(String pageURL)
	{
		
	}
	
	//Add a page to a Container of pages
	public void addPage(String page)
	{
		
	}
	
	/*
	 * Search for a page
	 * return true if that page exists
	 */
	public boolean contains(String page)
	{
		if(/*page exists*/)
			return true;
		else
			return false;
	}
	
	//Return the size of the Website Containers for Pages/PageURLs
	public int size()
	{
		return 0; //placeholder
	}
	
	//Main method for running the WebAnalysis tool
	public static void main(String[] args)
	{
		
	}
}
