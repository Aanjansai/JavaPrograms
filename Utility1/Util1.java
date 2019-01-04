package Utility1;
import java.util.Arrays;
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
	
	  /* method for Decimal to binary conversion */
	  public static int decToBin(int n)
		{
		int a;
		String x=""; 
		for(int i=1;i<=n;i++)
		{
			while(n>0)
			{
				a=n%2;
				x=a+""+x;
				n=n/2;
				System.out.println("n= "+n);
				
			}
		
		}
		
			System.out.println("binary value--> "+x);
			return 1;
		}
	  /* end of method */
	  
	  /* Anagram method */
	  public static Object anagramMeth(String s1,String s2)
		{
		  String s3=s1.replaceAll("\\s", "");
		  String s4=s2.replaceAll("\\s", "");
		  boolean status=true;
		  if(s3.length()==s4.length())
		  	{
			  char[] s3Array=s3.toLowerCase().toCharArray();//converts to lower case and to character array
			  char[] s4Array=s4.toLowerCase().toCharArray();
			  Arrays.sort(s3Array); //sorting s3 array
			  Arrays.sort(s4Array); //sorting s4 array
			  status=Arrays.equals(s3Array,s4Array);
		  	}
		  else
		  	{
			  status =false;
		  	}
		  if(status)
		  	{
			  System.out.println("string "+s1+" string "+s2+" are anagram");
		  	}
		  else 
		  	{
			  System.out.println("strings are not anagram ");
		  	}
		  	return status;
		}	
	  /* end of anagram method */
	  
	  /* sum of triplets */
	  public static int threeIntegers(int[] arr) //method to distint triplets
		{
			boolean found=true;
			for(int i=0;i<arr.length-2;i++)
			{
				for(int j=i+1;j<arr.length-1;j++)
				{
					for(int k=j+1;k<arr.length;k++)
					{
						if(arr[i]+arr[j]+arr[k]==0)
						{
							System.out.print(arr[i]);
							System.out.print(" ");
							System.out.print(arr[j]);
							System.out.print(" ");
							System.out.println(arr[k]);
							found=true;
						}
					}
				}
			}
		

	if(found==false)
	{
		System.out.println("not exist ");
	}
	return 0;
	}
	/* end of method */
}
