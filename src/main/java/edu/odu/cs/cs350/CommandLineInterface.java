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
		catch (MalformedURLException mue)
		{
			return false;
		}
		catch (URISyntaxException use)
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
	 * @param path Local path to be reflected
	 * @return translatedURL url translated to its local path
	 */
	public static String urlToLocalPath(String url, String path)
	{
		String translatedURL = new String();
		try
		{
			URL tempUrl = new URL(url);
			String protocol = tempUrl.getProtocol() + ":/";
			String temp = url.replace(protocol, "");
			//URI URLtoURI = new URI(tempString);
			//String temp = URLtoURI.toString();
			Path tempPath = Paths.get(temp);
			Path tempPath2 = tempPath.getFileName();
			translatedURL = tempPath2.toString();
		}
		catch (MalformedURLException mue)
		{
			System.err.println(mue);
		}/*
		catch (URISyntaxException use)
		{
			System.err.println(use);
		}*/
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
					+ "an unreadable directory.");
		}
		else if(!isLocalPathValid(path))
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

		Website ws = new Website();
		HTMLDocument htmldoc = new HTMLDocument();
		
		if(isURLValid(url) && isLocalPathValid(path))
		{
			String newPath = urlToLocalPath(url, path);
			System.out.println(newPath);
			//htmldoc = parse(newPath);
			ws.addWebpage(htmldoc);	
		}
		else
		{
			printArgumentErrors(url, path);
		}
		
		/*
		 * calls to the three writer functions
		 */
	}
}
