package com.pracproj;

public class InnerDemo2 {

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			InnerDemo2  ob=new InnerDemo2 ();  
			ob.display();  
			}
		}