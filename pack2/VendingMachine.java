package pack2;

import Utility1.Util1;

/* vendingMachine */

public class VendingMachine 
{
	static int index,total;
	static int[] note= {1000,500,100,50,10,5,2,1};

	public static void main(String[] args)
	{
		try
		{
		System.out.println("enter the amount ");
		int value=Util1.getInt();
		note(value); //calling note method
		}
		catch(Exception e)
		{
			System.out.println("enter integer value ");
		}

	}
	public static void note(int value) //method to print the notes
	{
		if(value/note[index]!=0)
		{
			/* logic to print number of notes repeated */
			
			total=total+(value/note[index]);
			System.out.println(note[index]+" rs notes "+value/note[index]);
			value=value%note[index];
		}
		index++;
		if(value==0)
		{
			System.out.println("total notes "+total);
			return;
		}
		note(value); //recursion method
	}

}
