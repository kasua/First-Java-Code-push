package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentArraylUserDefind student1=new StudentArraylUserDefind("John", 101);
		//student1.printStudentDetails();
		//System.out.println(student1.name);
		StudentArraylUserDefind student2=new StudentArraylUserDefind("James", 102);
		StudentArraylUserDefind student3=new StudentArraylUserDefind("Anna", 103);
		StudentArraylUserDefind student4=new StudentArraylUserDefind("Katy", 104);
		
		ArrayList<StudentArraylUserDefind> alist=new ArrayList<>();
		alist.add(student1);
		alist.add(student2);
		alist.add(student3);
		alist.add(student4);
		
		for(StudentArraylUserDefind student: alist) {
			//student.printStudentDetails();
			System.out.println(student.name);
		}
		
		Iterator<StudentArraylUserDefind> it=alist.iterator();
		while(it.hasNext()) {
			StudentArraylUserDefind obj=it.next();
			obj.printStudentDetails();
		}

	}
}