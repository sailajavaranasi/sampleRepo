package sample.package1;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		
		Scanner sn1= new Scanner(System.in);
		
		String sn = sn1.nextLine();  
		String words[]=sn.toString().split(" ");  
		System.out.println("words  "+words.length);
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }
	    System.out.println(reverseWord);
	    sn1.close();
	}

}
