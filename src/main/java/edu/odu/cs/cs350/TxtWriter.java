package edu.odu.cs.cs350;

import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;

public class TxtWriter {
	
	private Vector<Double> sizes = new Vector<Double>();
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
	 * Returns Vector<Double> of cumulative image sizes for each page
	 * 
	 * @return vector of each page's cumulative image size
	 */
	public Vector<Double> getSizes()
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
	 * @return vector of each page's path name
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
	 * Writes formated Vector<Double> sizes and Vector<String> pages to YYYYMMDD-hhmmss-summary.txt file
	 */
	void writeToFile()
	{
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
		LocalDateTime fileCreationDateTime = LocalDateTime.now();
		String dateTime = fileCreationDateTime.format(dateTimeFormat);
		
		try
		{
			FileWriter txtWriter = new FileWriter(dateTime + "-summary.txt");
			
			
		} catch (IOException e) 
		{
			System.out.println("Error writing to file.");
			e.printStackTrace();
		}
		
		//Write data in Vector<Double> sizes and Vector<String> pages to YYYYMMDD-hhmmss-summary.txt file
		//according to conventions
	}
	
}
