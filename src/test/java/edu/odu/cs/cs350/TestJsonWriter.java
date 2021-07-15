package edu.odu.cs.cs350;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.json.simple.*;
import org.junit.jupiter.api.Test;

class TestJsonWriter {

	@Test
	void TestSetLocalImageCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		int num= 15;
		jsonWriterObject.setLocalImageCount(num);
		
		assertEquals(num, jsonWriterObject.getLocalImageCount());
	}
	
	@Test
	void TestSetExternalImageCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		int num= 15;
		jsonWriterObject.setExternalImageCount(num);
		
		assertEquals(num, jsonWriterObject.getExternalImageCount());
	}
	
	@Test
	void TestSetScriptCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		int num= 15;
		jsonWriterObject.setScriptCount(num);
		
		assertEquals(num, jsonWriterObject.getScriptCount());
	}
	
	@Test
	void TestSetStylesheetCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		int num=15;
		
		jsonWriterObject.setStylesheetCount(num);
		
		assertEquals(num, jsonWriterObject.getStylesheetCount());
	}
	
	@Test
	void TestSetIntraPageLinkCount() {
		JsonWriter jsonWriterObject = new JsonWriter();
		int num=15;
		
		jsonWriterObject.setIntraPageLinkCount(num);
		
		assertEquals(num, jsonWriterObject.getIntraPageLinkCount());
	}
	
	@Test
	void setInterSiteLinkCount(int interSiteLinkCount) {
		JsonWriter jsonWriterObject = new JsonWriter();
		int num=15;
		
		jsonWriterObject.setInterSiteLinkCount(num);
		
		assertEquals(num, jsonWriterObject.getInterSiteLinkCount());
	}

	@Test
	public void setExternalLinkCount(int externalLinkCount) {
		JsonWriter jsonWriterObject = new JsonWriter();
		int num=15;
		
		jsonWriterObject.setExternalLinkCount(num);
		
		assertEquals(num, jsonWriterObject.getExternalLinkCount());
	}
	
	@Test
	void TestSetScriptFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setImageFiles(list);
		
		if(jsonWriterObject.getScriptFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getScriptFiles().get(i));
			}
		}
	}
	
	@Test
	void TestSetStylesheetFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setStylesheetFiles(list);
		
		if(jsonWriterObject.getScriptFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getStylesheetFiles().get(i));
			}
		}
	}
	
	@Test
	void TestSetImageFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setImageFiles(list);
		
		if(jsonWriterObject.getImageFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getImageFiles().get(i));
			}
		}
	}

	
	@Test
	void TestSetArchiveFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setArchiveFiles(list);
		
		if(jsonWriterObject.getArchiveFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getArchiveFiles().get(i));
			}
		}
	}

	@Test
	void TestSetVideoFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setVideoFiles(list);
		
		if(jsonWriterObject.getVideoFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getVideoFiles().get(i));
			}
		}
	}
	
	@Test
	void TestSetAudioFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setAudioFiles(list);
		
		if(jsonWriterObject.getAudioFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getAudioFiles().get(i));
			}
		}
	}
	
	@Test
	void TestSetUncategorizedFiles() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setUncategorizedFiles(list);
		
		if(jsonWriterObject.getUncategorizedFiles().size()==list.size()) { ///Checks for same size initially
			for(int i=0; i<list.size(); i++) {
				assertEquals(list.get(i), jsonWriterObject.getUncategorizedFiles().get(i));
			}
		}
	}	
	
	@Test
	void TestJSONFormatter() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		LinkedList<String> list= new LinkedList();
		
		int num=15;
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		jsonWriterObject.setLocalImageCount(num);
		jsonWriterObject.setExternalImageCount(num);
		jsonWriterObject.setScriptCount(num);
		jsonWriterObject.setStylesheetCount(num);
		jsonWriterObject.setImageFiles(list);
		jsonWriterObject.setVideoFiles(list);
		jsonWriterObject.setAudioFiles(list);
		jsonWriterObject.setArchiveFiles(list);
		jsonWriterObject.setUncategorizedFiles(list);
		
		jsonWriterObject.JSONFormatter();
		
		/*Determines if the information assigned by the mutators is equal to the
		information put into the JSONObject in the JSONFormatter function, which is the
		information that will be output into the JSON File*/
		assertEquals(num, jsonWriterObject.getJSONObject().get("Local Image Count"));
		assertEquals(num, jsonWriterObject.getJSONObject().get("External Image Count"));
		assertEquals(num, jsonWriterObject.getJSONObject().get("Script Count"));
		assertEquals(num, jsonWriterObject.getJSONObject().get("Stylesheets Count"));
		
		assertEquals(list, jsonWriterObject.getJSONObject().get("Image Files"));
		assertEquals(list, jsonWriterObject.getJSONObject().get("Video Files"));
		assertEquals(list, jsonWriterObject.getJSONObject().get("Audio Files"));
		assertEquals(list, jsonWriterObject.getJSONObject().get("Archive Files"));
		assertEquals(list, jsonWriterObject.getJSONObject().get("Uncategorized Files"));
	
	}
}
