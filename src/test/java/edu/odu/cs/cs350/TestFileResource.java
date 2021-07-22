/**
 * 
 */
package edu.odu.cs.cs350;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestFileResource {

	private FileResource file;

	@Before
	public void setUp() {
		file = new FileResource();
	}

	@Test
	public void testDefaultConstructor() {
		//fail("Not yet implemented");
		FileResource testFile = new FileResource();
		
		assertEquals(testFile.getPages(), 0);
		assertEquals(testFile.getSize(), 0);
		assertEquals(testFile.getType(), "");
	}
	
	@Test
	public void testNonDefaultConstructor() {
		//fail("Not yet implemented");
		FileResource test = new FileResource(1, 23, "CSS");
		
		assertEquals(test.getPages(), 23);
		assertEquals(test.getSize(), 1);
		assertEquals(test.getType(), "CSS");
	}

	@Test
	public void testSetFileSize() {
		//fail("Not yet implemented");
		file.setSize(94);
		
		assertEquals(file.getSize(), 94);

	}
	
	@Test
	public void testSetNumPages() {
		//fail("Not yet implemented");
		file.setPages(200);
		
		assertEquals(file.getPages(), 200);

	}
	
	@Test
	public void testSetFileType() {
		//fail("Not yet implemented");
		file.setType("JS");
		
		assertEquals(file.getType(), "JS");

	}
}
