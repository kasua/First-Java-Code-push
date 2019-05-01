package com.class06;

import java.util.Scanner;

public class Task1Switch {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner scan;
        String country;
        String language;
        
        scan=new Scanner(System.in);
        System.out.println("Please enter which country you are from");
        country=scan.nextLine(); 
        
    switch (country) {
        
        case "USA":
            language="English";
            break;
        case "Ethiopia":
        	language="Amharic";
            break;
        case "Russia":
            language=" Russiazn";
            break;
        case "Italy":
            language="Italy";
            break;
        case "Turkey":
            language="Turkish";
            break;
        case "Morocco":
            language="Arebic";
            break;
        case "Grece":
        	language="Greek";
            break;
        
        default:
            language="Unknown";
        }
        System.out.println("Your language is "+language);
    }

 }


