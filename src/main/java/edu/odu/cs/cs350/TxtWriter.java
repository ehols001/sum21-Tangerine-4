package edu.odu.cs.cs350;

import Website.java;
import HTMLDocument.java;
import java.util.*;

public class TxtWriter {
	
	private Vector<String> sizes = new Vector<String>();
	private Vector<String> pages = new Vector<String>();
	
	public TxtWriter()
	{
	}
	
	public TxtWriter(Website website) 
	{	
		setSizes(website);
		setPages(website);
	}
	
	public Vector<String> getSizes()
	{
		return sizes;
	}
	
	void setSizes(Website website)
	{
		/*
		for(int i = 0; i < website.Pages.size; i++) 
		{
			sizes.add(website.Pages[i].size);
		}
		*/
	}
	
	public Vector<String> getPages()
	{
		return pages;
	}
	
	void setPages(Website website)
	{	
		/*
		for(int i = 0; i < website.Pages.size; i++) 
		{
			pages.add(website.Pages[i].path);
		}
		*/
	}
	
	void writeToFile()
	{
		//Write data in Vector<String> sizes and Vector<String> pages to YYYYMMDD-hhmmss-summary.txt file
		//according to conventions
	}
	
}
