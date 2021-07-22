package edu.odu.cs.cs350;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


class TestWebsite {
	
	Website ws1;
	Website ws2;
	String lp = new String("localPath");
	String lp2 = new String("localPath2");
	HTMLDocument hd = new HTMLDocument();
	HTMLDocument hd2 = new HTMLDocument();
	Vector<String> testLocalPaths;
	Vector<HTMLDocument> testWebpages;
	
	@Before
	void setup() {
		ws1 = new Website();
		ws2 = new Website();
		testLocalPaths = new Vector<String>();
		testWebpages = new Vector<HTMLDocument>();
	}

	@Test
	void testWebsite() {
		assertEquals(0, ws1.size());
		assertFalse(ws1.contains("webpage"));
		assertEquals(ws2, ws1);
	}

	@Test
	void testAddLocalPath() {
		ws1.addLocalPath(lp);
		assertEquals(1, testLocalPaths.size());
		assertTrue(testLocalPaths.contains(lp));
		assertFalse(testLocalPaths.contains(lp2));
		assertNotEquals(ws1, new Website());
		ws2.addLocalPath(lp);
		assertEquals(ws2, ws1);
	}

	@Test
	void testAddWebpage() {
		ws1.addWebpage(hd);
		assertEquals(1, testWebpages.size());
		assertTrue(testWebpages.contains(hd));
		assertFalse(testWebpages.contains(hd2));
		assertNotEquals(ws1, new Website());
		ws2.addWebpage(hd);
		assertEquals(ws2, ws1);
	}

}
