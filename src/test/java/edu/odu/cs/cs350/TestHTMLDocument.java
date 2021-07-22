package edu.odu.cs.cs350;

//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


class TestHTMLDocument {

	HTMLDocument html1;
	
	String lfp = new String("localFilePath");
	
	
	@Before
	void setup() {
		html1 = new HTMLDocument();
		
		html1.setLocalPath(lfp);
	}
	
	@Test
	void testDefaultConstructor() {
		fail("Not yet implemented");
		//HTMLDocument doc = new HTMLDocument();
	}

	@Test
	void testNonDefaultConstructor() {
		fail("Not yet implemented");
		//Document page = null;
		//HTMLDocument doc = new HTMLDocument();
	}

	@Test
	void testGetLinks() {
		fail("Not yet implemented");
		assertEquals(html1.getLinks().size(), 0);
		
	}

	@Test
	void testGetMedia() {
		fail("Not yet implemented");
		assertEquals(html1.getMedia().size(), 0);

	}

	@Test
	void testGetScripts() {
		fail("Not yet implemented");
		assertEquals(html1.getScripts().size(), 0);

	}

	@Test
	void testGetStyleSheets() {
		fail("Not yet implemented");
		assertEquals(html1.getStyleSheets().size(), 0);

	}

	@Test
	void testGetMisc() {
		fail("Not yet implemented");
		assertEquals(html1.getMisc().size(), 0);

	}

	@Test
	void testGetLocalPath() {
		fail("Not yet implemented");
		assertEquals(html1.getLocalPath(), "localFilePath");
	}

	@Test
	void testSetLocalPath() {
		fail("Not yet implemented");
		html1.setLocalPath("test/val");
		assertEquals(html1.getLocalPath(), "test/val");
	}

}
