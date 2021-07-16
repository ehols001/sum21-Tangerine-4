package edu.odu.cs.cs350;

import java.io.*;
import java.util.*;

public class Website {

	 private Vector<String> localFilePaths;
	 private Vector<HTMLDocument> webpages;

	//Default constructor for initializing a new Website
	public Website()
	{
		
	}
	
	/*
	 * Determine whether a webpage contains the type of 
	 * HTML content we are looking for
	 * @param URL of the current webpage
	 */
	static boolean containsHTMLContent(String wp)
	{
		if(/*webpage contains HTML content*/)
			return true;
		else
			return false;
	}
	
	//Add a local file path to a Container of localFilePaths
	public void addLocalFilePath(String lfp)
	{
		
	}
	
	//Add a webpage to a Container of webpages
	public void addWebpage(HTMLDocument hd)
	{
		
	}
	
	/*
	 * Search for a webpage
	 * return true if that webpage exists
	 * @param URL of the webpage
	 */
	public boolean contains(String wp)
	{
		if(/*webpage exists*/)
			return true;
		else
			return false;
	}
	
	//Return the size of the Website Containers for webpages/localFilePaths
	public int size()
	{
		return 0; //placeholder
	}
	
	//Main method for running the WebAnalysis tool
	public static void main(String[] args)
	{
		
	}
}
