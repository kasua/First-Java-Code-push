package com.class23;

public class TestMethodOverLoadingAddition {

	public static void main(String[] args) {
		
		MethodOverLoadingAddition obj=new MethodOverLoadingAddition();
		obj.add(10.2, 12.2);
		obj.add(100);
		obj.add(100, 100.89);
		obj.add(99.9, 90);

	}
}