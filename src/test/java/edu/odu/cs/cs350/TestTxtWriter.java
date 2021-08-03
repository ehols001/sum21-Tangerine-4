package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestTxtWriter 
{
//	Website website;
//	Website website2;
//	HTMLDocument htmldoc;
//	HTMLDocument htmldoc2;
//	FileResource image;
//	FileResource image2;
	TxtWriter writer;
//	TxtWriter writer2;
	
	String path = "/home/slowmobro/git/sum21-Tangerine-4/src/test/java/edu/odu/cs/cs350/Resources/TestWebsite/www.cs.odu.edu/_tkennedy/cs350/latest/";
	String root = "https://www.cs.odu.edu/~tkennedy/cs350/latest/";
	String url = "https://www.cs.odu.edu/~tkennedy/cs350/latest/Directory/outline/index.html";
	WebsiteParser parser = new WebsiteParser();
	Website website = new Website(path, root);
	HTMLDocument htmldoc = new HTMLDocument(url);
	
//	@Before 
//	public void setup() 
//	{
//		website = new Website();
//		website2 = new Website();
//		htmldoc = new HTMLDocument();
//		htmldoc2 = new HTMLDocument();
//		image = new FileResource(10, 10, "image", "/local/image.jpeg", "name", "internal");
//		image2 = new FileResource(20, 10, "image", "/test/image.png", "name", "internal");
//		
//		htmldoc.setLocalPath("www.test.com/example/enter/night/", "https://www.test.com/example");
//		htmldoc2.setLocalPath("www.test.com/example/exit/light/", "https://www.test.com/example");
//		htmldoc.setMedia(image);
//		htmldoc2.setMedia(image2);
//		website.addWebpage(htmldoc);
//		website2.addWebpage(htmldoc2);
//		
//		writer = new TxtWriter();
//		writer2 = new TxtWriter(website2);
//		
//		
//	}
	
	@Before
	public void setUp() {
		url = UrlHandler.stripProtocol(url);
		htmldoc.setLocalPath(url, root);
		writer = new TxtWriter(website);
	}
	
//	@Test
//	public void defaultConstructorTest() 
//	{
//		assertEquals(0, writer.getPages().size());
//		assertEquals(0, writer.getSizes().size());
//	}
//	
//	@Test
//	public void parameterizedConstructorTest() 
//	{	
//		assertEquals(20, writer2.getSizes().get(0), 0.01);
//		assertEquals("/exit/light/", writer2.getPages().get(0));
//	}
//	
//	@Test
//	public void setSizesTest() 
//	{
//		writer.setSizes(website2);
//		
//		assertEquals(20, writer.getSizes().get(0), 0.01);
//		assertEquals(0, writer.getPages().size());
//	}
//	
//	@Test
//	public void setPagesTest() 
//	{
//		writer.setPages(website2);
//		
//		assertEquals("/exit/light/", writer.getPages().get(0));
//		assertEquals(0, writer.getSizes().size());
//	}
	
	
	@Test
	public void writeToFileTest()
	{
		parser.generateHtml(htmldoc.getLocalPath(), htmldoc);
		website.addWebpage(htmldoc);
		writer.writeToFile(website);
		
	}
}
