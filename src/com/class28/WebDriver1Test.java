package com.class28;

import com.class29.ChromeDriver;
import com.class29.FirefoxDriver;

public class WebDriver1Test {
	
	public static void main(String[] args) {
		
		ChromeDriver1 test=new ChromeDriver1();
		test.openBrowser();
		test.closeBrowser();
		test.findElement();
		test.maximizeWindow();
		
		System.out.println("-------------------------------------------------------");
		
		FirefoxDriver1 test1=new FirefoxDriver1();
		test1.openBrowser();
		test1.closeBrowser();
		test1.findElement();
		test1.maximizeWindow();   
		}
	}


