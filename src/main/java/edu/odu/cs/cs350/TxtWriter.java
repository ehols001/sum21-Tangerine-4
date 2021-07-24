package edu.odu.cs.cs350;

import java.util.*;

public class TxtWriter {
	
	private Vector<String> sizes = new Vector<String>();
	private Vector<String> pages = new Vector<String>();
	
	/**
	 * Constructs a text writer object with empty containers
	 */
	public TxtWriter()
	{
	}
	
	/**
	 * Constructs a text writer object with containers filled by Website object
	 * 
	 * @param website website supplies website image size and path data
	 */
	public TxtWriter(Website website) 
	{	
		setSizes(website);
		setPages(website);
	}
	
	/**
	 * Returns Vector<String> of cumulative image sizes for each page
	 * 
	 */
	public Vector<String> getSizes()
	{
		return sizes;
	}
	
	/**
	 * Stores cumulative image sizes for each page supplied 
	 * from website
	 * 
	 * @param website website supplies website image size data for each page
	 */
	void setSizes(Website website)
	{
		/*
		for(int i = 0; i < website.Pages.get(i).size(); i++) 
		{
			sizes.add(website.Pages.get(i).size);
		}
		*/
	}
	
	/**
	 * Returns Vector<String> of path names for each page
	 * 
	 */
	public Vector<String> getPages()
	{
		return pages;
	}
	
	/**
	 * Stores path names for each page supplied 
	 * from website
	 * 
	 * @param website website supplies website path names for each page
	 */
	void setPages(Website website)
	{	
		/*
		for(int i = 0; i < website.Pages.get(i).size(); i++) 
		{
			pages.add(website.Pages.get(i).path);
		}
		*/
	}
	
	/**
	 * Writes formated Vector<String> sizes and Vector<String> pages to YYYYMMDD-hhmmss-summary.txt file
	 */
	void writeToFile()
	{
		//Write data in Vector<String> sizes and Vector<String> pages to YYYYMMDD-hhmmss-summary.txt file
		//according to conventions
	}
	
}
