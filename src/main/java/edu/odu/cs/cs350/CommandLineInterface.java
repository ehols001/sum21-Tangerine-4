package edu.odu.cs.cs350;

import java.io.*;
import java.nio.file.*;
import java.net.*;

public class CommandLineInterface {
	
	/**
	 * Determines whether a URL is valid or not
	 * 
	 * @param url URL to be examined
	 * @return true if url is a valid url
	 */
	public static boolean isURLValid(String url)
	{
		try
		{
			new URL(url).toURI();
			return true;
		}
		catch (Exception exc)
		{
			return false;
		}
	}
	
	/**
	 * Determines whether a readable local path exists
	 * 
	 * @param path local path to be examined
	 * @return true if path is readable and exists
	 */
	public static boolean isLocalPathValid(String path)
	{
		Path localPath = Paths.get(path);
		if(Files.isReadable(localPath) && Files.isDirectory(localPath))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Translates a URL to the local directory structure
	 * of a local copy of a site
	 * 
	 * @param url URL to be translated
	 * @return translatedURL url translated to its local path
	 */
	public static String urlToLocalPath(String url)
	{
		String translatedURL = new String();
		//Translate URL to reflect the local copy site's directory structure
		return translatedURL;
	}
	
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
		if(!isURLValid(url) && !isLocalPathValid(path))
		{
			System.err.println("The URL provided is malformed.");
			System.err.println("The path provided is either non-existent or "
					+ "is an unreadable directory.");
		}
		else if(!isLocalPathValid(path))
		{
			System.err.println("The path provided is either non-existent or "
					+ "is an unreadable directory.");
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
		if(args.length == 0)
		{
			System.err.println("\nNo command line arugments provided.\n");
			System.exit(0);
		}
		String path = args[0];
		String url = args[1];
		
		Website ws = new Website();
		HTMLDocument hd = new HTMLDocument();
		
		if(isURLValid(url) && isLocalPathValid(path))
		{
			String translatedUrl = urlToLocalPath(url);
			//hd = parse(translatedUrl);
			ws.addWebpage(hd);	
		}
		else
		{
			printArgumentErrors(url, path);
		}
	}
}
