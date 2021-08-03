package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.rules.TemporaryFolder;
import org.junit.Rule;
import org.junit.Test;

public class TestUrlHandler {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testIsURLValid() {		
		String testURL = "https://www.google.com";
		String fakeURL = "ww.google,com";
		assertTrue(UrlHandler.isURLValid(testURL));
		assertFalse(UrlHandler.isURLValid(fakeURL));
	}

	@Test
	public void testIsLocalPathValid() throws IOException {
		File tPath = folder.newFolder("exists");
		String fakePath = "/home/directory/does/not/exist/";
		String testPath = tPath.toString();
		assertTrue(UrlHandler.isLocalPathValid(testPath));
		assertFalse(UrlHandler.isLocalPathValid(fakePath));
	}
	
	@Test
	public void testStripProtocol() {
		String testUrl = "https://www.test.com";
		assertEquals(UrlHandler.stripProtocol(testUrl), "www.test.com");
	}
	
	@Test
	public void testUrlToLocal() {
		String testUrl = "www.test.com/directory/root/test/directory/test.html";
		String localUrl = "www.test.com/directory/root/";
		String localRootPath = "test/directory/test.html";
		assertEquals(UrlHandler.urlToLocal(testUrl, localUrl), localRootPath);
	}
}