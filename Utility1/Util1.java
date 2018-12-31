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
	
	
		public static void fahreToCel()
		{ 
				System.out.println("enter c value ");
				int c=scan.nextInt();
				int F=(c*9/5)+32; //conversion from cel to fehr
				System.out.println("f--> "+F);
		}
		public static void celToFahre()
		{
				System.out.println("enter f value ");
				int f=scan.nextInt();
				int C=(f-32)*5/9;  //conversion from fehr to cel
				System.out.println("c--> "+C);		
		}
		
	/* end of tempconversion */
	
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
	/* end of bubblesort */
	
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
	  /* end of insertion */
	  
	/* method for DayOfWeek */
	  
	  public static int dayOfWeek(int day,int month,int year)
		{
			
		if((month>=1 && month<=12) && (day>=0 && day<=31))
			{
			// formula of Gregorian calendar
			
				int y=year-(14-month)/12;         
				int x=y+y/4-y/100+y/400;
				int m=month+12*((14-month)/12)-2;
				int d=(day+x+31*m/12)%7;
				System.out.println("day of week "+d);
				switch(d)
				{
					case 0: System.out.println(d+" sunday ");
					        break;
					case 1: System.out.println(d+" monday ");
			        		break;
					case 2: System.out.println(d+" tuesday ");
			        		break;
					case 3: System.out.println(d+" wednesday ");
			        		break;
					case 4: System.out.println(d+" thursday ");
			        		break;
					case 5: System.out.println(d+" friday ");
			        		break;
					case 6: System.out.println(d+" saturday ");
			        		break;
				}
				
				
			}
		else
			{
				System.out.println("enter valid date ");
			}
			return 0;
		}
	  /* end of dayofweek */
	  
	/* method for monthlyPayment */  
	  public static double monthlyPayment(double year,double principal,double rate)
		{
			double payment;
			double n=12*year;
			double r=rate/(12*100);
			double num=(principal*r);
			double deno=(1-(Math.pow(1+r,-n)));
			payment=(num/deno);
			System.out.println("monthly payment "+payment);
			return 0.0;
		}
	  /* end of monthlypayment method */
	
	  /* netwon method */
	  
	  public static double sqrt(double c)
		{
			double t=c;
			double eps= (1e-15);
			while(Math.abs(t-c/t)>eps*t)
			{
				t=(c/t+t)/2.0;
				
			}		
			
		System.out.println("average of t = "+t);
		return 0.0;
		}
	  /* end of newton method */
	
}
