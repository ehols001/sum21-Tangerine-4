package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestWebsite {
	
	Website ws1;
	Website ws2;
	String lfp = new String("localFilePath");
	String lfp2 = new String("localFilePath2");
	HTMLDocument hd = new HTMLDocument();
	HTMLDocument hd2 = new HTMLDocument();
	Vector<String> testFilePaths;
	Vector<HTMLDocument> testWebpages;
	
	@BeforeEach
	void setup() {
		ws1 = new Website();
		ws2 = new Website();
		testFilePaths = new Vector<String>();
		testWebpages = new Vector<HTMLDocument>();
	}

	@Test
	void testWebsite() {
		assertEquals(0, ws1.size());
		assertFalse(ws1.contains("webpage"));
		assertEquals(ws2, ws1);
	}

	@Test
	void testAddLocalFilePath() {
		ws1.addLocalFilePath(lfp);
		assertEquals(1, testFilePaths.size());
		assertTrue(testFilePaths.contains(lfp));
		assertFalse(testFilePaths.contains(lfp2));
		assertNotEquals(ws1, new Website());
		ws2.addLocalFilePath(lfp);
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
