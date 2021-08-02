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
		assertEquals(testFile.getSize(), 0, 0.001);
		assertEquals(testFile.getType(), "");
		assertEquals(testFile.getLocalPath(), "");
	}
	
	@Test
	public void testNonDefaultConstructor() {
		//fail("Not yet implemented");
		FileResource test = new FileResource(1, 23, "CSS", "/local/test.css");
		
		assertEquals(test.getPages(), 23);
		assertEquals(test.getSize(), 1, 0.001);
		assertEquals(test.getType(), "CSS");
		assertEquals(test.getLocalPath(), "/local/test.css");
	}

	@Test
	public void testSetFileSize() {
		//fail("Not yet implemented");
		file.setSize(94);
		
		assertEquals(file.getSize(), 94, 0.001);

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
	
	@Test
	public void testSetLocalPath() {
		//fail("Not yet implemented")
		file.setLocalPath("/local/test.test");
		
		assertEquals(file.getLocalPath(), "/local/test.test");
	}
}
