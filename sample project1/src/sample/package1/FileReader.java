package sample.package1;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws Exception {

        int count = 0, maxCount = 0;    
        String line, word = "";    
		ArrayList<String> words = new ArrayList<String>(); 
		// TODO Auto-generated method stub
		File fs = new  File("C:\\Users\\HP\\eclipse-workspace\\sample project1\\src\\sample\\package1\\sample.txt");
		
		  FileInputStream fis = new FileInputStream(fs);
		
	      byte[] bytesArray = new byte[(int)fs.length()];
	      fis.read(bytesArray);
	      String s = new String(bytesArray);
	      
	      System.out.println("Reading th file As IS");
	      System.out.println("----------------------");
	      System.out.println(s.toString());
	      System.out.println("----------------------");
	      for (String val1: s.toLowerCase().split(" "))
	           // printing the final value.
	           // System.out.println(val);
	            words.add(val1);
	      
	      fis.close();
	      
	      int m = 0;
	      for(m = 0; m < words.size(); m++){
	    	  System.out.println(m + "  "+ words.get(m));
	      }
	      System.out.println("M===" + m);
	        //Determine the most repeated word in a file    
	        for(int i = 0; i <= words.size()+1; i++){    
	            count = 1;    
	            //Count each word in the file and store it in variable count    
	            for(int j = i+1; j < words.size(); j++){    
	                if(words.get(i).equals(words.get(j))){    
	                    count++;    
	                }     
	            }    
	            //If maxCount is less than count then store value of count in maxCount     
	            //and corresponding word to variable word    
	            if(count > maxCount){    
	                maxCount = count;    
	                word = words.get(i);    
	            }    
	        }    
	            
	        System.out.println("Most repeated word: " + word);    
	      
	}

}
