package com.class22;

class ConstructorChainExaEmployee {

	public String empName;
	public int empSalary;
	public String address;

	// default constructor of the class
	public ConstructorChainExaEmployee() {
		// this will call the constructor with String param
		this("kasu");

	}

	public ConstructorChainExaEmployee(String name) {

		// call the constructor with (String, int) parameter
		this(name, 100000);
	}

	public ConstructorChainExaEmployee(String name, int sal) {

		// call the constructor with (String, int, String) parameter
		this(name, sal, "Chantilly St");

	}

	public ConstructorChainExaEmployee(String name, int sal, String addr) {
		this.empName = name;
		this.empSalary = sal;
		this.address = addr;

	}

	void display() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Address: " + address);
	}

	public static void main(String[] args) {
		ConstructorChainExaEmployee obj = new ConstructorChainExaEmployee();
		obj.display();
	}
}