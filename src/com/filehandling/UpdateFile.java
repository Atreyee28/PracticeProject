package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
public class UpdateFile
{   
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public static List<String> readFileInList(String fileName) 
	  { 
		  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.getMessage(); 
	    } 
	    return lines; 
	  } 
    public static void main(String[] args)
    {
        modifyFile("C://Users//atrmonda//eclipse-workspace//PracticeProject//testFile0.txt", "girl", "95");
        List l = readFileInList("C://Users//atrmonda//eclipse-workspace//PracticeProject//testFile0.txt"); 
	    Iterator<String> itr = l.iterator(); 
	    
	    while (itr.hasNext()) 
	      System.out.println("The content of the file is:"+itr.next()); 	
    }
}

