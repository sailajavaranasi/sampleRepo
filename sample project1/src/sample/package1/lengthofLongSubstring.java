package sample.package1;

import java.util.HashMap;
import java.util.Scanner;

public class lengthofLongSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sn = new Scanner(System.in);
		
		int maxlength = findLength_longestSubstring(sn.next());
		System.out.println("Longest Substring Length = " + maxlength);
		sn.close();
		
		
	}
	static int findLength_longestSubstring(String s){
		
		int maxLength = 0;
		HashMap<Character,Integer> charVisited= new HashMap<>();
		//String substring = "The List :  ";
		for(int  rightChar= 0,leftChar = 0 ; rightChar < s.length();rightChar++)
		{
			char currentChar = s.charAt(rightChar);
			if(charVisited.containsKey(currentChar) && charVisited.get(currentChar) >= leftChar)
			{
				leftChar = charVisited.get(currentChar)+1;
			}
			maxLength = Math.max(maxLength , rightChar - leftChar+1);
			charVisited.put(currentChar, rightChar);
			
		}
		System.out.println(charVisited);
		return maxLength;
	}
	


}
