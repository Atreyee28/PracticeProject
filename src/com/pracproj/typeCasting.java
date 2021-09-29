package com.pracproj;

public class typeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting:");
		char a='A';
		System.out.println("The value of a is:" +a);
		int b=a;
		System.out.println("The value of b is:"+b);
		float c=b;
		System.out.println("The value of c is:"+c);
		double d=c;
		System.out.println("The value of d is:"+d);
		System.out.println("\nExplicit Type Casting:");
		double x= 20.12;
		int y=(int) x;
		System.out.println("The value of x is:"+x+"\nThe value of y is:"+y);	
	}
}
