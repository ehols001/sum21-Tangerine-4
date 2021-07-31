package edu.odu.cs.cs350;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.*;
import java.util.*;

public class JsonWriter {
	
	private JSONObject output= new JSONObject(); //JSON object to be written to
	/**
	 * JsonWriter constructor
	 */
	public JsonWriter() { 
		
	}
	
	//Variables holding the count of each type of file
	private int localImageCount;
	private int externalImageCount;
	private int scriptCount;
	private int stylesheetCount;
	private int intraPageLinkCount;
	private int interSiteLinkCount;
	private int externalLinkCount;
	
	//JSONArrays to hold resource info to be output to JSON file
	
	private JSONArray pages= new JSONArray();
	private JSONArray imageFiles= new JSONArray();
	private JSONArray scriptFiles= new JSONArray();
	private JSONArray stylesheetFiles= new JSONArray();
	private JSONArray archiveFiles= new JSONArray();
	private JSONArray videoFiles= new JSONArray();
	private JSONArray audioFiles= new JSONArray();
	private JSONArray miscFiles= new JSONArray();
	
		
	/**
	 * @return the JSONObject created in this class
	 */
	public JSONObject getJSONObject() { //Accessor for the JSON object created in this class
		return output;
	}
	
	/**
	 * Sets the count of the number of local images by iterating through the list of all media and counting the local images
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setLocalImageCount(HTMLDocument page) {
		
		//
		localImageCount=0;
		
		for(int i=0; i<page.getMedia().size(); i++){
			if(page.getMedia().get(i).getType().equals("Local Image")){
				localImageCount++;
			}
		}
	}
	
	/**
	 * @return the number of local images on the current page
	 */
	public int getLocalImageCount() {

		return localImageCount;
	}
	
	/**
	 * Sets the count of the number of external images by iterating through the list of all media and counting the external images
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setExternalImageCount(HTMLDocument page) {
		
		externalImageCount=0;
		
		for(int i=0; i<page.getMedia().size(); i++){
			if(page.getMedia().get(i).getType().equals("External Image")){
				externalImageCount++;
			}
		}
	}
	
	/**
	 * @return the number of external images on the current page
	 */
	public int getExternalImageCount() {
		
		return externalImageCount;
	}
	
	/**
	 * Retrieves the arraylist of scripts for the current page from the HTMLDocument
	 * Counts the number of scripts by determining the size of the arraylist
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setScriptCount(HTMLDocument page) {
		
		scriptCount=page.getScripts().size();
	}
	
	/**
	 * @return the number of scripts on the current page
	 */
	public int getScriptCount() {
		
		return scriptCount;
	}
	
	/**
	 * Retrieves the arraylist of stylesheets for the current page from the HTMLDocument
	 * Counts the number of stylesheets by determining the size of the arraylist
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setStylesheetCount(HTMLDocument page) {
		
		stylesheetCount=page.getStyleSheets().size();
		
	}
	
	/**
	 * @return the number of stylesheets on the current page
	 */
	public int getStylesheetCount() {
		
		return stylesheetCount;
	}
	
	/**
	 * Sets the count of the number of intra-page links by iterating through the list of all links and counting the intra-page links
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setIntraPageLinkCount(HTMLDocument page) {
		
		intraPageLinkCount=0;
		
		for(int i=0; i<page.getLinks().size(); i++){
			if(page.getLinks().get(i).getType().equals("Intra-Page")){
				intraPageLinkCount++;
			}
		}
	}
	
	/**
	 * @return the number of intra-page links on the current page
	 */
	public int getIntraPageLinkCount() {
		
		return intraPageLinkCount;
	}
	
	/**
	 * Sets the count of the number of inter-site links by iterating through the list of all links and counting the inter-site links
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setInterSiteLinkCount(HTMLDocument page) {
		
		interSiteLinkCount=0;
		
		for(int i=0; i<page.getLinks().size(); i++){
			if(page.getLinks().get(i).getType().equals("Inter-Site")){
				interSiteLinkCount++;
			}
		}
	}

	/**
	 * @return the number of inter-site links on the current page
	 */
	public int getInterSiteLinkCount() {
		
		return interSiteLinkCount;
	}
	
	/**
	 * Sets the count of the number of external links by iterating through the list of all links and counting the external links
	 * 
	 * @param page- page being analyzed
	 * 
	 */
	public void setExternalLinkCount(HTMLDocument page) {
		//Sets the count of the number of external links by iterating through the list of links and counting
		
		externalLinkCount=0;
		
		for(int i=0; i<page.getLinks().size(); i++){
			if(page.getLinks().get(i).getType().equals("External")){
				
				externalLinkCount++;
			}
		}
	}

	/**
	 * @return the number of external links on the current page
	 */
	public int getExternalLinkCount() {
		return externalLinkCount;
	}
	
	/**
	 * Formats the website's files and corresponding information into a JSON object and outputs a JSON file
	 * 
	 * @param website- the website that is being analuzed
	 * 
	 */
	public void JSONFormatter(Website website) {
		
		//Loops through each page in the website
		for(int i=0; i<website.size(); i++) {
			
			JSONObject singlePage= new JSONObject();
			
			JSONArray imageList = new JSONArray();
			JSONArray scriptList = new JSONArray();
			JSONArray stylesheetList = new JSONArray();
			
			
			//Outputs the counts of various files in each webpage
			singlePage.put("Path", website.getWebpage(i).getLocalPath());
			
			this.setLocalImageCount(website.getWebpage(i));
			singlePage.put("Local Image Count", this.localImageCount);
			
			this.setExternalImageCount(website.getWebpage(i));
			singlePage.put("External Image Count", this.externalImageCount);
			
			this.setScriptCount(website.getWebpage(i));
			singlePage.put("Script Count", this.scriptCount);
			
			this.setStylesheetCount(website.getWebpage(i));
			singlePage.put("Stylesheet Count", this.stylesheetCount);
			
			this.setIntraPageLinkCount(website.getWebpage(i));
			singlePage.put("Intra-Page Link Count", this.intraPageLinkCount);
			
			this.setInterSiteLinkCount(website.getWebpage(i));
			singlePage.put("Inter-Site Link Count", this.interSiteLinkCount);
			
			this.setExternalLinkCount(website.getWebpage(i));
			singlePage.put("External Link Count", this.externalLinkCount);
			
			
			//Outputs the list of images on the current page
			/*for(int j=0; j<website.getWebpage(i).getMedia().size(); j++) {
				if(website.getWebpage(i).getMedia().get(j).getType().equals("External Image") || website.getWebpage(i).getMedia().get(j).getType().equals("Local Image"))
				{
					imageList.put(website.getWebpage(i).getMedia().get(j).getName());
				}
			}
				
			singlePage.put("Image List", imageList);
			*/
			
			//Outputs the list of scripts on the current page
			/*for(int j=0; j<website.getWebpage(i).getScripts().size(); j++) {
				scriptList.put(website.getWebpage(i).getScripts().get(j).getName());
			}
			
			singlePage.put("Script List", scriptList);
			*/
			
			//Outputs the list of stylesheets on the current page
			/*for(int j=0; j<website.getWebpage(i).getStyleSheets().size(); j++) {
				stylesheetList.put(website.getWebpage(i).getStyleSheets().get(j).getName());
			}
			
			
			singlePage.put("Stylesheet List", stylesheetList);
			*/
			
			pages.put(singlePage);
			
			/*for(int j=0; j<website.getWebpage(i).getMedia().size(); j++) {
				
				JSONObject singleImage = new JSONObject();
				
				if(website.getWebpage(i).getMedia().get(j).getType().equals("External Image") || website.getWebpage(i).getMedia().get(j).getType().equals("Local Image"))
				{
					JSONArray pageList= new JSONArray();
					
					singleImage.put("Number of Pages", website.getWebpage(i).getMedia().get(j).getPages());
					singleImage.put("Page List", pageList);
					
					imageFiles.add(singleImage);
				}
			}
			*/
			
			
			//Outputs the file size and path of each archive file in the website into the json object
			for(int j=0; j<website.getWebpage(i).getMedia().size(); j++) { 
				
				JSONObject singleFile= new JSONObject();
				
				if(website.getWebpage(i).getMedia().get(j).getType().equals("Archive"))
				{
					singleFile.put("File Size", website.getWebpage(i).getMedia().get(j).getSize());
					singleFile.put("Path", website.getWebpage(i).getLocalPath());
					
					archiveFiles.put(singleFile);
				}
			}
			
			
			//Outputs the file size and path of each video file in the website into the json object
			for(int j=0; j<website.getWebpage(i).getMedia().size(); j++) { 
				
				JSONObject singleFile= new JSONObject();
				
				if(website.getWebpage(i).getMedia().get(j).getType().equals("Video"))
				{
					singleFile.put("File Size", website.getWebpage(i).getMedia().get(j).getSize());
					singleFile.put("Path", website.getWebpage(i).getLocalPath());
					
					videoFiles.put(singleFile);
				}
			}
			
			
			//Outputs the file size and path of each audio file in the website into the json object
			for(int j=0; j<website.getWebpage(i).getMedia().size(); j++) { 
				
				JSONObject singleFile= new JSONObject();
				
				if(website.getWebpage(i).getMedia().get(j).getType().equals("Audio"))
				{
					singleFile.put("File Size", website.getWebpage(i).getMedia().get(j).getSize());
					singleFile.put("Path", website.getWebpage(i).getLocalPath());
					
					audioFiles.put(singleFile);
				}
				
			}
			
			
			//Outputs the file size and path of each miscellaneous file in the website into the json object
			for(int j=0; j<website.getWebpage(i).getMisc().size(); j++) {
				JSONObject singleFile= new JSONObject();
				
				singleFile.put("File Size", website.getWebpage(i).getMisc().get(j).getSize());
				singleFile.put("Path", website.getWebpage(i).getLocalPath());
				
				miscFiles.put(singleFile);
			}
			
		}
		
		//output.put("Images", imageFiles)
		output.put("Pages", pages);
		output.put("Archives", archiveFiles);
		output.put("Videos", videoFiles);
		output.put("Audio", audioFiles);
		output.put("Miscellaneous", miscFiles);
		
		try
		{
			FileWriter file = new FileWriter("analysis.json");
			file.write(this.output.toString(1));
			
			file.close();
		} 	
		
		catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	
}
