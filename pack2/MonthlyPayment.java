package pack2;

import Utility1.Util1;

public class MonthlyPayment
{
/* main method */
	
	public static void main(String[] args) 
	{
		
		System.out.println("enter the year,principal and rate ");
		double year=Util1.getInt();
		
		double principal=Util1.getInt();
		
		double rate=Util1.getInt();
		Util1.monthlyPayment(year,principal,rate); //calling monthly payment method
	}
	
}
