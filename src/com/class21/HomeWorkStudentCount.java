package com.class21;
/*
 *  Create a Class called Students
 *  Create three  variables  studentName , studentID  and  numberOfStudents
 *  Create three objects of the Students ClassSet the value for  studentName , studentID and 
 *  increment  the numberOfStudents for each object
 *  Print out  total number of students.
 */

public class HomeWorkStudentCount {
	
	int studentID; 
    String studentName; 
   public static int numberOfStudents;  
	   
	   //method to display the values  
	   void display (){
		  // System.out.println(studentID+" "+studentName+" "+numberOfStudents);
		   System.out.println("Total number of students is " +numberOfStudents);
		  }  
	  
	// class to show the values of objects  
		public static void main(String args[]){  
	    HomeWorkStudentCount s1 = new HomeWorkStudentCount(); 
	    s1.studentID= 101;
	    s1.studentName= "John";
	    s1.numberOfStudents++;
	    
	    HomeWorkStudentCount s2 = new HomeWorkStudentCount();
	    s2.studentID= 102;
	    s2.studentName= "Tim";
	    numberOfStudents++;
	    
	    HomeWorkStudentCount s3 = new HomeWorkStudentCount();
	    s3.studentID= 103;
	    s3.studentName= "sara";
	    numberOfStudents++;
	    
	 s1.display();  
	 s2.display();  
	 s3.display();
    }  
 }


