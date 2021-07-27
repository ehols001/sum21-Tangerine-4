package edu.odu.cs.cs350;

import org.json.JSONObject;
import java.io.*;
import java.util.*;

//import javax.swing.text.html.HTMLDocument;


public class JsonWriter {
	
	private JSONObject json;
	
	public JsonWriter() { 
		
	 json=new JSONObject(); //JSON file to be written to
		
	}
	
	//Variables holding the count of each type of file
	private int localImageCount;
	private int externalImageCount;
	private int scriptCount;
	private int stylesheetCount;
	private int intraPageLinkCount;
	private int interSiteLinkCount;
	private int externalLinkCount;
	
	//Lists of the names of each type of file and the corresponding information for each file
	//Number of pages it's on, names of pages it is on, etc. 
	
	private ArrayList<HTMLDocument> pages = new ArrayList<HTMLDocument>();
	
	public JSONObject getJSONObject() { //Accessor for the JSON object created in this class
		return json;
	}
	
	public void setLocalImageCount(HTMLDocument page) {
		
		//Sets the count of the number of local images by iterating through the list of all media and counting local images
		localImageCount=0;
		
		for(int i=0; i<=page.getMedia().size(); i++){
			if(page.getMedia().get(i).getType().equals("Local Image")){
				localImageCount++;
			}
		}
	}
	
	public int getLocalImageCount() {
		
		//returns localImageCount;
		return localImageCount;
	}
	
	public void setExternalImageCount(HTMLDocument page) {
		
		//Sets the count of the number of external images by iterating through the list and counting external images
		
		externalImageCount=0;
		
		for(int i=0; i<=page.getMedia().size(); i++){
			if(page.getMedia().get(i).getType().equals("External Image")){
				externalImageCount++;
			}
		}
	}
	
	public int getExternalImageCount() {
		
		//returns externalImageCount;
		return externalImageCount;
	}
	
	public void setScriptCount(HTMLDocument page) {
		
		//Sets the count of the number of scripts by iterating through the list and counting
		scriptCount=page.getScripts().size();
	}
	
	public int getScriptCount() {
		
		//returns scriptCount;
		return scriptCount;
	}
	
	public void setStylesheetCount(HTMLDocument page) {
		
		//Sets the count of the number of stylesheets
		
		stylesheetCount=page.getStyleSheets().size();
		
	}
	
	
	public int getStylesheetCount() {
		
		//returns stylesheetCount;
		return stylesheetCount;
	}
	
	public void setIntraPageLinkCount(HTMLDocument page) {
		//Sets the count of the number of intra-page links by iterating through the list of links and counting
		
		intraPageLinkCount=0;
		
		for(int i=0; i<=page.getLinks().size(); i++){
			if(page.getLinks().get(i).getType().equals("Intra-Page")){
				intraPageLinkCount++;
			}
		}
	}
	
	public int getIntraPageLinkCount() {
		//returns intraPageLinkCount;
		return intraPageLinkCount;
	}
	
	public void setInterSiteLinkCount(HTMLDocument page) {
		//Sets the count of the number of inter-site links by iterating through the list of links and counting
		
		interSiteLinkCount=0;
		
		for(int i=0; i<=page.getLinks().size(); i++){
			if(page.getLinks().get(i).getType().equals("Inter-Site")){
				interSiteLinkCount++;
			}
		}
		
	}

	public int getInterSiteLinkCount() {
		//returns interSiteLinkCount;
		return interSiteLinkCount;
	}
	
	public void setExternalLinkCount(HTMLDocument page) {
		//Sets the count of the number of external links by iterating through the list of links and counting
		
		externalLinkCount=0;
		
		for(int i=0; i<=page.getLinks().size(); i++){
			if(page.getLinks().get(i).getType().equals("External")){
				
			}
				externalLinkCount++;
		}
	}

	public int getExternalLinkCount() {
		//returns externalLinkCount;
		return externalLinkCount;
	}
	
	
	public void JSONFormatter(Website pages) {
		
		//Loops through each page in the website
		for(int i=0; i<pages.size(); i++) {
			
			//Outputs the counts of various files in each webpage
			json.put("Page", pages.getWebpage(i).getLocalPath());
			
			this.setLocalImageCount(pages.getWebpage(i));
			json.put("Local Image Count", this.getLocalImageCount());
			
			this.setExternalImageCount(pages.getWebpage(i));
			json.put("External Image Count", this.getExternalImageCount());
			
			this.setScriptCount(pages.getWebpage(i));
			json.put("Script Count", this.getScriptCount());
			
			this.setStylesheetCount(pages.getWebpage(i));
			json.put("Stylesheet Count", this.getStylesheetCount());
			
			this.setIntraPageLinkCount(pages.getWebpage(i));
			json.put("Intra-Page Link Count", this.getIntraPageLinkCount());
			
			this.setInterSiteLinkCount(pages.getWebpage(i));
			json.put("Inter-Site Link Count", this.getInterSiteLinkCount());
			
			this.setExternalLinkCount(pages.getWebpage(i));
			json.put("External Link Count", this.getExternalLinkCount());
			
			//Outputs the list of images throughout the website and the number of pages that it appears on
			for(int j=0; j<pages.getWebpage(i).getMedia().size(); j++) {
				if(pages.getWebpage(i).getMedia().get(j).getType().equals("External Image") || pages.getWebpage(i).getMedia().get(j).getType().equals("Local Image"))
				{
					json.put("Image", pages.getWebpage(i).getMedia().get(j));
					json.put("Number of Pages", pages.getWebpage(i).getMedia().get(j).getPages());
				}
			}
			
			//Outputs the list of scripts throughout the website
			for(int j=0; j<pages.getWebpage(i).getScripts().size(); j++) {
				json.put("Script", pages.getWebpage(i).getScripts().get(j));
			}
			
			//Outputs the list of stylesheets throughout the website
			for(int j=0; j<pages.getWebpage(i).getStyleSheets().size(); j++) {
				json.put("Stylesheets", pages.getWebpage(i).getStyleSheets().get(j));
			}
			
			//Outputs the file size and path of each archive file in the website
			for(int j=0; j<pages.getWebpage(i).getMedia().size(); j++) { 
				if(pages.getWebpage(i).getMedia().get(j).getType().equals("Archive"))
				{
					json.put("File Size", pages.getWebpage(i).getMedia().get(j).getSize());
					json.put("Path", pages.getWebpage(i).getLocalPath());
				}
			}
			
			//Outputs the file size and path of each video file in the website
			for(int j=0; j<pages.getWebpage(i).getMedia().size(); j++) { 
				if(pages.getWebpage(i).getMedia().get(j).getType().equals("Video"))
				{
					json.put("File Size", pages.getWebpage(i).getMedia().get(j).getSize());
					json.put("Path", pages.getWebpage(i).getLocalPath());
				}
			}
			
			//Outputs the file size and path of each audio file in the website
			for(int j=0; j<pages.getWebpage(i).getMedia().size(); j++) { 
				if(pages.getWebpage(i).getMedia().get(j).getType().equals("Audio"))
				{
					json.put("File Size", pages.getWebpage(i).getMedia().get(j).getSize());
					json.put("Path", pages.getWebpage(i).getLocalPath());
				}
			}
			
			//Outputs the file size and path of each miscellaneous file in the website.
			for(int j=0; j<pages.getWebpage(i).getMisc().size(); j++) {
				json.put("File Size", pages.getWebpage(i).getMisc().get(j).getSize());
				json.put("Path", pages.getWebpage(i));
			}
		}
	}
		
	public void createJSONFile(){
		
		try {
			FileWriter file = new FileWriter("analysis.json");
			file.write(json.toString(1));
			
			file.close();
		} 	
		
		catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
