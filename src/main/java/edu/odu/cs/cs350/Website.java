package edu.odu.cs.cs350;

import java.util.*;

public class Website {

	private ArrayList<HTMLDocument> webpages;

	/**
	 * Default constructor for initializing a new Website
	 */
	public Website()
	{
		webpages = new ArrayList<HTMLDocument>();
	}
	
	/**
	 * Add a webpage to a container of webpages
	 */
	public void addWebpage(HTMLDocument hd)
	{
		webpages.add(hd);
	}
	
	/**
	 * Search for a webpage within the webpages container
	 * 
	 * @param hd URL of the webpage
	 * @return true if webpage exists
	 */
	public boolean contains(HTMLDocument hd)
	{
		if(webpages.contains(hd) == true)
			return true;
		else
			return false;
	}
	
	/**
	 * Retrieves the size of the Website container for webpages
	 * 
	 * @return integer size of webpages
	 */
	public int size()
	{
		return webpages.size();
	}
	
	/**
	 * Retrieves the HTMLDocument at the given index
	 * 
	 * @param index Index of the desired HTMLDocument
	 * @return HTMLDocument at the given index
	 */
	public HTMLDocument getWebpage(int index)
	{
		return webpages.get(index);
	}
	
//	public void countPages() {
//		int count = 0;
//			for (int i = 0; i < size(); i++){
//				double checkSize = getWebpage(i).getMedia().get(i).getSize();
//				String fileName = getWebpage(i).getMedia().get(i).getName();
//				for (int j = i + 1; j < size(); j++) {
//					double currentSize = getWebpage(j).getMedia().get(j).getSize();
//					String currentName = getWebpage(j).getMedia().get(j).getName();
//					if (j != i && checkSize == currentSize && fileName == currentName){
//						count++;
//						getWebpage(i).getMedia().get(i).setPages(count);
//					}
//				}
//				
//			}
//	}

}
