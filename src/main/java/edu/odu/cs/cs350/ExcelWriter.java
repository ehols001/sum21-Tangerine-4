package edu.odu.cs.cs350;

import Website.java;
import HTMLDocument.java;
import java.util.*;

public class ExcelWriter {
  
  private Vector<String> pages = new Vector<String>(); 
  private Vector<Integer> images = new Vector<Integer>();
  private Vector<Integer> css = new Vector<Integer>();
  private Vector<Integer> scripts = new Vector<Integer>();
  private Vector<Integer> intraLinks = new Vector<Integer>();
  private Vector<Integer> internalLinks = new Vector<Integer();
  private Vector<Integer> externalLinks = new Vector<Integer>();
  
  public class ExcelWriter(){
	  
  }
  
  public ExcelWriter(Website website) 
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
	
	public Vector<Integer> getImages()
	{
		return images;
	}
	
	void setImages(Website website)
	{	
		
	}
	
	public Vector<Integer> getCSS()
	{
		return css;
	}
	
	void setCSS (Website website)
	{
		
	}
	
	public Vector<Integer> getScripts()
	{
		return scripts;
	}
	
	void setScripts (Website website)
	{
		
	}
	
	public Vector<Integer> getIntraLinks()
	{
		return intraLinks;
	}
	
	void setIntraLinks (Website website)
	{
		
	}
	
	public Vector<Integer> getInternalLinks()
	{
		return internalLinks;
	}
	
	void setInternalLinks (Website website)
	{
		
	}
	
	public Vector<Integer> getExternalLinks()
	}
		return externalLinks;
	}

	void setExternalLinks (Website website)
	}
		
	{
	
	void writeToFile()
	{
		Workbook wb = new XSSFWorkbook();
                Sheet sheet1 = wb.createSheet("summary");
	}

}
