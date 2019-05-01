package com.class22;

public class StudentTest {

	public static void main(String[] args) {
	
		Student student1=new Student("Amina", 90, 85, 47);
		student1.getAverage();

		Student student2=new Student("kasu", 87, 85, 55);
		student2.getAverage();
		
		Student student3=new Student("John", 90, 55, 40);
		student3.getAverage();
		
		Student student4=new Student("Tim", 80, 85, 50);
		student4.getAverage();
		
		Student student5=new Student("Joe", 95, 85, 45);
		student5.getAverage();
	}
}