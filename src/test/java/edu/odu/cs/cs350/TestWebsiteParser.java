package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWebsiteParser {

	String path = "/home/example/www.test.org";
	String root = "https://www.test.org/";
	String url = "www.test.org/test/example/";
	WebsiteParser parser = new WebsiteParser();
	Website website = new Website(path, root);
	HTMLDocument htmldoc = new HTMLDocument(url);
	
	@Before
	public void setUp() {
		htmldoc.setLocalPath(url, root);
	}

	//I'm not sure how to test for extractions without a real htmldoc 
	@Test
	public void testGenerateHtml() {
		parser.generateHtml(htmldoc.getLocalPath(), htmldoc);
		//assertFalse(htmldoc.getLinks().isEmpty());
		//assertFalse(htmldoc.getMedia().isEmpty());
		//assertFalse(htmldoc.getScripts().isEmpty());
		//assertFalse(htmldoc.getStyleSheets().isEmpty());
		//assertFalse(htmldoc.getMisc().isEmpty());
	}

	//Going along with the comment for testGenerateHtml
	@Test
	public void testExtractLinks() {
		//fail("Not yet implemented");
	}

	@Test
	public void testExtractMedia() {
		//fail("Not yet implemented");
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