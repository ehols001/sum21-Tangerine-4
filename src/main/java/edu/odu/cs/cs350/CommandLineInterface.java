package edu.odu.cs.cs350;

import java.io.*;

public class CommandLineInterface {
	
	/**
	 * Prints any relevant error messages for 
	 * malformed URLs or non-existent and unreadable
	 * directory paths
	 * 
	 * @param url URL to be examined
	 * @param path local path to be examined
	 * 
	 */
	public static void printArgumentErrors(String url, String path)
	{
		if(!UrlHandler.isURLValid(url) && !UrlHandler.isLocalPathValid(path))
		{
			System.err.println("The URL provided is malformed.");
			System.err.println("The path provided is either non-existent or "
					+ "an unreadable directory.");
		}
		else if(!UrlHandler.isLocalPathValid(path))
		{
			System.err.println("The path provided is either non-existent or "
					+ "an unreadable directory.");
		}
		else
		{
			System.err.println("The URL provided is malformed.");
		}
	}

	/**
	 * Main method for the WebAnalysis Tool
	 */
	public static void main(String[] args) throws IOException
	{
		if(args.length < 1)
		{
			System.err.println("usage: localPath url\n"
					+ "   localPath: the path to a local copy of the site\n"
					+ "   url: one or more URLs separated by spaces");
			System.exit(0);
		}

		String path = args[0];
		String url = args[1];
		
		if(UrlHandler.isURLValid(url) && UrlHandler.isLocalPathValid(path))
		{
			Website website = new Website(path, url);
			String strippedUrl = UrlHandler.stripProtocol(url);
			String newUrl = strippedUrl + "/index.html";
			HTMLDocument htmldoc = new HTMLDocument(newUrl);
			WebsiteParser parser = new WebsiteParser();
			parser.generateHtml(htmldoc.getLocalPath(), htmldoc);
			
			/*
			//test output to make sure it's grabbing/converting links correctly
			for(int i = 0; i < htmldoc.getLinks().size(); ++i)
			{
				System.out.println(htmldoc.getLinks().get(i).getType() + ", " + htmldoc.getLinks().get(i).getURL());
			}
			*/
			
			website.addWebpage(htmldoc);
			
			for(int i = 0; i < htmldoc.getLinks().size(); ++i)
			{
				String nextUrl = Website.getRootUrl() + "/" + htmldoc.getLinks().get(i).getURL();
				String nextStrippedUrl = UrlHandler.stripProtocol(nextUrl);
				HTMLDocument nextHtmldoc = new HTMLDocument(nextStrippedUrl);
				parser.generateHtml(nextHtmldoc.getLocalPath(), nextHtmldoc);
				
				/*
				//test output to make sure it's grabbing/converting links correctly
				for(int j = 0; j < nextHtmldoc.getLinks().size(); ++j)
				{
					System.out.println(nextHtmldoc.getLinks().get(j).getType() + ", " + nextHtmldoc.getLinks().get(j).getURL());
				}
				*/
				
				website.addWebpage(nextHtmldoc);
			}
			TxtWriter textWriter = new TxtWriter(website);
			textWriter.writeToFile();
			//Call to Json writer
			//Call to Excel writer
		}
		else
		{
			printArgumentErrors(url, path);
		}
	}
}
