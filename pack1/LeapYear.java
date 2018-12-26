package pack1;
import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		
		leapYear();//leapYear method is called by main method

	}
	public static void leapYear()//method for leapYear
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scan.nextInt();
		int len=String.valueOf(year).length();//inbuilt method which converts value into string and gives the length
		
		if((year%4==0)&&(len==4))//year containing 4 digits and condition for leap year
		{
			System.out.println(year+" is a leap year ");
		}
		else
		{
			System.out.println(year+" is not a leap year ");
		}
	}

}
