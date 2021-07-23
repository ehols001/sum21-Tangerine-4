package edu.odu.cs.cs350;

public class Anchor {
	
	private String linkURL;
	private String linkType;
	
	public Anchor() {
		linkURL = new String("");
		linkType = new String("");
	}
	
	public String getURL() {
		return this.linkURL;
	}
	
	public String getType() {
		return this.linkType;
	}
	
	public void setURL(String url) {
		this.linkURL = url;
	}
	
	public void setType(String type) {
		this.linkType = type;
	}
	
  
}
