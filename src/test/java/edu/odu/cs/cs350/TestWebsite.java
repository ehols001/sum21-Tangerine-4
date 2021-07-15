package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWebsite {

	@Test
	void testWebsite() {
		Website ws1 = new Website();
		assertEquals(0, ws1.size());
		assertFalse(ws1.contains("page"));
		Website ws2 = new Website();
		assertEquals(ws2, ws1);
	}

	@Test
	void testAddPageURL() {
		String pUrl = new String("pageURL");
		Website ws1 = new Website();
		ws1.addPageURL(pUrl);
		assertEquals(1, ws1.pageURLs.size());
		assertTrue(ws1.pageURLs.contains(pUrl));
		assertFalse(ws1.pageURLs.contains("pageURL2"));
		assertNotEquals(ws1, new Website());
		Website ws2 = new Website();
		ws2.addPageURL(pUrl);
		assertEquals(ws2, ws1);
	}

	@Test
	void testAddPage() {
		String page = new String("page");
		Website ws1 = new Website();
		ws1.addPage(page);
		assertEquals(1, ws1.pages.size());
		assertTrue(ws1.pages.contains(page));
		assertFalse(ws1.pages.contains("page2"));
		assertNotEquals(ws1, new Website());
		Website ws2 = new Website();
		ws2.addPage(page);
		assertEquals(ws2, ws1);
	}

}
