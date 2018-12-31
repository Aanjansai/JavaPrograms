package pack2;
import Utility1.Util1;
public class DayOfWeek
{
/* main method */
	public static void main(String[] args)
	{
		
		System.out.println("Enter the day,month,year values respectively");
		int day = Util1.getInt();
		int month =  Util1.getInt();
		int year =  Util1.getInt();
		Util1.dayOfWeek(day,month,year); //calling dayOfWeek method
		
	
	}
	
}
