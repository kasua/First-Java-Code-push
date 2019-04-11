package com.class20;

public class MethodForEmail {	
	/*
	 * Create a method called createEmail() Based on provided users name, lastName and email type. 
	 *  your method should return complete email Address; *Example like-
	 * johnsnow@gmail.com  
	 * johnsnow@yahoo.com
	 */
	   
	    String createEmail(String name, String lastName, String emailType) {       
		String email = name + lastName + "@" + emailType + ".com";       
		return email.toLowerCase();    
		}
	
	
	public static void main(String[] args) {
		 MethodForEmail obj = new MethodForEmail();       
		 String email = obj.createEmail("John", "Snow", "gmail");        
		 System.out.println(email);       
		 email = obj.createEmail("Bob", "Snow", "outlook");       
		 System.out.println(email);   
		 }    
	// return type methodName    
	
 }
 



