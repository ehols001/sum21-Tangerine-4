package edu.odu.cs.cs350;

//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCLI {

	@Test
	public void testIsURLValid() {
		//fail("Not yet implemented");
				
		String testURL = "https://www.google.com";
		String fakeURL = "ww.google,com";
		assertTrue(CommandLineInterface.isURLValid(testURL));
		assertFalse(CommandLineInterface.isURLValid(fakeURL));
	}

	@Test
	public void testLocalPathAccess() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testUrlToLocalPath() {
		//fail("Not yet implemented");
		
		
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
