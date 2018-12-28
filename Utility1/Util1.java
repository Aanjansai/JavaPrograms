package Utility1;
import java.util.Scanner;
public class Util1 
{

	static Scanner scan=new Scanner(System.in);
	public static String getString()
	{
		String stringvalue=scan.nextLine();
		return stringvalue;
	}
	public static int getInt()
	{
		int intvalue=scan.nextInt();
		return intvalue;
	}
	public static double getDouble()
	{
		double doublevalue=scan.nextDouble();
		return doublevalue;
	}
	public static float getFloat()
	{
		float floatvalue=scan.nextFloat();
		return floatvalue;
	}
	
	/*TempConversion Method*/
	
	public static void temperatureConversion(int c1)
	{
		int F=(c1*9/5)+32; //conversion from cel to fehr
		int C=(F-32)*5/9;  //conversion from fehr to cel
		System.out.println("f--> "+F);
		System.out.println("c--> "+C);
	}
	
	/*BubbleSort method*/
	
	public static void bubbleSort(int arr[]) //bubble sort method 
	{
		int temp;
		for(int i=1;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-2;j++)
			{
			/* use to swap the elements in increment order*/
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];       
					arr[j]=arr[j+1];    
					arr[j+1]=temp;
	
				}
			
		    }
		}	
		System.out.println("the sorted array ");
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+" "); //to print the sorted array
		}
		
	}
	
	/*InsertionSort method*/
	
	  public static void sort( int arr[] )
	    {
	        int N = arr.length;

	        int i, j, temp;

	        for (i = 1; i< N; i++) 
	        {
	            j = i;

	            temp = arr[i];    

	            while (j > 0 && temp < arr[j-1])
	            {

	                arr[j] = arr[j-1];

	                j = j-1;

	            }
	            arr[j] = temp;            
	        }        

	    }    



}
