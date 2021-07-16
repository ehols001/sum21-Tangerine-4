package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import TxtWriter.java;
import Website.java;
import HTMLDocument.java;

class TestTxtWriter {
 
	@Test
	void defaultConstructorTest() {
		fail("Incomplete");
		
		TxtWriter writer = new TxtWriter();
	}
	
	@Test
	void parameterizedConstructorTest() {
		fail("Incomplete");
		
		Website website = new Website();
		TxtWriter writer = new TxtWriter(website);
	}
	
	@Test
	void setSizesTest() 
	{
		fail("Incomplete");
		Website website = new Website();
		TxtWriter writer = new TxtWriter(website);
		
		assertEquals(sizes, writer.getSizes());
	}
	
	@Test
	void setPagesTest() 
	{
		fail("Incomplete");
		Website website = new Website();
		TxtWriter writer = new TxtWriter(website);
		
		assertEquals(pages, writer.getPages());
	}
	
	@Test
	void writeToFileTest() 
	{
		fail("Incomplete");
	}
}
