package com.class23;

public class TestTaskMethodOverLoading {

	public static void main(String[] args) {
		TaskMethodOverLoading obj =new TaskMethodOverLoading();
		obj.getArea(10, 20, 30);
		obj.getArea(10, 20);
		obj.getArea(10);
	}
}


