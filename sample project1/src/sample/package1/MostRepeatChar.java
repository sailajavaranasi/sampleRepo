package sample.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MostRepeatChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Character> Mostrep = new ArrayList<>();
		System.out.println("Enter the String");
		Scanner sn1= new Scanner(System.in);
		String sn = sn1.next();

		for (int i=0;i<sn.length();i++)
			{
			if((sn.charAt(i) != ',') && (sn.charAt(i) != ' ') && (sn.charAt(i) != ';') && (sn.charAt(i) != '.') && (sn.charAt(i) != '/') && (sn.charAt(i) != '{') && (sn.charAt(i) != '}'))
				Mostrep.add(sn.charAt(i));
			}
		
		// trim capacity
		Mostrep.trimToSize();
		
			
		System.out.println(Mostrep);
		//number of times each character is repeated
		numtimesrepeated_char(Mostrep);
		//Calling Most repeated Character / characters
		mostrepeated_char(Mostrep);
		sn1.close();
	    

	}
	
	private static void numtimesrepeated_char(ArrayList<Character> mostrep) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
		//Collections.sort(this.arrayList)
		int count=0;
		char ch;
		//LinkedHashMap map1 = new LinkedHashMap();
		for(int i = 0; i < mostrep.size(); i++)
		{
			count = 1;    
			if(!map.containsKey(mostrep.get(i))) // Only iterates if the Map does not contain the Char value
			{
				
            //Count each char repetitions in the file and store it in variable count    
				for(int j = i+1; j < mostrep.size(); j++)
				{  
					if(mostrep.get(i).equals(mostrep.get(j)))
					{    
						count++; 
					}     
            
				} 
				ch = mostrep.get(i);
				
            	map.put(ch, count);
            	
			}
		}
		
		System.out.println("Number of times each character is repeated : " + map);
	    System.out.println("------------------------------------------------------");
	    
	    
	    
		
	}
	private static void mostrepeated_char(ArrayList<Character> ch) 
	{
		// TODO Auto-generated method stub
		int count=0 , maxCount=0;
        // create an ArrayList
		ArrayList<Character> mostrep = new ArrayList<Character>();
        System.out.println("Most Repeated Letter/s : " + ch);
		
		
		for(int i = 0; i < ch.size(); i++)
		{    
            count = 1;    
            i=0; // Set i = 0 bcoz the arraylist deletes already traverse character

            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < ch.size(); j++)
            {   
            	if(ch.get(0).equals(ch.get(j)))
                {    
                    count++; 
                }     
            
            }    
            //If maxCount is less than equal to count then store value of count in maxCount     
            
            if(count >= maxCount && count > 1)
            {    
               if(count > maxCount) 
               {
            	   mostrep.clear(); // if the previous occurrence of character count is less than the current occurrence character
               }
               mostrep.add(ch.get(i)); 
               maxCount = count;
            }
            if(ch.containsAll(mostrep))
            	ch.removeAll(mostrep);
            else
            	ch.remove(i); // removing already traversed character 
            
            
        }

        System.out.println("Most Repeated Letter/s : " + mostrep);
		    
	}

	}


	/*		Retreving Characters from Scanner to Char[] array
 			char letters[] = null;
 			String sn = sn1.nextLine();
			int Lettercount  = sn.length();
			letters = new char[Lettercount];
			sn.getChars(0, Lettercount, letters, 0);
	*/
//			Converts given string into character array  
//			char string[] = str.toCharArray();  