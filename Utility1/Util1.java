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
	
}
