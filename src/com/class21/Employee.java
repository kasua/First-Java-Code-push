package com.class21;

/*
 * Create a Class called Employee:
 * Create three  variables  eID , salary and set the CEO to “Sumair”
 * Create two objects of the class EmployeeSet the value of eID, salary 
 * for each of the objectsPrint out the eID , salary and  CEO for each of the objects
 *
 */

public class Employee {
	
	int eID;
	double salary;
	public static String CEO="Sumair";

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.eID=1;
		emp1.salary=100000;
		
		emp1.employeeInfo();
		
		Employee emp2=new Employee();
		emp2.eID=2;
		emp2.salary=150000;
		emp2.employeeInfo();
		}

	public void employeeInfo() {
		System.out.println("The CEO is "+CEO+" the employee ID is "+eID+" and  salary is "+salary);
	}
  }


