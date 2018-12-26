package pack1;
import java.util.Scanner;
public class PrimeFactor 
{

	public static void main(String[] args) //main method
	{
		primeFactor();//main method calling primeFector method

	}
	public static void primeFactor()//method for prime factor
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to be factorized");
		int n=scan.nextInt();
		int i;
		for(i=2;i<n;i++)//number which can be divisible by 1 and itself
		{
			while(n%i==0)
			{
				
				n=n/i;//quotient is generated and stored in n
				System.out.println(i+" ");//divisers(i)
			}
		}
		if(n>=i)
		{
			System.out.println(n);
		}
	}

}
