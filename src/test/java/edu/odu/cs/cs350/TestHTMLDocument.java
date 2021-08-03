package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class TestHTMLDocument {

	private HTMLDocument html1;
	private Anchor testLink;
	private FileResource testImage;
	private FileResource testVideo;
	private FileResource testJavaScript;
	private FileResource testCSS;
	private FileResource testMisc;
	
	@Before
	public void setup() {
		html1 = new HTMLDocument();
		testLink = new Anchor("www.test.org/test/", "external");
		testImage = new FileResource(3.0, 1024, "image", "/local/testImage.png", "name", "internal");
		testVideo = new FileResource(900.0, 4000, "video", "/local/testVideo.mp4", "name", "internal");
		testJavaScript = new FileResource(1.0, 2056, "script", "/local/testJS.js", "name", "internal");
		testCSS = new FileResource(1.0, 4096, "stylesheet", "/local/testCSS.css", "name", "internal");
		testMisc = new FileResource(2.0, 40, "misc", "/local/testMisc.zip", "name", "internal");
	}
	
	@Test
	public void testDefaultConstructor() {
		HTMLDocument doc = new HTMLDocument();
		assertEquals(doc.getMisc().size(), 0);
		assertEquals(doc.getStyleSheets().size(), 0);
		assertEquals(doc.getScripts().size(), 0);
		assertEquals(doc.getMedia().size(), 0);
		assertEquals(doc.getLinks().size(), 0);
		assertEquals(doc.getLocalPath(), "");
	}

	@Test
	public void testParameterizedConstructor() {
		HTMLDocument doc = new HTMLDocument(testLink.getURL());
		doc.setLocalPath(testLink.getURL(), "http://www.test.org");
		assertEquals(doc.getMisc().size(), 0);
		assertEquals(doc.getStyleSheets().size(), 0);
		assertEquals(doc.getScripts().size(), 0);
		assertEquals(doc.getMedia().size(), 0);
		assertEquals(doc.getLinks().size(), 0);
		assertEquals(doc.getLocalPath(), "/test/");
	}

	@Test
	public void testSetLinks() {
		html1.setLinks(testLink);
		assertEquals(html1.getLinks().size(), 1);
		assertEquals(html1.getLinks().get(0), testLink);
		
	}

	@Test
	public void testSetMedia() {
		html1.setMedia(testImage);
		assertEquals(html1.getMedia().size(), 1);
		assertEquals(html1.getMedia().get(0), testImage);
		
		html1.setMedia(testVideo);
		assertEquals(html1.getMedia().size(), 2);
		assertEquals(html1.getMedia().get(1), testVideo);

	}

	@Test
	public void testSetScripts() {
		html1.setScripts(testJavaScript);
		assertEquals(html1.getScripts().size(), 1);
		assertEquals(html1.getScripts().get(0), testJavaScript);

	}

	@Test
	public void testSetStyleSheets() {
		html1.setStyleSheets(testCSS);
		assertEquals(html1.getStyleSheets().size(), 1);
		assertEquals(html1.getStyleSheets().get(0), testCSS);

	}

	@Test
	public void testSetMisc() {
		html1.setMisc(testMisc);
		assertEquals(html1.getMisc().size(), 1);
		assertEquals(html1.getMisc().get(0), testMisc);

	}

	@Test
	public void testSetLocalPath() {
		html1.setLocalPath("www.test.com/example/test/val/", "https://www.test.com/example");
		assertEquals(html1.getLocalPath(), "/test/val/");
	}

}
