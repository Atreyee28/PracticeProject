package com.pracproj;

import java.util.Scanner;

class Calculation
{
	float a;
	float b;
	float c;
	String s;
	public Calculation(float a, float b, String s) {
		super();
		this.a = a;
		this.b = b;
		this.s = s;
	}
	public void show()
	{
	switch(s)
	{
	case "+":
		  
        c = a + b;
        break;

    // case to subtract two numbers
    case "-":
        c= a-b;
        break;

    // case to multiply two numbers
    case "*":

        c=a*b;
        break;

    // case to divide two numbers
    case "/":
    	if(b==0)
    	{
    		break;
    	}
    	else
    		c=a/b;
       break;

    default:
        System.out.println("You entered a wrong input");
        break;
    }

    if (s.equals("/") && b==0)
    	System.out.println("Can't divide by zero");
    else
    System.out.println("The Final Result: " +a + " " + s + " " + b
                       + " = " + c);
}
}
public class ArithmaticCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.:");
		float a=sc.nextFloat();
		System.out.println("Enter 2nd no.:");
		float b=sc.nextFloat();
		System.out.println("Addition -> + , Substraction -> -, Multiplication -> *, Division -> /");
		System.out.println("\n Enter the Operation you want to perform from the above list:");
		String s = new String(sc.next());
		Calculation c=new Calculation(a,b,s);
		c.show();
		sc.close();
	}

}