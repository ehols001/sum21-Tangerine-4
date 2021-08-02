package edu.odu.cs.cs350;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;


public class WebsiteParser {
	
	private String websiteDomain;
	private Document webPage;
	private String localPath;
	private String rootPath;
	private HTMLDocument htmlDoc;
	
	public WebsiteParser() {
		this.websiteDomain = new String("");
		this.rootPath = new String("");
		this.localPath = new String("");
		htmlDoc = new HTMLDocument();
	}
	
	public void generateHtml(String localPath)
	{
		try
		{
			File content = new File(localPath);
			Document doc = Jsoup.parse(content, "UTF-8");
			extractLinks(doc);
			mediaExtract(doc);
			//extractScripts(doc);
			//extractStyleSheets(doc);
			//extractMisc(doc);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//test output to make sure it's grabbing/converting links correctly
//		for(int i = 0; i < htmlDoc.getLinks().size(); ++i)
//		{
//			System.out.print(htmlDoc.getLinks().get(i).getType());
//			System.out.print(", ");
//			System.out.println(htmlDoc.getLinks().get(i).getURL());
//		}
	}
	
	public void extractLinks(Document doc) {
		String type = new String();
		Elements anchors = doc.select("a[href]"); //collect a list of all link tags on the page
		
		for(Element anchor : anchors) //for each link in the list
		{
			String url = anchor.attr("abs:href"); //get the full link path
			Anchor link = new Anchor(url, type);
			if(url.contains(websiteDomain)) //if url domain matches website domain, it's internal and added to links
			{
				link.setType("internal");
				htmlDoc.setLinks(link);
			}
			else
			{
				link.setType("external");
				htmlDoc.setLinks(link);
			}
		}
	}
	
	/**
	 * Translates a URL to the local directory structure
	 * of a local copy of a site
	 * 
	 * @param url URL to be stripped of protocol
	 * @return filePath url translated to its local file path
	 */
	public String stripUrl(String url)
	{
		String fileName = new String();
		try
		{
			URL tempUrl = new URL(url);
			String protocol = tempUrl.getProtocol() + "://";
			fileName = url.replace(protocol, "");
		}
		catch (MalformedURLException mue)
		{
			System.err.println(mue);
			System.out.println(url);
		}
		return fileName;
	}
	
	public void mediaExtract(Document webPage) {
		Elements media = webPage.select("[src]"); //collect a list of all media-like tags containing src on the page
		
		for(Element src : media) //for each src in the media list
		{
			if (src.normalName().equals("img")) {
				
			
			//String url = src.attr("abs:src"); //get the full path of the media src
//			String url = src.absUrl("src");
			String url = src.baseUri();
			String imageType = new String(src.normalName());
			File file = new File(src.attr("src"));
			try {
				imageType = Files.probeContentType(file.toPath());
			} catch (IOException e) {
				System.out.print("File type not detected");
				e.printStackTrace();
			}
			
//			if(imageType == "img") //check if that src is an img
//			{
				
//				if(url.contains(websiteDomain)) //if url domain matches website domain, it's internal and added to media
//				{
					//String convertedURL = stripUrl(url);
					File mediaFile = new File(url);
					long fileSize = file.length();
					String lfp = src.attr("src");
					String name = src.normalName();
					//numPages??
					FileResource newMedia = new FileResource(fileSize, 0, imageType, lfp, name);
					htmlDoc.setMedia(newMedia);
//				}
//			}
			}
		}
	}
	
	public void scriptExtract() {
		
	}
	
	public void styleExtract() {
		
	}
	
	public void miscExtract() {
		
	}
	
	public void pathExtract() {
		
	}
	
	public void setHTML(HTMLDocument html) {
		this.htmlDoc = html;
	}
	
	public HTMLDocument getHTML() {
		return this.htmlDoc;
	}
	
	
	
}
