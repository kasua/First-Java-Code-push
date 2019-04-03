package com.class14;

public class StringSplit {

	public static void main(String[] args) {

		String str = " Wellcome Syntax students Bach 4 ";
		String[] array = str.split("s");
		String[] array0 = str.split("Syntax");
		
		String[] array1 = str.split(" "); //print how many words are there
		
		System.out.println(array.length);
		for (String substring : array) {
			
			System.out.println(substring);
			System.out.println("The length os array is"+array.length);
			
		}
		
		System.out.println(("-----------------------"));
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	
	 // \\("\\") //[!?]
	}
}
