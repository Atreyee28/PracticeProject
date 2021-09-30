package com.pracproj;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validation
{
		
	public void search(List<String> s, String a) {
		int f=0;
		for (String check:s)
		{
		Pattern p = Pattern.compile(a);
		Matcher c = p.matcher(check);
		if (c.find()== true)
			{
			f=1;
			break;
			}
		else 
			f=0;
		}
		if (f==1)
	      	System.out.println("Employee access granted!");
		else
			System.out.println("Not an Employee.Access Denied!");
	}
}
public class EmailIDValidation {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("atreyee@gmail.com");
		s.add("xyz@hotmail.com");
		s.add("ddd@yahoo.co.in");
		s.add("abcd@gmail.com");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email address:");
		String a= new String();
		a=sc.next();
		Validation v=new Validation();
		v.search(s, a);
		sc.close();
}
}