package edu.odu.cs.cs350;

import java.util.*;

import org.json.JSONObject;
import org.json.JSONArray;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class TestJsonWriter {

		//Files to use in test cases
		FileResource localImage;
		FileResource externalImage;
		FileResource script;
		FileResource styleSheet;
		Anchor intraPageLink; 
		Anchor interSiteLink;
		Anchor externalLink;
		FileResource archive;
		FileResource video;
		FileResource audio;
		FileResource misc;
		
		JsonWriter jsonWriterObject;
		HTMLDocument HTML;
		Website website;
		
	@Before 
	public void websiteExample() {
			
		localImage= new FileResource(10, 1, "Local Image", "/local/image.png", "name");
		externalImage= new FileResource(20, 2, "External Image", "www.google.com/image.png", "name");
		script= new FileResource(30, 3, "Script", "/local/script.js", "name");
		styleSheet= new FileResource(40, 4, "Stylesheet", "/local/style.css", "name");
		intraPageLink= new Anchor("http://intrapage.com", "Intra-Page");
		interSiteLink= new Anchor("http://intersite.com", "Inter-Site");
		externalLink= new Anchor("http://external.com", "External");
		archive= new FileResource(50, 5, "Archive", "/local/archive.rar", "name");
		video= new FileResource(60, 6, "Video", "/local/video.mp4", "name");
		audio= new FileResource(70, 7, "Audio", "/local/audio.wav", "name");
		misc= new FileResource(80, 8, "Miscellaneous", "local/misc.jar", "name");
			
		//HTML Document to use in test cases
		HTML= new HTMLDocument();
		HTML.setLocalPath("www.test.com/the/example/path", "https://www.test.com");
		HTML.setLinks(intraPageLink);
		HTML.setLinks(interSiteLink);
		HTML.setLinks(externalLink);
		HTML.setMedia(archive);
		HTML.setMedia(video);
		HTML.setMedia(audio);
		HTML.setMisc(misc);
		HTML.setMedia(localImage);
		HTML.setMedia(externalImage);
		HTML.setScripts(script);
		HTML.setStyleSheets(styleSheet);
			
		//Website to use in test cases
		website= new Website();
		website.addWebpage(HTML);
		jsonWriterObject = new JsonWriter();
	}
		
		
	
	@Test
	public void TestSetLocalImageCount() {
		
		jsonWriterObject.setLocalImageCount(HTML);
		assertEquals(1, jsonWriterObject.getLocalImageCount());
	}
	
	@Test
	public void TestSetExternalImageCount() {
		
		jsonWriterObject.setExternalImageCount(HTML);
		assertEquals(1, jsonWriterObject.getExternalImageCount());
	}
	
	@Test
	public void TestSetScriptCount() {
		
		jsonWriterObject.setScriptCount(HTML);
		assertEquals(1, jsonWriterObject.getScriptCount());
	}
	
	@Test
	public void TestSetStylesheetCount() {
		
		jsonWriterObject.setStylesheetCount(HTML);
		assertEquals(1, jsonWriterObject.getStylesheetCount());
	}
	
	@Test
	public void TestSetIntraPageLinkCount() {
		
		jsonWriterObject.setIntraPageLinkCount(HTML);
		assertEquals(1, jsonWriterObject.getIntraPageLinkCount());
	}
	
	@Test
	public void TestSetInterSiteLinkCount() {
	
		jsonWriterObject.setInterSiteLinkCount(HTML);
		assertEquals(1, jsonWriterObject.getInterSiteLinkCount());
	}

	@Test
	public void TestSetExternalLinkCount() {
		
		jsonWriterObject.setExternalLinkCount(HTML);
		assertEquals(1, jsonWriterObject.getExternalLinkCount());
	}
	
	
	@Test
	public void TestJSONFormatter() {
		
		jsonWriterObject.JSONFormatter(website);
		
		//Determines if the information assigned by the mutators is equal to the
		//information put into the JSONObject in the JSONFormatter function, which is the
		//information that will be output into the JSON File
		
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("Local Image Count"));
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("External Image Count"));
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("Script Count"));
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("Stylesheet Count"));
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("Intra-Page Link Count"));
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("Inter-Site Link Count"));
			assertEquals(1, jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getInt("External Link Count"));
			
			//assertEquals("Name", jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getJSONArray("Image List").getString(0));
			//assertEquals("Name", jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getJSONArray("Images List").getString(1));
			
			//assertEquals("Name", jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getJSONArray("Script List").getString(0));
			
			//assertEquals("Name", jsonWriterObject.getJSONObject().getJSONArray("Pages").getJSONObject(0).getJSONArray("Stylesheet List").get(0));
			
			//assertEquals(1, jsonWriterObject.getJSONArray("Images").getJSONObject(0).getInt("Number of Pages");
			//assertEquals(["/the/example/path"], jsonWriterObject.getJSONObject().getJSONArray(Images).getJSONObject(0).getJSONArray("Page List"));
			
			//assertEquals(2, jsonWriterObject.getJSONArray("Images").getJSONObject(1).getInt("Number of Pages");
			//assertEquals(["/the/example/path"], jsonWriterObject.getJSONObject().getJSONArray(Images).getJSONObject(1).getJSONArray("Page List"));
		
			assertEquals(50 , jsonWriterObject.getJSONObject().getJSONArray("Archives").getJSONObject(0).getInt("File Size"));
			assertEquals(60 , jsonWriterObject.getJSONObject().getJSONArray("Videos").getJSONObject(0).getInt("File Size"));
			assertEquals(70 , jsonWriterObject.getJSONObject().getJSONArray("Audio").getJSONObject(0).getInt("File Size"));
			assertEquals(80 , jsonWriterObject.getJSONObject().getJSONArray("Miscellaneous").getJSONObject(0).getInt("File Size"));
			
			assertEquals("/the/example/path" , jsonWriterObject.getJSONObject().getJSONArray("Archives").getJSONObject(0).getString("Path"));
			assertEquals("/the/example/path" , jsonWriterObject.getJSONObject().getJSONArray("Videos").getJSONObject(0).getString("Path"));
			assertEquals("/the/example/path" , jsonWriterObject.getJSONObject().getJSONArray("Audio").getJSONObject(0).getString("Path"));
			assertEquals("/the/example/path" , jsonWriterObject.getJSONObject().getJSONArray("Miscellaneous").getJSONObject(0).getString("Path"));
	}
}
