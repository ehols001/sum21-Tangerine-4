package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.lang.reflect.AccessibleObject;


public class TestExcelWriter {
	Website web1;
	Website web2;

	HTMLDocument html1;
	HTMLDocument html2;

	FileResource image;
	FileResource css;
	FileResource scripts;

	Anchor intraPage;
	Anchor internalLink;
	Anchor externalLink;

	ExcelWriter ew1;
	ExcelWriter ew2;

	@Before
	public void setup()
	{
		web1 = new Website();
		web2 = new Website();

		html1 = new HTMLDocument();
		html2 = new HTMLDocument();

		image = new FileResource(6, 10, "image");
		css = new FileResource(5, 11, "stylesheet");
		scripts = new FileResource(4, 8, "script");

		intraPage = new Anchor("#somelink", "intraPage");
		internalLink = new Anchor("/odu/cs", "internalLink");
		externalLink = new Anchor("www.google.com", "externalLink");


	}

	@Test
	public void defaultConstructorTest()
	{
		String life = "life";
		assertEquals(life, "life");

	}
	
	@Test
	public void parameterizedConstructorTest() {
		fail("Incomplete");

		//ExcelWriter writer2 = new ExcelWriter(website);
	}

	@Test
	public void setPagesTest()
	{
		fail("Incomplete");
	}

	@Test
	public void setImagesTest()
	{
		fail("Incomplete");
	}

	@Test
	public void setCSSTest()
	{
		fail("Incomplete");
	}

	@Test
	public void setScriptsTest()
	{
		fail("Incomplete");
	}

	@Test
	public void setIntraLinkTest()
	{
		fail("Incomplete");
	}

	@Test
	public void setInternalLinkTest()
	{
		fail("Incomplete");
	}

	@Test
	public void setExternalLinkTest()
	{
		fail("Incomplete");
	}

	@Test
	public void writeToFileTest()
	{
		fail("Incomplete");
	}
}
