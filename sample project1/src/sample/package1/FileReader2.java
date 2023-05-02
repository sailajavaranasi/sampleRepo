package sample.package1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\sample project1\\src\\sample\\package1\\sample.txt");
		Scanner scan = new Scanner(fis);
		String word = null;
		ArrayList<String> words = new ArrayList<String>();
		int i=0;
		System.out.println("Reading th file As IS");
		System.out.println("----------------------");
		while(scan.hasNext())
		{
			word = scan.next();
			System.out.println(word.toString());
			words.add(word);
		}
		scan.close();
		System.out.println("Number of words in the File  "+ words.size());
		
		
		//find most repeated word
		int count=0,maxCount=0;
	        //Determine the most repeated word in a file    
	        for(i = 0; i <= words.size(); i++)
	        {    
	            count = 1;    
	            //Count each word in the file and store it in variable count    
	            for(int j = i+1; j < words.size(); j++)
	            {    
	                if(words.get(i).equals(words.get(j)))
	                {    
	                    count++;    
	                }     
	            }    
	            //If maxCount is less than count then store value of count in maxCount     
	            //and corresponding word to variable word    
	            if(count > maxCount)
	            {    
	                maxCount = count;    
	                word = words.get(i);    
	            }    
	        }    
	            
	        System.out.println("Most repeated word: " + word);    
		}
	}


/*		BufferedReader objReader = null;
//ArrayList<String> words = new ArrayList<String>();
strCurrentWord strCurrentWord;
FileReader input = new FileReader("C:\\Users\\HP\\eclipse-workspace\\sample project1\\src\\sample\\package1\\sample.txt");
objReader = new BufferedReader(input);

while ((strCurrentWord = objReader.) != null) {

    System.out.println(strCurrentWord);
    words.add(strCurrentWord);
   }	
 input.read(word);
System.out.println("Reading th file As IS");
System.out.println("----------------------");
System.out.println(word);
System.out.println("----------------------");
	      */