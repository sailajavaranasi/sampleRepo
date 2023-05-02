package sample.package1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Comparator;

public class LinkedListRemoveDuplicates {

//	Algorithm:
//
//		Traverse from head node.
//		Compare the current node with its next node.
//		If the data of the next node is same as current nodes data, then delete the next node.
//		Update current nodes next pointer to next nodes next value.
	static LinkedList<Integer> llist = new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter the List Count");
		int listCount = myInput.nextInt();
		for(int i =0 ; i<listCount; i++)
		{
			System.out.println("Enter the List Number");
	        llist.add(myInput.nextInt());

		}
		System.out.println("List before removal of duplicates"+llist);
		
		remove_Duplicates();
		sort_list();
		
		myInput.close();
	}

      private static void sort_list()
      {
		// TODO Auto-generated method stub
		llist.sort(Comparator.naturalOrder());
		System.out.println("List after Sorting"+llist);

      }

	private static void remove_Duplicates() {
    	  // TODO Auto-generated method stub
    	  for(int i=0;i<llist.size();i++)
    	  {
    		for(int j = i+1; j<llist.size();j++)
    		{
    			if(llist.get(i) == llist.get(j))
    			{
    				llist.remove(j);
    			}
    				
    		}
    	  }
    	  System.out.println("List after removal of duplicates"+llist);
	   
      }

}
