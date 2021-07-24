package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;

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
		image = new FileResource(10, 10, "image");
		image = new FileResource(20, 10, "image");
		htmldoc = new HTMLDocument();
		htmldoc2 = new HTMLDocument();
		website = new Website();
		website2 = new Website();
		
		htmldoc.setLocalPath("/enter/night/");
		htmldoc2.setLocalPath("/exit/light/");
		htmldoc.setMedia(image);
		htmldoc2.setMedia(image2);
		website.add(htmldoc);
		website2.add(htmldoc2);
		
		writer = new TxtWriter();
		writer2 = new TxtWriter(website);
	}
	
	@Test
	void defaultConstructorTest() 
	{
		assertEquals(0, writer.getPages().size());
		assertEquals(0, writer.getSizes().size());
	}
	
	@Test
	void parameterizedConstructorTest() 
	{	
		assertEquals(20, writer2.getSizes().get(0));
		assertEquals("/exit/light/", writer2.getPages().get(0));
	}
	
	@Test
	void setSizesTest() 
	{
		writer.setSizes(writer2);
		
		assertEquals(20, writer.getSizes().get(0));
		assertEquals(0, writer.getPages().size());
	}
	
	@Test
	void setPagesTest() 
	{
		writer.setPages(writer2);
		
		assertEquals("/exit/light/", writer2.getPages().get(0));
		assertEquals(0, writer.Sizes().size());
	}
	
	
	@Test
	void writeToFileTest() 
	{
		fail("Incomplete");
	}
}
