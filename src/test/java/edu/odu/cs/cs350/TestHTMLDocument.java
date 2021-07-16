package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHTMLDocument {

	HTMLDocument html1;
	
	String lfp = new String("localFilePath");
	
	
	@BeforeEach
	void setup() {
		html1 = new HTMLDocument();
		File input = new File("src/test/java/edu/odu/cs/cs350/TestTxtWriter.java");
		Document page = Jsoup.parse(input, "UTF-8", "http://www.csszengarden.com/");
	
		html1.setwebPage(page);
	}
	
	@Test
	void testHTMLDocument() {
		fail("Not yet implemented");
	}

	@Test
	void testHTMLDocumentString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLinks() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMedia() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScripts() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStyleSheets() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMisc() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLocalPath() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLocalPath() {
		fail("Not yet implemented");
	}

}
