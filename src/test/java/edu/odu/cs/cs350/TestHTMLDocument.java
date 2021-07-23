package edu.odu.cs.cs350;

//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class TestHTMLDocument {

	private HTMLDocument html1;
	private Anchor testLink;
	private FileResource testImage;
	
	private String lfp;
	
	
	@Before
	public void setup() {
		html1 = new HTMLDocument();
		testLink = new Anchor("www.test.org", "external");
		testImage = new FileResource();
		
		testImage.setPages(3);
		testImage.setSize(1024);
		testImage.setType("img");
		
		
		lfp = new String("localFilePath");
		html1.setLocalPath(lfp);
	}
	
	@Test
	public void testDefaultConstructor() {
		//fail("Not yet implemented");
		HTMLDocument doc = new HTMLDocument();
		
		assertEquals(doc.getMisc().size(), 0);
		assertEquals(doc.getStyleSheets().size(), 0);
		assertEquals(doc.getScripts().size(), 0);
		assertEquals(doc.getMedia().size(), 0);
		assertEquals(doc.getLinks().size(), 0);
		assertEquals(doc.getLocalPath(), "");
	}

//	@Test
//	public void testNonDefaultConstructor() {
//		fail("Not yet implemented");
//		//Document page = null;
//		//HTMLDocument doc = new HTMLDocument();
//	}

	@Test
	public void testSetLinks() {
		//fail("Not yet implemented");
		html1.setLinks(testLink);
		
		assertEquals(html1.getLinks().size(), 1);
		assertEquals(html1.getLinks().get(0), testLink);
		
	}

	@Test
	public void testSetMedia() {
		//fail("Not yet implemented");
		html1.setMedia(testImage);
		
		assertEquals(html1.getMedia().size(), 1);
		assertEquals(html1.getMedia().get(0), testImage);

	}

	@Test
	public void testSetScripts() {
		fail("Not yet implemented");
//		html1.setScripts("www.test.com/scripts/javascript.js");
//		
//		assertEquals(html1.getScripts().size(), 1);

	}

	@Test
	public void testSetStyleSheets() {
		fail("Not yet implemented");
//		html1.setStyleSheets("www.test.com/scripts/script.css");
//		
//		assertEquals(html1.getStyleSheets().size(), 1);

	}

	@Test
	public void testSetMisc() {
		fail("Not yet implemented");
//		html1.setMisc("www.test.com/misc/misc.zip");
//		
//		assertEquals(html1.getMisc().size(), 1);

	}

	@Test
	public void testSetLocalPath() {
//		fail("Not yet implemented");
		html1.setLocalPath("test/val");
		assertEquals(html1.getLocalPath(), "test/val");
	}

}
