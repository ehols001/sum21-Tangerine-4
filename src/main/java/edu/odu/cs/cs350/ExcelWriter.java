package edu.odu.cs.cs350;

import Website.java;
import HTMLDocument.java;
import java.util.*;

public class ExcelWriter {
  
  private Vector<String> pages = new Vector<String>();
	private Vector<String> images = new Vector<String>();
  private Vector<String> css = new Vector<String>();
  private Vector<String> scripts = new Vector<String>();
  private Vector<String> intraLinks = new Vector<String>();
  private Vector<String> internalLinks = new Vector<String>();
  private Vector<String> externalLinks = new Vector<String>();
  
  Workbook wb = new XSSFWorkbook();
  CreationHelper createHelper = wb.getCreationHelper();
  Sheet sheet1 = wb.createSheet("summary");
  
  

}
