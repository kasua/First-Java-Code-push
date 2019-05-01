package com.class28;

public class FileTest {
	
	public static void main(String[] args) {
		
		File obj = new JavaFile();
		obj.open();
		obj.edit();
		obj.close();
		
	System.out.println("------------------------------------");
		File obj1 = new WordFile();
		obj1.open();
		obj1.edit();
		obj1.close();
	
	System.out.println("------------------------------------");
		File obj2 = new PDFFile();
		obj2.open();
		obj2.edit();
		obj2.close();
	}
}
