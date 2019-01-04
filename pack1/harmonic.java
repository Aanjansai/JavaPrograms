package pack1;
import java.util.Scanner;
public class harmonic 
{
	public static void main(String[] args)//main method
	{
	harmonicMeth();
	}
	
	public static void harmonicMeth()//Method for harmonic series
	{
		
		double sum=0.0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		if(n!=0)//n value should be greater than zero
		{
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);//logic for Harmonic number
			
			}
			System.out.println("harmonic value of a number is "+sum);
		}
		
		
	}
	
}

