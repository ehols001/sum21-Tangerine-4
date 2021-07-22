package edu.odu.cs.cs350;

import java.io.*;
import java.util.*;

public class Website {

	 private Vector<String> localPaths;
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
//		if(/*webpage contains HTML content*/)
//			return true;
//		else
//			return false;
		return false;
	}
	
	//Add a local path to a Container of localPaths
	public void addLocalPath(String lp)
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
//		if(/*webpage exists*/)
//			return true;
//		else
//			return false;
		return false;
	}
	
	//Return the size of the Website Containers for webpages/localPaths
	public int size()
	{
		return 0; //placeholder
	}
	
}
