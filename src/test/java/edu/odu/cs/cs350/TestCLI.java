package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.rules.TemporaryFolder;
import org.junit.Rule;
import org.junit.Test;

public class TestCLI {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testIsURLValid() {		
		String testURL = "https://www.google.com";
		String fakeURL = "ww.google,com";
		assertTrue(CommandLineInterface.isURLValid(testURL));
		assertFalse(CommandLineInterface.isURLValid(fakeURL));
	}

	@Test
	public void testIsLocalPathValid() throws IOException {
		File tPath = folder.newFolder("exists");
		String fakePath = "/home/directory/does/not/exist/";
		String testPath = tPath.toString();
		assertTrue(CommandLineInterface.isLocalPathValid(testPath));
		assertFalse(CommandLineInterface.isLocalPathValid(fakePath));
	}
}
