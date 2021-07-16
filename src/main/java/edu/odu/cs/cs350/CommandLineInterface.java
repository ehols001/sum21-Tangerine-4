package edu.odu.cs.cs350;

import java.io.*;
import java.net.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CommandLineInterface {
	
	/*
	 * Determines whether a URL is valid or not
	 */
	static boolean isURLValid(String url)
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
	
	/*
	 * Translates a URL to the local directory structure
	 * of a local copy of a site
	 */
	static String urlToLocalPath(String url)
	{
		String translatedURL = new String();
		//Translate URL to reflect the local copy site's directory structure
		return translatedURL;
	}

	//Main method for the WebAnalysis Tool
	public static void main(String[] args) throws IOException
	{
		String path = args[0];
		String url = args[1];
		
		if(isURLValid(url))
		{
			String translatedUrl = urlToLocalPath(url);
			//Add translatedUrl to Website list of paths
		}
		else
		{
			//Print corresponding error message if URL is not valid
		}
	}
}
