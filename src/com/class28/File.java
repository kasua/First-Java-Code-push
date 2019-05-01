package com.class28;
/*
 * 
 * Create a class File that will have the following behaviors: open, edit, close. 
 * Edit and close are implemented method while open is an abstract. 
 * 
 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behavior: 
 * Example: to open .java file we need notepad++ or sublime text, 
 *          to open .doc file we need Microsoft word to be installed.
 */


 public abstract class File {
	
	 public void edit() {
		System.out.println("Lets edit this file");
	}

	public void close() {
		System.out.println("Lets close this file");
	}

	public abstract void open();
}

class JavaFile extends File {
	@Override
	public void open() {
		System.out.println("To open Java you need notepad");
	}
}

class WordFile extends File {
	@Override
	public void open() {
		System.out.println("To open WordFile you need Microsoft word");
	}
}

class PDFFile extends File {
	@Override
	public void open() {
		System.out.println("To open PDFFile you need photoshop");
	}


public class FileTest { 
	
  }
}

