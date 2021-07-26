package edu.odu.cs.cs350;

public class FileResource{
	private double fileSize;
	private int numPages;
	private String fileType;
  
	
	/**
	 * Construct a FileResource object with
	 * all attributes set to 0 / empty string
	 */
	public FileResource() {
		this.fileSize = 0;
		this.numPages = 0;
		this.fileType = "";
	}

	/**
	 * Construct a File resource object
	 * @param size size of file
	 * @param number number of pages file is on
	 * @param type type of file
	 */
	public FileResource(int size, int number, String type) {
		this.fileSize = size;
		this.numPages = number;
		this.fileType = type;
	}
	
	/**
	 * Set the size of the file
	 * @param size new value
	 */
	public void setSize(int size) {
		this.fileSize = size;
	}
	
	/**
	 * Set the number of pages this file
	 * appears on
	 * @param number new value
	 */
	public void setPages(int number) {
		this.numPages = number;
	}
	
	/**
	 * Set the type of the file
	 * @param type new value
	 */
	public void setType(String type) {
		this.fileType = type;
	}
	
	/**
	 * Retrieve the file size
	 * @return size of the file
	 */
	public double getSize() {
		return this.fileSize;
	}
	
	/**
	 * Retrieve the number of pages this
	 * file occurs on
	 * @return number of pages
	 */
	public int getPages() {
		return this.numPages;
	}
	
	/**
	 * Retrieve the type of the file
	 * @return file type 
	 */
	public String getType() {
		return this.fileType;
	}
}


