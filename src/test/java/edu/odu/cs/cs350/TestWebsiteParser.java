package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWebsiteParser {

	String path = "/home/slowmobro/git/sum21-Tangerine-4/src/test/java/edu/odu/cs/cs350/Resources/TestWebsite/www.cs.odu.edu/_tkennedy/cs350/latest/";
	String root = "https://www.cs.odu.edu/~tkennedy/cs350/latest/";
	String url = "https://www.cs.odu.edu/~tkennedy/cs350/latest/Directory/outline/index.html";
	WebsiteParser parser = new WebsiteParser();
	Website website = new Website(path, root);
	HTMLDocument htmldoc = new HTMLDocument(url);
	
	@Before
	public void setUp() {
		url = UrlHandler.stripProtocol(url);
		htmldoc.setLocalPath(url, root);
	}

	@Test
	public void testGenerateHtml() {
		parser.generateHtml(htmldoc.getLocalPath(), htmldoc);
		//assertFalse(htmldoc.getLinks().isEmpty());
		//assertFalse(htmldoc.getMedia().isEmpty());
		//assertFalse(htmldoc.getScripts().isEmpty());
		//assertFalse(htmldoc.getStyleSheets().isEmpty());
		//assertFalse(htmldoc.getMisc().isEmpty());
	}

		@Test
	public void testExtractLinks() {
		//fail("Not yet implemented");
		parser.generateHtml(htmldoc.getLocalPath(), htmldoc);
		
	}

	@Test
	public void testExtractMedia() {
		//fail("Not yet implemented");
		parser.generateHtml(htmldoc.getLocalPath(), htmldoc);
		assertEquals(htmldoc.getMedia().get(0).getSize(), 320, 0.001);
		assertEquals(htmldoc.getMedia().get(0).getType(), "image/png");
	}

	@Test
	public void testExtractScripts() {
		//fail("Not yet implemented");
	}

	@Test
	public void testExtractStyleSheets() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testExtractMisc() {
		//fail("Not yet implemented");
	}

}