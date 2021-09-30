package com.pracproj;

public class MethodOverloadingDemo {

	public float area(float a,float b)
	{
		return a*b;
	}
	public void area(float a)
	{
		System.out.println("Area of circle is:"+(3.14*a*a));
	}
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		System.out.println("The area of rectangle is:"+m.area(12,3));
		m.area(5);
	}
}
