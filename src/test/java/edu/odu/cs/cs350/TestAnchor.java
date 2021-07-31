package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAnchor {
	
	private Anchor testLink;

	@Before
	public void setUp() {
		testLink = new Anchor();
	}

	@Test
	public void testDefaultConstructor() {
		//fail("Not yet implemented");
		Anchor newLink = new Anchor();
		
		assertEquals(newLink.getType(), "");
		assertEquals(newLink.getURL(), "");
	}
	
	@Test
	public void testNonDefaultConstructor() {
		//fail("Not yet implemented")
		Anchor newLink = new Anchor("www.test.org", "external");
		
		assertEquals(newLink.getType(), "external");
		assertEquals(newLink.getURL(), "www.test.org");
	}


	@Test
	public void testSetURL() {
		//fail("Not yet implemented");
		testLink.setURL("www.google.com");
		
		assertEquals(testLink.getURL(), "www.google.com");
	}

	@Test
	public void testSetType() {
		//fail("Not yet implemented");
		testLink.setType("internal");
		
		assertEquals(testLink.getType(), "internal");
	}

}
