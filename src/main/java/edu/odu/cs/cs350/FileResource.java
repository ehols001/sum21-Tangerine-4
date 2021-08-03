package edu.odu.cs.cs350;

public class FileResource{
	private double fileSize;
	private int numPages;
	private String fileType;
	private String localPath;
	private String fileName;
	private String fileRelation;
  
	
	/**
	 * Construct a FileResource object with
	 * all attributes set to 0 / empty string
	 */
	public FileResource() {
		this.fileSize = 0;
		this.numPages = 0;
		this.fileType = "";
		this.localPath = "";
		this.fileName = "";
		this.fileRelation = "";
	}

	/**
	 * Construct a File resource object
	 * @param size size of file
	 * @param number number of pages file is on
	 * @param type type of file
	 */
	public FileResource(double size, int number, String type, String lfp, String name, String relation) {
		this.fileSize = size;
		this.numPages = number;
		this.fileType = type;
		this.localPath = lfp;
		this.fileName = name;
		this.fileRelation = relation;
	}
	
	public void setFileRelation(String relation) {
		this.fileRelation = relation;
	}
	
	public String getFileRelation() {
		return this.fileRelation;
	}
	
	public void setName(String name) {
		this.fileName = name;
	}
	
	public String getName() {
		return this.fileName;
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
	 * Set the local path of the file
	 * @param lfp new localPath value
	 */
	public void setLocalPath(String lfp) {
		this.localPath = lfp;
	}
	
	/**
	 * Retrieve the localPath
	 * @return local path to the file
	 */
	public String getLocalPath() {
		return this.localPath;
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


