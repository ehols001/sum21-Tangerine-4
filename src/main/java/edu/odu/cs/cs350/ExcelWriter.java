package edu.odu.cs.cs350;

import Website.java;
import HTMLDocument.java;
import java.util.*;

public class ExcelWriter {
  
  private Vector<String> pages = new Vector<String>(); 
  private Vector<String> images = new Vector<String>();
  private Vector<String> css = new Vector<String>();
  private Vector<String> scripts = new Vector<String>();
  private Vector<String> intraLinks = new Vector<String>();
  private Vector<String> internalLinks = new Vector<String>();
  private Vector<String> externalLinks = new Vector<String>();
  
  public class ExcelWriter(){
	  
  }
  
  public TxtWriter(Website website) 
	{	
		setPages(website);
		setImages(website);
	  	setCSS(website);
	  	setScripts(website);
	  	setIntraLinks(website);
	  	setInternalLinks(website);
	  	setExternalLinks(website);
	}
	
	public Vector<String> getPages()
	{
		return pages;
	}
	
	void setPages(Website website)
	{
		
	}
	
	public Vector<String> getImages()
	{
		return images;
	}
	
	void setImages(Website website)
	{	
		
	}
	
	public Vector<String> getCSS()
	{
		return css;
	}
	
	void setCSS (Website website)
	{
		
	}
	
	public Vector<String> getScripts()
	{
		return scripts;
	}
	
	void setScripts (Website website)
	{
		
	}
	
	public Vector<String> getIntraLinks()
	{
		return intraLinks;
	}
	
	void setIntraLinks (Website website)
	{
		return intraLinks;
	}
	
	public Vector<String> getInternalLinks()
	{
		
	}
	
	void setInternalLinks (Website website)
	{
		return internalLinks
	}
	
	public Vector<String> getExternalLinks()
	}

	}

	void setExternalLinks (Website website)
	}
		return externalLinks
	{
	
	void writeToFile()
	{
		
	}

}
