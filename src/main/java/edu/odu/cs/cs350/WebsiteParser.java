package edu.odu.cs.cs350;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebsiteParser {
	
	/**
	 * Generate an HTMLDocument from the given url
	 * 
	 * @param localPath the local path of the current HTMLDocument
	 * @param htmldoc the HTMLDocument to be parsed
	 */
	public void generateHtml(String localPath, HTMLDocument htmldoc)
	{
		try
		{
			String fullPath = Website.getLocalRoot() + localPath;
			File content = new File(fullPath);
			Document doc = Jsoup.parse(content, "UTF-8");
			extractLinks(doc, htmldoc);
			//extractMedia(doc, htmldoc);
			//extractScripts(doc, htmldoc);
			//extractStyleSheets(doc, htmldoc);
			//extractMisc(doc, htmldoc);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Find and retrieve all links from a given HTMLDocument
	 * 
	 * @param doc to retrieve all links from
	 * @param htmldoc the HTMLDocument object being stored to
	 */
	public void extractLinks(Document doc, HTMLDocument htmldoc)
	{
		String type = new String();
		Elements anchors = doc.select("a[href]");
		
		for(Element anchor : anchors)
		{
			String url = anchor.attr("abs:href");
			Anchor link = new Anchor(url, type);
			String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
			String strippedUrl = UrlHandler.stripProtocol(url);
			String convertedUrl = UrlHandler.urlToLocal(strippedUrl, strippedRoot);
			if(url.contains(strippedRoot))
			{
				if(convertedUrl == htmldoc.getLocalPath())
				{
					link.setType("Intra-page");
					link.setURL(convertedUrl);
					htmldoc.setLinks(link);
				}
				else
				{
					link.setType("Intra-site");
					link.setURL(convertedUrl);
					htmldoc.setLinks(link);
				}
			}
			else
			{
				link.setType("External");
				htmldoc.setLinks(link);
			}
		}
	}
	
	/**
	 * Find and retrieve all media from a given HTMLDocument
	 * 
	 * @param doc to retrieve all media from
	 * @param htmldoc the HTMLDocument object being stored to
	 */
	public void extractMedia(Document doc, HTMLDocument htmldoc)
	{
		Elements media = doc.select("[src]"); //collect a list of all media-like tags containing src on the page
		
		for(Element src : media) //for each src in the media list
		{
			if (src.normalName().equals("img")) {
				
			/**
			 * This should return the abs path of the media file but it returns ""
			 */
			//String url = src.attr("abs:src"); //get the full path of the media src
			
			String url = src.baseUri(); //this is not ideal either
			
			//Add URL handling class stuff here
			
			String imageType = new String(src.normalName());
			File file = new File(src.attr("src"));
			try {
				imageType = Files.probeContentType(file.toPath());
			} catch (IOException e) {
				System.out.print("File type not detected");
				e.printStackTrace();
			}
			
			
//			if(url.contains(websiteDomain)) //if url domain matches website domain, it's internal and added to media
//			{
					//String convertedURL = stripUrl(url);
					long size = (file.length() / 1048576); //convert Byte to MiB
					double fileSize = (double) size;
					String lfp = src.attr("src");
					String name = file.getName();
					//numPages??
					FileResource newMedia = new FileResource(fileSize, 0, imageType, lfp, name);
					htmldoc.setMedia(newMedia);
//			}
			}
		}
	}
	
	/**
	 * Find and retrieve all scripts from a given HTMLDocument
	 * 
	 * @param doc to retrieve all scripts from
	 * @param htmldoc the HTMLDocument object being stored to
	 */
	public void extractScripts(Document doc, HTMLDocument htmldoc)
	{
		/*
		Elements scripts = doc.select("script[src]");
		
		for(Element script : scripts)
		{
			String url = script.attr("abs:src");
			String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
			if(url.contains(strippedRoot))
			{
				htmldoc.setScripts(script);
			}
		}
		*/
	}
	
	/**
	 * Find and retrieve all sytlesheets from a given HTMLDocument
	 * 
	 * @param doc to retrieve all sytlesheets from
	 * @param htmldoc the HTMLDocument object being stored to
	 */
	public void extractStyleSheets(Document doc, HTMLDocument htmldoc)
	{
		/*
		Elements stylesheets = doc.select("[style]");
		
		for(Element stylesheet : stylesheets)
		{
			String url = stylesheet.attr("abs:src");
			String strippedRoot = UrlHandler.stripProtocol(Website.getRootUrl());
			if(url.contains(strippedRoot))
			{
				htmldoc.setStyleSheets(stylesheet);
			}
		}
		*/
	}
	
}
