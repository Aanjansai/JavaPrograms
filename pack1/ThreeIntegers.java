package pack1;

import Utility1.Util1;

public class ThreeIntegers 
{
 // main method
	public static void main(String[] args)
	{
		System.out.println("enter the value of n ");
		int n=Util1.getInt();
		int[] arr= new int[n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Util1.getInt();
		}
		Util1.threeIntegers( arr); //calling triplets method
	}
	
}
