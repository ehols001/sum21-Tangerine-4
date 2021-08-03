package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

//import java.lang.reflect.AccessibleObject;


public class TestExcelWriter {
	Website web;

	HTMLDocument html1;
	HTMLDocument html2;

	FileResource image;
	FileResource image2;

	FileResource css;
	FileResource css2;

	FileResource scripts;
	FileResource scripts2;

	Anchor intraPage;
	Anchor intraPage2;

	Anchor internalLink;
	Anchor internalLink2;

	Anchor externalLink;
	Anchor externalLink2;

	ExcelWriter ew1;
	ExcelWriter ew2;

	@Before
	public void setup()
	{
		web = new Website();

		html1 = new HTMLDocument();
		html2 = new HTMLDocument();

		image = new FileResource(6, 20, "image", "local/path.png", "name" , "internal");
		image2 = new FileResource(2, 13, "image", "/local/secondpath.jpeg", "name", "internal");

		css = new FileResource(5, 11, "stylesheet", "/local/style.css", "name", "internal");
		css2 = new FileResource(7, 8, "stylesheet", "/local/style_2.css", "name", "internal");

		scripts = new FileResource(4, 8, "script", "/local/script.js", "name", "internal");
		scripts2 = new FileResource(6, 10, "script", "/local/script@2.js", "name", "internal");

		intraPage = new Anchor("#somelink", "intraPage");
		intraPage2 = new Anchor("#somelink23", "intraPage");

		internalLink = new Anchor("/odu/cs", "internalLink");
		internalLink2 = new Anchor("/odu/art", "internalLink");

		externalLink = new Anchor("www.google.com", "externalLink");
		externalLink2 = new Anchor("www.nsu.edu", "externalLink");

		html1.setLocalPath("www.cs.odu.edu/cs/cs350/", "https://www.cs.odu.edu");
		html1.setMedia(image);
		html1.setMedia(image2);

		html1.setStyleSheets(css);
		html1.setStyleSheets(css2);

		html1.setScripts(scripts);
		html1.setScripts(scripts2);

		html1.setLinks(intraPage);
		html1.setLinks(intraPage2);

		html1.setLinks(internalLink);
		html1.setLinks(internalLink2);

		html1.setLinks(externalLink);
		html1.setLinks(externalLink2);


		web.addWebpage(html1);

		ew1 = new ExcelWriter();
		ew2 = new ExcelWriter(web);


	}

	@Test
	public void defaultConstructorTest()
	{
		assertEquals(0, ew1.getPages().size());
		assertEquals(0, ew1.getImages().size());
		assertEquals(0, ew1.getCSS().size());
		assertEquals(0, ew1.getScripts().size());
		assertEquals(0, ew1.getIntraPage().size());
		assertEquals(0, ew1.getInternalLinks().size());
		assertEquals(0, ew1.getExternalLinks().size());

	}
	
	@Test
	public void parameterizedConstructorTest() {
		assertEquals(html1.getLocalPath(), ew2.getPages().get(0));

		assertEquals(image.getPages(), ew2.getImages().get(0).intValue());
		assertEquals(image2.getPages(), ew2.getImages().get(1).intValue());

		assertEquals(css.getPages(), ew2.getCSS().get(0).intValue());
		assertEquals(css2.getPages(), ew2.getCSS().get(1).intValue());

		assertEquals(scripts.getPages(), ew2.getScripts().get(0).intValue());
		assertEquals(scripts2.getPages(), ew2.getScripts().get(1).intValue());

		assertEquals(intraPage.getURL(), ew2.getIntraPage().get(0));
		assertEquals(intraPage2.getURL(), ew2.getIntraPage().get(1));

		assertEquals(internalLink.getURL(), ew2.getInternalLinks().get(0));
		assertEquals(internalLink2.getURL(), ew2.getInternalLinks().get(1));

		assertEquals(externalLink.getURL(), ew2.getExternalLinks().get(0));
		assertEquals(externalLink2.getURL(), ew2.getExternalLinks().get(1));


		// assertEquals(image2.getPages(), ew2.getImages().get(0).intValue());

	}

	@Test
	public void setPagesTest()
	{
		ew1.setPages(web);
		assertEquals(html1.getLocalPath(), ew1.getPages().get(0));
	}
//
	@Test
	public void setImagesTest()
	{
		ew1.setImages(web);

		assertEquals(image.getPages(), ew2.getImages().get(0).intValue());
		assertEquals(image2.getPages(), ew2.getImages().get(1).intValue());
	}
//
	@Test
	public void setCSSTest()
	{
		ew1.setImages(web);
		assertEquals(css.getPages(), ew2.getCSS().get(0).intValue());
		assertEquals(css2.getPages(), ew2.getCSS().get(1).intValue());
	}
//
	@Test
	public void setScriptsTest()
	{
		ew1.setScripts(web);
		assertEquals(scripts.getPages(), ew2.getScripts().get(0).intValue());
		assertEquals(scripts2.getPages(), ew2.getScripts().get(1).intValue());
	}
//
	@Test
	public void setIntraLinkTest()
	{
		ew1.setIntraPage(web);
		assertEquals(intraPage.getURL(), ew2.getIntraPage().get(0));
		assertEquals(intraPage2.getURL(), ew2.getIntraPage().get(1));
	}

	@Test
	public void setInternalLinkTest()
	{
		ew1.setInternalLinks(web);
		assertEquals(internalLink.getURL(), ew2.getInternalLinks().get(0));
		assertEquals(internalLink2.getURL(), ew2.getInternalLinks().get(1));
	}

	@Test
	public void setExternalLinkTest()
	{
		ew1.setExternalLinks(web);
		assertEquals(externalLink.getURL(), ew2.getExternalLinks().get(0));
		assertEquals(externalLink2.getURL(), ew2.getExternalLinks().get(1));
	}

//	@Test
//	public void writeToFileTest()
//	{
//		fail("Incomplete");
//	}
}