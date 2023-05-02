package sample.package1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		System.out.println("Choose the Arithmetic Operation");
		System.out.println("1. Addition  2. Subtraction 3. Multiplication  4.Division");
		Scanner sn= new Scanner(System.in);
		System.out.println();
		int i = sn.nextInt();
		
		
		if(i== 1 || i == 2 || i ==3 || i== 4)
		{
			System.out.println("Enter the 1st Value");
			int X = sn.nextInt();
			System.out.println("Enter the 2nd Value");
			int Y = sn.nextInt();
			int k ;
			
			switch(i)
			{
				case 1: //Addition
				    k = Sum(X,Y);
				    System.out.println(+X+ " + " +Y+ " = " +k);
				break;
				case 2: //Subtraction
				    if(X < Y)
				    {
				    	
				    	System.err.println("Enter Valid Numbers");
				    }
				    else
				    {
					k = Sub(X,Y);
				    System.out.println(+X+ " - " +Y+ " = " +k);
				    }
				break;
				case 3: //Multiplication
				    k = Mul(X,Y);
				    System.out.println(+X+ " * " +Y+ " = " +k);
				break;
				case 4: //Division
					if(X < Y)
				    {
				    	//System.out.println(+X+ "value cannot not be smaller than" +Y);
						System.err.println("Enter Valid Numbers");
				    }
				    else
				    {
				    	float div = Div(X,Y);
				    System.out.println(+X+ " / " +Y+ " = " +div);
				    }
				break;
				default:
			}
			sn.close();
		}
		else
		{
			System.err.println("Invalid Input");
		}
		
			
		}
		catch(InputMismatchException e)
		{
			System.err.println(
                    "InputMismatchException occurred");
		}
		
	}

//	}

private static int Sum(int X, int Y)
{
	return X + Y;
	
}
private static int Sub(int X, int Y)
{
	return X - Y;
	
}
private static int Mul(int X, int Y)
{
	return X * Y;
	
}
private static float Div(int X, int Y)
{
	return X / Y;
	
}
}

