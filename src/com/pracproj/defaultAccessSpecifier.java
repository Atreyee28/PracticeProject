package com.pracproj;

class deAccessSpecifier {
		  void display() 
		     { 
		         System.out.println("Inside defalut access specifier"); 
		     } 

	}
public class defaultAccessSpecifier
{
	public static void main(String args[])
	{
		System.out.println("Default Access Specifier!");
		deAccessSpecifier d= new deAccessSpecifier();
		d.display();
	}
}



