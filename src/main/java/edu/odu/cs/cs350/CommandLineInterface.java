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

		Website website = new Website(path, url);
		
		if(UrlHandler.isURLValid(url) && UrlHandler.isLocalPathValid(path))
		{
			String strippedUrl = UrlHandler.stripProtocol(url);
			String newUrl = strippedUrl + "index.html";
			website.addWebpage(newUrl);	
		}
		else
		{
			printArgumentErrors(url, path);
		}

		TxtWriter textWriter = new TxtWriter(website);
		textWriter.writeToFile();
		//Call to Json writer
		//Call to Excel writer
	}
}
