package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWebsiteParser {

	private Website website;
	private HTMLDocument html1;
	private Anchor testLink;
	private FileResource testImage;
	private FileResource testVideo;
	private FileResource testJavaScript;
	private FileResource testCSS;
	private FileResource testMisc;
	
	private HTMLDocument html2;
	private FileResource testMiscDuplicate;
	
	private String lfp;
	
	
	@Before
	public void setup() {
		website = new Website();
		html1 = new HTMLDocument();
		testLink = new Anchor("www.test.org", "external");
		testImage = new FileResource(3, 1024, "image", "/local/testImage.png", "name");
		testVideo = new FileResource(900, 4000, "video", "/local/testVideo.mp4", "name");
		testJavaScript = new FileResource(1, 2056, "script", "/local/testJS.js", "name");
		testCSS = new FileResource(1, 4096, "stylesheet", "/local/testCSS.css", "name");
		testMisc = new FileResource(2, 40, "misc", "/local/testMisc.zip", "name");
		
//		html2 = new HTMLDocument()
//		testMiscDuplicate = new FileResource(2, 40, "misc", "/local/testMisc.zip", "name");

		
		website.addWebpage(html1);
//		website.getWebpage(0).setMedia(testCSS);
//		website.getWebpage(0).setMedia(testImage);
//		website.getWebpage(0).setMedia(testVideo);
//		website.getWebpage(0).setMedia(testJavaScript);
//		website.getWebpage(0).setMedia(testMisc);
		
//		website.addWebpage(html2);
//		website.getWebpage(1).setMedia(testMiscDuplicate);
		WebsiteParser parser = new WebsiteParser();
		parser.setHTML(html1);
		
//		parser.generateHtml("/home/slowmobro/git/sum21-Tangerine-4/src/test/java/edu/odu/cs/cs350/testHTML.html");
		
	}

	@Test
	public void testLinkExtract() {
		//fail("Not yet implemented");
		WebsiteParser parser = new WebsiteParser();
//		parser.generateHtml("/home/slowmobro/git/sum21-Tangerine-4/src/test/java/edu/odu/cs/cs350/testHTML.html");
//
//		assertEquals(parser.getHTML().getLinks().get(0).getURL(), "https://www.w3schools.com");
//		assertEquals(parser.getHTML().getLinks().get(1).getURL(), "http://www.test_with@symbols.com");
//		assertEquals(parser.getHTML().getLinks().get(2).getURL(), "https://www.test.com");
		
		
	}

	@Test
	public void testMediaExtract() {
		//fail("Not yet implemented");
		WebsiteParser parser = new WebsiteParser();
		
		parser.generateHtml("src/test/java/edu/odu/cs/cs350/Resources/TestWebsite/www.cs.odu.edu/_tkennedy/cs350/latest/index.html");
		
		assertEquals(parser.getHTML().getMedia().get(0).getLocalPath(), "./index_files/text-kind.png");
		//assertEquals(parser.getHTML().getMedia().get(0).getSize(), 1554371, 0.001);
		//size in bytes 1,554,371 
	}

	@Test
	public void testScriptExtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testStyleExtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMiscExtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testPathExtract() {
		fail("Not yet implemented");
	}

}
