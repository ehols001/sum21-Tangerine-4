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
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setLocalImageCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getLocalImageCount());
	}
	
	@Test
	void TestSetExternalImageCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		//int num= 15;
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setExternalImageCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getExternalImageCount());
	}
	
	@Test
	void TestSetScriptCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		//int num= 15;
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setScriptCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getScriptCount());
	}
	
	@Test
	void TestSetStylesheetCount() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		//int num=15;
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setStylesheetCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getStylesheetCount());
	}
	
	@Test
	void TestSetIntraPageLinkCount() {
		JsonWriter jsonWriterObject = new JsonWriter();
		//int num=15;
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setIntraPageLinkCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getIntraPageLinkCount());
	}
	
	@Test
	void setInterSiteLinkCount(int interSiteLinkCount) {
		JsonWriter jsonWriterObject = new JsonWriter();
		//int num=15;
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setInterSiteLinkCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getInterSiteLinkCount());
	}

	@Test
	public void setExternalLinkCount(int externalLinkCount) {
		JsonWriter jsonWriterObject = new JsonWriter();
		//int num=15;
		
		HTMLDocument test= new HTMLDocument();
		jsonWriterObject.setExternalLinkCount(test);
		assertEquals(test.getMedia().size(), jsonWriterObject.getExternalLinkCount());
	}
	
	/*@Test
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
	}*/	
	
	/*@Test
	void TestJSONFormatter() {
		
		JsonWriter jsonWriterObject = new JsonWriter();
		Website list= new Website();
		
		//int num=15;
		
		HTMLDocument Test1= new HTMLDocument();
		HTMLDocument Test2= new HTMLDocument();
		HTMLDocument Test3= new HTMLDocument();
		HTMLDocument Test4= new HTMLDocument();
		HTMLDocument Test5= new HTMLDocument();
				
		list.addWebpage(Test1);
		list.addWebpage(Test2);
		list.addWebpage(Test3);
		list.addWebpage(Test4);
		list.addWebpage(Test5);
		
		jsonWriterObject.setLocalImageCount(Test1);
		jsonWriterObject.setExternalImageCount(Test2);
		jsonWriterObject.setScriptCount(Test3);
		jsonWriterObject.setStylesheetCount(Test4);
		jsonWriterObject.setImageFiles(list);
		jsonWriterObject.setVideoFiles(list);
		jsonWriterObject.setAudioFiles(list);
		jsonWriterObject.setArchiveFiles(list);
		jsonWriterObject.setUncategorizedFiles(list);
		
		jsonWriterObject.JSONFormatter(list);
		
		Determines if the information assigned by the mutators is equal to the
		information put into the JSONObject in the JSONFormatter function, which is the
		information that will be output into the JSON File
		for(int i=0; i<list.size(); i++) {
			assertEquals(Test1.size(), jsonWriterObject.getJSONObject().get("Local Image Count"));
			assertEquals(Test2.size(), jsonWriterObject.getJSONObject().get("External Image Count"));
			assertEquals(Test3.size(), jsonWriterObject.getJSONObject().get("Script Count"));
			assertEquals(Test4.size(), jsonWriterObject.getJSONObject().get("Stylesheets Count"));
		
			assertEquals(list.get(i).getMedia(), jsonWriterObject.getJSONObject().get("Image"));
			assertEquals(list, jsonWriterObject.getJSONObject().get("Video Files"));
			assertEquals(list, jsonWriterObject.getJSONObject().get("Audio Files"));
			assertEquals(list, jsonWriterObject.getJSONObject().get("Archive Files"));
			assertEquals(list, jsonWriterObject.getJSONObject().get("Uncategorized Files"));
		
			for(int j=0; j<list.get(i).getMedia().size(); j++) {
				json.put("Image", pages.get(i).getMedia().get(j));
				json.put("Number of Pages", pages.get(i).getMedia().get(j).getPages());
			}
		}
	}*/
}
