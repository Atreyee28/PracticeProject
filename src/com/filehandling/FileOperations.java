package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileOperations {

		public static void main(String[] args) throws IOException
	    {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter File path:");
	        String filepath=sc.next();
	        createFileUsingFileClass(filepath);
	        List l = readFileInList(filepath); 
		    Iterator<String> itr = l.iterator(); 
		    while (itr.hasNext()) 
		      System.out.println("The content of the file is:"+itr.next()); 		    
	    }
		
	 
	   private static void createFileUsingFileClass(String filepath) throws IOException
	    {
	          File file = new File(filepath);
	  
	          //Create the file
	          if (file.createNewFile()){
	            System.out.println("File is created!");
	            //Write Content
		          FileWriter writer = new FileWriter(file);
		          System.out.println("Wish to write file content?Type yes or no");
		          Scanner s=new Scanner(System.in);
		          String response=s.next();
		          if(response.equals("Yes")||response.equals("yes")||response.equals("YES"))
		          {
		          System.out.println("Enter File Content:");
		          Scanner sc=new Scanner(System.in);
		          writer.write(sc.nextLine());
		          writer.close();
		          }
		          else
		          {
		        	  System.exit(0);
		          }
	          	}
	          else{
	            System.out.println("File already exists.");
	            System.out.println("Want to append to the exsisting file? Type yes or no.:");
	            Scanner s=new Scanner(System.in);
		          String response=s.next();
	            if(response.equals("Yes")||response.equals("yes")||response.equals("YES"))
		          {
	            	System.out.println("Enter the content you wish to append");
	            	Scanner s2=new Scanner(System.in);
	            	String data=s2.nextLine();
	            	append(data,file);
		          }
	            else if(response.equals("No")||response.equals("no")||response.equals("NO"))
	            {
	            	System.out.println("Want to read the content of the file? Type yes or no.");
	            	Scanner s1=new Scanner(System.in);
	            	response=s1.next();
	            	if(response.equals("Yes")||response.equals("YES")||response.equals("yes")) {}
	            	else if (response.equals("No")||response.equals("NO")||response.equals("no"))
	            	{
	            		System.exit(0);
	            	}
	            	else
	            	{
	            		System.err.println("Invalid Input");
	            		System.exit(0);
	            	}
	            }
	            else
	            {
	            	System.err.println("Invalid Input");
	            	System.exit(0);
	            }
	             } 
	       
	    } 
		public static List<String> readFileInList(String fileName) 
		  { 
			  
		    List<String> lines = Collections.emptyList(); 
		    try
		    { 
		      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
		    } 
		  
		    catch (IOException e) 
		    { 
		      e.printStackTrace(); 
		    } 
		    return lines; 
		  } 
		public static void append(String data, File filepath)
		{
			try {
		         FileWriter fileWritter = new FileWriter(filepath.getName(),true);
		         BufferedWriter bw = new BufferedWriter(fileWritter);
		         bw.write(data);
		         bw.close();
		      } catch(IOException e){
		         e.printStackTrace();
		      }
		}
	}