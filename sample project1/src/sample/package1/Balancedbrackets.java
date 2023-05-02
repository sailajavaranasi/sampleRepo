package sample.package1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Balancedbrackets {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter Balanced Brackets to Check");
		Scanner S1 = new Scanner(System.in);
		System.out.println();

		String str = S1.next();	
		
		Deque<Character> deque = new LinkedList<>();
		for (char ch: str.toCharArray()) 
		{
		    if (ch == '{' || ch == '[' || ch == '(')
		    {
		        deque.addFirst(ch);
		    } else 
		    {
		        if (!deque.isEmpty()
		            && ((deque.peekFirst() == '{' && ch == '}')
		            || (deque.peekFirst() == '[' && ch == ']')
		            || (deque.peekFirst() == '(' && ch == ')'))) 
		        {
		            deque.removeFirst();
		        } 
		    }
		}  
		    
		    if (deque.isEmpty())
		    	System.out.println("Balanced Brackets True");
		    else
		    	 System.out.println("Balanced Brackets False");
		    S1.close();
		}

}
