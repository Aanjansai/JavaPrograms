package pack2;

import Utility1.Util1;

public class Bubble 
{

	public static void main(String[] args)
	{

		System.out.println("enter m value ");
		int m=Util1.getInt();
		int arr[]=new int[m];
		
		System.out.println("enter the elements to be sorted ");
		for(int loop=0;loop<m;loop++)
		{
			arr[loop]=Util1.getInt();  //elememts to sort
		}
		
		Util1.bubbleSort(arr); //calling bubble sort method 

	}
	
}
