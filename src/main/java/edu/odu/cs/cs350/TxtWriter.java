package edu.odu.cs.cs350;

import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

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
		sizes.clear();
		
		double cumulativeSize;
		
		for(int i = 0; i < website.size(); i++) 
		{
			cumulativeSize = 0;
			
			for(int j = 0; j < website.getWebpage(i).getMedia().size(); j++)
			{
				if (website.getWebpage(i).getMedia().get(j).getType() == "image")
				{
					cumulativeSize = cumulativeSize + website.getWebpage(i).getMedia().get(j).getSize();
				}
				sizes.add(cumulativeSize);
			}
		}
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
		pages.clear();
		
		//String temp = "";
		
		for(int i = 0; i < website.size(); i++) 
		{
			pages.add(website.getWebpage(i).getLocalPath());
			/*
			if(temp == "" || temp != website.getWebpage(i).getLocalPath())
			{
				pages.add(website.getWebpage(i).getLocalPath());
				temp = website.getWebpage(i).getLocalPath();
			}*/
		}
	}
	
	/**
	 * Writes formated Vector<Double> sizes and Vector<String> pages to YYYYMMDD-hhmmss-summary.txt file
	 * 
	 * @param website Website to retrieve pages from
	 */
	void writeToFile(Website website)
	{
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
		LocalDateTime fileCreationDateTime = LocalDateTime.now();
		String dateTime = fileCreationDateTime.format(dateTimeFormat);
		
		try
		{
			FileWriter txtWriter = new FileWriter(dateTime + "-summary.txt");
			
			DecimalFormat twoDP = new DecimalFormat("#.00");
			
			for (int i = 0; i < website.size(); i++)
			{
				txtWriter.write(twoDP.format(sizes.get(i)) + "M   " + pages.get(i));
				txtWriter.write(System.getProperty("line.separator"));
			}
			
			txtWriter.close();
			
		} catch (IOException e) 
		{
			System.out.println("Error writing to file.");
			e.printStackTrace();
		}
	}
	
}
