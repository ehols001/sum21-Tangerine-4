package edu.odu.cs.cs350;

//import static org.junit.Assert.*;
//import org.junit.Test;
//import org.junit.Before;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

public class TestHTMLDocument {

	/*private HTMLDocument html1;
	private Anchor testLink;
	private Element testImage;
	private Element testVideo;
	private Element testJavaScript;
	private Element testCSS;
	private Element testMisc;
	
	//private String lfp;
	
	@Before
	public void setup() {
		html1 = new HTMLDocument();
		testLink = new Anchor("www.test.org", "external");
		testImage = new Element(3, 1024, "image");
		testVideo = new Element(900, 4000, "video");
		testJavaScript = new Element(1, 2056, "script");
		testCSS = new Element(1, 4096, "stylesheet");
		testMisc = new Element(2, 40, "misc");
		
	}
	
	@Test
	public void testDefaultConstructor() {
		//fail("Not yet implemented");
		HTMLDocument doc = new HTMLDocument();
		
		assertEquals(doc.getMisc().size(), 0);
		assertEquals(doc.getStyleSheets().size(), 0);
		assertEquals(doc.getScripts().size(), 0);
		assertEquals(doc.getMedia().size(), 0);
		assertEquals(doc.getLinks().size(), 0);
		assertEquals(doc.getLocalPath(), "");
	}


	@Test
	public void testSetLinks() {
		//fail("Not yet implemented");
		html1.setLink(testLink);
		
		assertEquals(html1.getLinks().size(), 1);
		assertEquals(html1.getLinks().get(0), testLink);
		
	}

	@Test
	public void testSetMedia() {
		//fail("Not yet implemented");
		html1.setMedia(testImage);
		
		assertEquals(html1.getMedia().size(), 1);
		assertEquals(html1.getMedia().get(0), testImage);
		
		html1.setMedia(testVideo);
		
		assertEquals(html1.getMedia().size(), 2);
		assertEquals(html1.getMedia().get(1), testVideo);

	}

	@Test
	public void testSetScripts() {
		//fail("Not yet implemented");
		html1.setScript(testJavaScript);
		
		assertEquals(html1.getScripts().size(), 1);
		assertEquals(html1.getScripts().get(0), testJavaScript);

	}

	@Test
	public void testSetStyleSheets() {
		//fail("Not yet implemented");
		html1.setStyleSheet(testCSS);
		
		assertEquals(html1.getStyleSheets().size(), 1);
		assertEquals(html1.getStyleSheets().get(0), testCSS);

	}

	@Test
	public void testSetMisc() {
		//fail("Not yet implemented");
		html1.setMisc(testMisc);
		
		assertEquals(html1.getMisc().size(), 1);
		assertEquals(html1.getMisc().get(0), testMisc);

	}

	@Test
	public void testSetLocalPath() {
//		fail("Not yet implemented");
		html1.setLocalPath("test/val");
		assertEquals(html1.getLocalPath(), "test/val");
	}
*/
}
