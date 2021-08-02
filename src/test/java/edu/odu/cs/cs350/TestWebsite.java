package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestWebsite {
	
	Website ws1;
	Website ws2;
	HTMLDocument hd = new HTMLDocument();
	HTMLDocument hd2 = new HTMLDocument();
	String testUrl = "https://en.wikipedia.org/wiki/Main_Page";
	String testPath = "/home/test/directory/";
	
	@Before
	public void setup() {
		ws1 = new Website();
		ws2 = new Website();
	}

	@Test
	public void testWebsite() {
		assertEquals(Website.getLocalRoot(), "");
		assertEquals(Website.getRootUrl(), "");
		assertEquals(ws1.size(), 0);
		assertFalse(ws1.contains(hd));
		assertEquals(ws2.size(), ws1.size());
	}
	
	@Test
	public void testWebsiteParams() {
		Website ws = new Website(testPath, testUrl);
		assertEquals(Website.getLocalRoot(), testPath);
		assertEquals(Website.getRootUrl(), testUrl);
		assertEquals(ws.size(), 0);
		assertFalse(ws.contains(hd));
	}

	@Test
	public void testAddWebpage() { 
		ws1.addWebpage(hd);
		assertEquals(1, ws1.size());
		assertTrue(ws1.contains(hd));
		assertFalse(ws1.contains(hd2));
		assertNotEquals(ws1, new Website());
		ws2.addWebpage(hd);
		assertEquals(ws2.size(), ws1.size());
	}

}
