package pack1;

import Utility1.Util1;

public class TwoDarray 
{

	public static void main(String[] args) //main method
	{
		System.out.println("enter row value");
		int m=Util1.getInt(); //row values
		System.out.println("enter column value");
		int n=Util1.getInt(); //column values
		Object arr[][]=new Object[m][n]; //universal datatype(Object)
		System.out.println("1.integer,2.double,3.boolean");
		System.out.println("enter your choice");
		int choice=Util1.getInt();
		System.out.println("enter "+m*n+" values");
		switch(choice) //switch statement
		{
		case 1:	for(int i=0;i<m;i++)  
			  	{
					for(int j=0;j<n;j++)
					{
						arr[i][j]=Util1.getInt(); //for integer values
					}
			  	}
		        break;
		case 2: for(int i=0;i<m;i++)
	  			{
					for(int j=0;j<n;j++)
					{
						arr[i][j]=Util1.getDouble(); //for double values
					}
	  			}
				break;
		case 3: for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						arr[i][j]=true; //for boolean values
					}
				}
				break;
		}
		System.out.println("the array is: ");
		for(int i=0;i<m;i++)
		{
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[i][k]+" "); //To print final 2D array
			}
			System.out.println();
		}	
		
	}

}
