package edu.odu.cs.cs350;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UrlHandler {
	
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
	 * Strips the URL of its protocol
	 * 
	 * @param url URL to be stripped of protocol
	 * @return strippedUrl url without its protocol
	 */
	public static String stripProtocol(String url)
	{
		String strippedUrl = new String();
		try
		{
			if(!url.isEmpty())
			{
				URL tempUrl = new URL(url);
				String protocol = tempUrl.getProtocol() + "://";
				strippedUrl = url.replace(protocol, "");
			}
		}
		catch (MalformedURLException mue)
		{
			System.err.println(mue);
		}
		return strippedUrl;
	}
	
	/**
	 * Converts the URL to the local file system structure
	 * 
	 * @param url URL stripped of protocol to be converted
	 * @param localUrl the local root url stripped of protocol of the website
	 * @return localPath the local file path of the converted url
	 */
	public static String urlToLocal(String url, String localUrl)
	{
		String localPath = url.replace(localUrl, "");
		return localPath;
	}
	
}