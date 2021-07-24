package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestTxtWriter 
{
	Website website;
	Website website2;
	HTMLDocument htmldoc;
	HTMLDocument htmldoc2;
	FileResource image;
	FileResource image2;
	TxtWriter writer;
	TxtWriter writer2;
	
	@Before 
	public void setup() 
	{
		website = new Website();
		website2 = new Website();
		htmldoc = new HTMLDocument();
		htmldoc2 = new HTMLDocument();
		image = new FileResource(10, 10, "image");
		image2 = new FileResource(20, 10, "image");
		
		htmldoc.setLocalPath("/enter/night/");
		htmldoc2.setLocalPath("/exit/light/");
		htmldoc.setMedia(image);
		htmldoc2.setMedia(image2);
		website.addWebpage(htmldoc);
		website2.addWebpage(htmldoc2);
		
		writer = new TxtWriter();
		writer2 = new TxtWriter(website);
	}
	
	@Test
	public void defaultConstructorTest() 
	{
		assertEquals(0, writer.getPages().size());
		assertEquals(0, writer.getSizes().size());
	}
	
	@Test
	public void parameterizedConstructorTest() 
	{	
		assertEquals(20, writer2.getSizes().get(0), 0.01);
		assertEquals("/exit/light/", writer2.getPages().get(0));
	}
	
	@Test
	public void setSizesTest() 
	{
		writer.setSizes(website2);
		
		assertEquals(20, writer.getSizes().get(0), 0.01);
		assertEquals(0, writer.getPages().size());
	}
	
	@Test
	public void setPagesTest() 
	{
		writer.setPages(website2);
		
		assertEquals("/exit/light/", writer2.getPages().get(0));
		assertEquals(0, writer.getSizes().size());
	}
	
	@Test
	public void writeToFileTest() 
	{
		fail("Incomplete");
		writer2.writeToFile();
	}
}
