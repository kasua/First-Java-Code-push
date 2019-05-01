package com.class31;

public class StudentArraylUserDefind {

	public String name;
	public int studentId;
	
	public StudentArraylUserDefind(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void printStudentDetails() {
		System.out.println(name+" "+studentId);
	}
}