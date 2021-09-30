package com.pracproj;

public class InnerDemo1 {
		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  
		public static void main(String[] args) {

			InnerDemo1 obj=new InnerDemo1();
			InnerDemo1.Inner in=obj.new Inner();  
			in.hello();  
		}
}