package edu.odu.cs.cs350;

import org.json.simple.JSONObject;
import java.io.*;
import java.util.*;

import javax.swing.text.html.HTMLDocument;


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
	/*private ArrayList<String> imageFiles = new ArrayList<String>();
	private ArrayList<String> archiveFiles = new ArrayList<String>();
	private ArrayList<String> videoFiles = new ArrayList<String>();
	private ArrayList<String> audioFiles = new ArrayList<String>();
	private ArrayList<String> uncategorizedFiles = new ArrayList<String>();
	private ArrayList<String> stylesheetFiles = new ArrayList<String>();
	private ArrayList<String> scriptFiles = new ArrayList<String>();
	*/
	public JSONObject getJSONObject() { //Accessor for the JSON object created in this class
		return json;
	}
	
	void setLocalImageCount(HTMLDocument page) {///Should this be in HTMLDocument instead?
		
		//Sets the count of the number of local images by iterating through the list and counting
		
		localImageCount=page.getMedia().size();
		
	}
	
	
	public int getLocalImageCount() {
		
		//returns localImageCount;
		return localImageCount;
	}
	
	
	void setExternalImageCount(HTMLDocument page) {
		
		//Sets the count of the number of external images by iterating through the list and counting
		
		externalImageCount=page.getMedia().size(); //Should be getExternalImage and in HTMLDocument?
	}
	
	public int getExternalImageCount() {
		
		//returns externalImageCount;
		return externalImageCount;
	}
	
	void setScriptCount(HTMLDocument page) {
		
		//Sets the count of the number of scripts by iterating through the list and counting
		scriptCount=page.getScripts().size();
	}
	
	public int getScriptCount() {
		
		//returns scriptCount;
		return scriptCount;
	}
	
	void setStylesheetCount(HTMLDocument page) {
		
		//Sets the count of the number of stylesheets
		
		stylesheetCount=page.getStyleSheets().size();
		
	}
	
	
	public int getStylesheetCount() {
		
		//returns stylesheetCount;
		return stylesheetCount;
	}
	
	public void setIntraPageLinkCount(HTMLDocument page) {
		//Sets the count of the number of intra-page links
		
		intraPageLinkCount=page.getLinks().size();
	}
	
	public int getIntraPageLinkCount() {
		//returns intraPageLinkCount;
		return intraPageLinkCount;
	}
	
	public void setInterSiteLinkCount(HTMLDocument page) {
		//Sets the count of the number of inter-site links
		
		interSiteLinkCount=page.getLinks().size();
		
	}

	public int getInterSiteLinkCount() {
		//returns interSiteLinkCount;
		return interSiteLinkCount;
	}
	
	public void setExternalLinkCount(HTMLDocument page) {
		//Sets the count of the number of external links
		externalLinkCount=page.getLinks().size();
	}

	public int getExternalLinkCount() {
		//returns externalLinkCount;
		return externalLinkCount;
	}
	
	void setStylesheetFiles(LinkedList<String> list) {
		
		//Creates list of stylesheet files and their corresponding information
	}
	
	/*public LinkedList<String> getStylesheetFiles() {
		
		return stylesheetFiles;
	}	
	
	void setScriptFiles(LinkedList<String> list) {
		
		//Creates list of script files and their corresponding information
	}
	
	public LinkedList<String> getScriptFiles() {
		
		return scriptFiles;
	}	
	
	void setImageFiles(LinkedList<String> list) {
		
		//Creates list of image files and their corresponding information
	}
	
	public LinkedList<String> getImageFiles() {
		
		return imageFiles;
	}	
	
	void setArchiveFiles(LinkedList<String> list) {
		
		//Creates list of archive files and their corresponding information
	}
	
	public LinkedList<String> getArchiveFiles() {
		
		return archiveFiles;
	}	
	
	void setVideoFiles(LinkedList<String> list) {
		
		//Creates list of video files and their corresponding information
	}
	
	public LinkedList<String> getVideoFiles() {
		
		return videoFiles;
	}	
	
	void setAudioFiles(LinkedList<String> list) {
		
		//Creates list of audio files and their corresponding information
	}
	
	public LinkedList<String> getAudioFiles() {
		
		return audioFiles;
	}	
	
	void setUncategorizedFiles(LinkedList<String> list) {
		
		//Creates list of uncategorized files and their corresponding information
	}
	
	public LinkedList<String> getUncategorizedFiles() {
		
		return uncategorizedFiles;
	}	
	*/
	
	void JSONFormatter(Website pages) {
		
		//Loops through each page in the website
		for(int i=0; i<pages.size(); i++) {
			
			//Outputs the counts of various files in each webpage
			this.put("Page", pages.get(i).getLocalPath());
			
			json.setLocalImageCount(pages.get(i));
			json.put("Local Image Count", this.getLocalImageCount());
			
			this.setExternalImageCount(pages.get(i));
			json.put("External Image Count", this.getExternalImageCount());
			
			this.setScriptCount(pages.get(i));
			json.put("Script Count", this.getScriptCount());
			
			this.setStylesheetCount(pages.get(i));
			json.put("Stylesheet Count", this.getStylesheetCount());
			
			this.setIntraPageLinkCount(pages.get(i));
			json.put("Intra-Page Link Count", this.getIntraPageLinkCount());
			
			this.setInterSiteLinkCount(pages.get(i));
			json.put("Inter-Site Link Count", this.getInterSiteLinkCount());
			
			this.setExternalLinkCount(pages.get(i));
			json.put("External Link Count", this.getExternalLinkCount());
			
			//Outputs the list of images throughout the website and the number of pages that it appears on
			for(int j=0; j<pages.get(i).getMedia().size(); j++) {
				json.put("Image", pages.get(i).getMedia().get(j));
				json.put("Number of Pages", pages.get(i).getMedia().get(j).getPages());
			}
			
			//Outputs the list of scripts throughout the website
			for(int j=0; j<pages.get(i).getScripts().size(); j++) {
				json.put("Script", pages.get(i).getScripts().get(j));
			}
			
			//Outputs the list of stylesheets throughout the website
			for(int j=0; j<pages.get(i).getStyleSheets().size(); j++) {
				json.put("Stylesheets", pages.getPages().get(i).getStyleSheets().get(j));
			}
			
			//Outputs the file size and path of each archive file in the website
			for(int j=0; j<pages.get(i).getMedia().size(); j++) { //should be getArchives rather than getMedia
				json.put("File Size", pages.get(i).getMedia().get(j).getSize());
				json.put("Path", pages.get(i).getMedia.get(j).getSize());//should be getPath rather than getSize
			}
			
			//Outputs the file size and path of each video file in the website
			for(int j=0; j<pages.get(i).getMedia().size(); j++) { //should be getVideos rather than getMedia
				json.put("File Size", pages.get(i).getMedia().get(j).getSize());
				json.put("Path", pages.get(i).getMedia.get(j).getSize());//should be getPath rather than getSize
			}
			
			//Outputs the file size and path of each audio file in the website
			for(int j=0; j<pages.get(i).getMedia().size(); j++) { //should be getAudio rather than getMEdia
				json.put("File Size", pages.get(i).getMedia().get(j).getSize());
				json.put("Path", pages.get(i).getMedia.get(j).getSize());//should be getPath rather than getSize
			}
			
			//Outputs the file size and path of each miscellaneous file in the website.
			for(int j=0; j<pages.get(i).getMisc().size(); j++) {
				json.put("File Size", pages.get(i).getMisc().get(j).getSize());
				json.put("Path", pages.get(i).getMisc.get(j).getSize());
			}
		}
		
		FileWriter file = new FileWriter("E:/output.json");
        	file.write(json.toJSONString());
        	file.close();
	}

}
