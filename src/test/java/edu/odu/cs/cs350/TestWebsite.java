package edu.odu.cs.cs350;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class TestWebsite {
	
	Website ws1;
	Website ws2;
	HTMLDocument hd = new HTMLDocument();
	HTMLDocument hd2 = new HTMLDocument();
	Vector<HTMLDocument> testWebpages;
	
	@Before
	public void setup() {
		ws1 = new Website();
		ws2 = new Website();
		testWebpages = new Vector<HTMLDocument>();
	}

	@Test
	public void testWebsite() {
		assertEquals(0, ws1.size());
		assertFalse(ws1.contains(hd));
		assertEquals(ws2, ws1);
	}

	@Test
	public void testAddWebpage() {
		ws1.addWebpage(hd);
		assertEquals(1, testWebpages.size());
		assertTrue(testWebpages.contains(hd));
		assertFalse(testWebpages.contains(hd2));
		assertNotEquals(ws1, new Website());
		ws2.addWebpage(hd);
		assertEquals(ws2, ws1);
	}

}
