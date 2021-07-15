package edu.odu.cs.cs350;

import java.io.FileWriter;
import org.json.simple.JSONObject;
import java.util.*;
///import WebsiteParser?

public class JsonWriter {
	
	
	
	public JsonWriter() { 
		
	}
	
	private JSONObject json = new JSONObject(); //JSON file to be written to
	
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
	private LinkedList<String> imageFiles = new LinkedList<String>();
	private LinkedList<String> archiveFiles = new LinkedList<String>();
	private LinkedList<String> videoFiles = new LinkedList<String>();
	private LinkedList<String> audioFiles = new LinkedList<String>();
	private LinkedList<String> uncategorizedFiles = new LinkedList<String>();
	private LinkedList<String> stylesheetFiles = new LinkedList<String>();
	private LinkedList<String> scriptFiles = new LinkedList<String>();
	
	public JSONObject getJSONObject() { //Accessor for the JSON object created in this class
		return json;
	}
	
	void setLocalImageCount(int num) {
		
		//Sets the count of the number of local images
	}
	
	
	public int getLocalImageCount() {
		
		//returns localImageCount;
		return 0;
	}
	
	
	void setExternalImageCount(int num) {
		
		//Sets the count of the number of external images
	}
	
	public int getExternalImageCount() {
		
		//returns externalImageCount;
		return 0;
	}
	
	void setScriptCount(int num) {
		
		//Sets the count of the number of scripts
	}
	
	public int getScriptCount() {
		
		//returns scriptCount;
		return 0;
	}
	
	void setStylesheetCount(int num) {
		
		//Sets the count of the number of stylesheets
	}
	
	
	public int getStylesheetCount() {
		
		//returns stylesheetCount;
		return 0;
	}
	
	public void setIntraPageLinkCount(int intraPageLinkCount) {
		//Sets the count of the number of intra-page links
	}
	
	public int getIntraPageLinkCount() {
		//returns intraPageLinkCount;
		return 0;
	}
	
	public void setInterSiteLinkCount(int interSiteLinkCount) {
		//Sets the count of the number of inter-site links
	}

	public int getInterSiteLinkCount() {
		//returns interSiteLinkCount;
		return 0;
	}
	
	public void setExternalLinkCount(int externalLinkCount) {
		//Sets the count of the number of external links
	}

	public int getExternalLinkCount() {
		//returns externalLinkCount;
		return 0;
	}
	
	void setStylesheetFiles(LinkedList<String> list) {
		
		//Creates list of stylesheet files and their corresponding information
	}
	
	public LinkedList<String> getStylesheetFiles() {
		
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
	
	void JSONFormatter() {
		//Puts local image count into the JSON Object
			/* Ex: JsonObject.put("Image Count", this.getImageCount())*/
		//Puts external image count into the JSON Object
		//Puts script count into the JSON Object
		//Puts stylesheet count into the JSON Object
		//Uses a loop to put the list of images into the JSON Object
		//Uses a loop to put the list of scripts into the JSON Object
		//Uses a loop to put the list of stylesheets into the JSON Object
		//Puts the intra-page link count into the JSON Object
		//Puts the inter-site link count into the JSON Object
		//Puts the external link count into the JSON Object
		
		///Use getter to put the number of pages and list of pages where an image occurs??
		///Use a getter to put the file size and path to resource of archive files?
		///Use a getter to put the file size and path to resource for video files?
		///Use a getter to put the file size and path to resource for audio files?
		///Use a getter to put the file size and path to resource for non-categorized files?
		
	}

}
