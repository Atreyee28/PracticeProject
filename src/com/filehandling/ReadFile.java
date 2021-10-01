package com.filehandling;
	import java.util.*; 
	import java.nio.charset.StandardCharsets; 
	import java.nio.file.*; 
	import java.io.*; 
	public class ReadFile
	{ public static List<String> readFileInList(String fileName) 
	  { 
		  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 

	  public static void main(String[] args) 
	  { 	
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter Full file path:");
		  String a=sc.next();
		  List l = readFileInList(a); 
		  
		    Iterator<String> itr = l.iterator(); 
		    while (itr.hasNext()) 
		      System.out.println("The content is: " +itr.next()); 
	  } 
	}

