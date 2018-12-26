package pack1;
import java.util.Scanner;
public class PowerOfTwo
{
//main method
	public static void main(String[] args) 
	{
		powerOfTwo();
	}
	public static void powerOfTwo()
	{
		int base=2;
		double result=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter exponent value");
		int exp=scan.nextInt();
		if((exp<31)&&(exp>0))//exponent value should be less than 31 and*
			                 //*greater than zero
		{
			for(;exp!=0;--exp)//exponent should not equal to zero
				{
				
					for(int i=1;i<=exp;i++)//print the values which are*
						                   //*less than or equal to exponent  
					{
						
						
						result=Math.pow(base, exp);//method to print power value
						
					
					}
			
					System.out.println(result);
				
				}
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
