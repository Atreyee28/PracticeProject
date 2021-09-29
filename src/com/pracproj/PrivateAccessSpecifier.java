package com.pracproj;

	class priaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("Inside private access specifier"); 
	    } 
	} 

	public class PrivateAccessSpecifier {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
	        //trying to access private method of another class 
	        //obj.display();

		}
	}
