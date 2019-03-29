package com.class6;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		boolean thirsty,sleepy;
	    String drink="";
	     
	      Scanner scan= new Scanner (System.in);
	      System.out.println("Are you thirsty?");
	      thirsty= scan.nextBoolean();
	     
	    System.out.println("Are you sleepy?");
	    sleepy=scan.nextBoolean();
	     
	    if(thirsty && !sleepy ){
	       drink="Water";
	       
	      }else if(thirsty && sleepy){
	       drink="Coffee";
	       
	      }else if(! thirsty && sleepy){
	        drink="Tea";
	      }else{
	       drink="Nothing";
	      }
	      System.out.print("You Looks like you need "+drink);
	     
	    }

	
	}


