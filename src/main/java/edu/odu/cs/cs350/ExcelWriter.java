package edu.odu.cs.cs350;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Vector;


public class ExcelWriter {

  private Vector<String> pages = new Vector<String>();
  private Vector<Integer> images = new Vector<Integer>();
  private Vector<Integer> css = new Vector<Integer>();
  private Vector<Integer> scripts = new Vector<Integer>();
  private Vector<String> intraPage = new Vector<String>();
  private Vector<String> internalLinks = new Vector<String>();
  private Vector<String> externalLinks = new Vector<String>();

  
  	public ExcelWriter(){
	  
  	}

  	public ExcelWriter(Website website)
	{
		setPages(website);
		setImages(website);
		setCSS(website);
		setScripts(website);
		setIntraPage(website);
		setInternalLinks(website);
		setExternalLinks(website);
	};

	public Vector<String> getPages()
	{
		return pages;
	}
	
	public void setPages(Website website)
	{
		pages.clear();

		String temp = "";

        for(int i = 0; i < website.size(); i++)
        {
            if(temp == "" || temp != website.getWebpage(i).getLocalPath())
            {
                pages.add(website.getWebpage(i).getLocalPath());
                temp = website.getWebpage(i).getLocalPath();
            }
        }
	}
	
	public Vector<Integer> getImages()
	{
		return images;
	}
	
	public void setImages(Website website)
	{
		images.clear();

		for(int i = 0; i < website.size(); i++)
		{
			for(int x = 0; x < website.getWebpage(i).getMedia().size(); x++)
			{
				images.add(website.getWebpage(i).getMedia().get(x).getPages());
			}
		}
	}
	
	public Vector<Integer> getCSS()
	{
		return css;
	}
	
	public void setCSS (Website website)
	{
		css.clear();
		for(int i = 0; i < website.size(); i++)
		{
			for(int x = 0; x < website.getWebpage(i).getStyleSheets().size(); x++)
			{
				if(website.getWebpage(i).getStyleSheets().get(x).getType() == "stylesheet")
				{
					css.add(website.getWebpage(i).getStyleSheets().get(x).getPages());
				}
			}
		}
	}
	
	public Vector<Integer> getScripts()
	{
		return scripts;
	}
	
	public void setScripts (Website website)
	{
		scripts.clear();
		for(int i = 0; i < website.size(); i++)
		{
			for(int x = 0; x < website.getWebpage(i).getScripts().size(); x++)
			{
				if(website.getWebpage(i).getScripts().get(x).getType() == "script")
				{
					scripts.add(website.getWebpage(i).getScripts().get(x).getPages());
				}
			}
		}

	}
	
	public Vector<String> getIntraPage()
	{
		return intraPage;
	}
	
	public void setIntraPage (Website website)
	{
		intraPage.clear();
		for(int i = 0; i < website.size(); i++)
		{
			for(int x = 0; x < website.getWebpage(i).getLinks().size(); x++){
				if(website.getWebpage(i).getLinks().get(0).getType() == "intraPage")
				{
					intraPage.add(website.getWebpage(i).getLinks().get(x).getURL());
				}
			}
		}
	}
	
	public Vector<String> getInternalLinks()
	{
		return internalLinks;
	}
	
	void setInternalLinks (Website website)
	{
		// internalLinks.clear();

		for(int i = 0; i < website.size(); i++)
		{
			for(int x = 0; x < website.getWebpage(i).getLinks().size(); x++){
				if(website.getWebpage(i).getLinks().get(x).getType() == "internalLink")
				{
					internalLinks.add(website.getWebpage(i).getLinks().get(x).getURL());
				}
			}
		}
	}
	
	public Vector<String> getExternalLinks()
	{
		return externalLinks;
	}

	public void setExternalLinks (Website website)
	{
		// externalLinks.clear();
		for(int i = 0; i < website.size(); i++)
		{
			for(int x = 0; x < website.getWebpage(i).getLinks().size(); x++){
				if(website.getWebpage(i).getLinks().get(x).getType() == "externalLink")
				{
					externalLinks.add(website.getWebpage(i).getLinks().get(x).getURL());
				}
			}
		}
	}
	
	void writeToFile()
	{
		XSSFWorkbook worksheet = new XSSFWorkbook();
		XSSFSheet spreadsheet = worksheet.createSheet("summary");

		XSSFRow row;

	}

}
