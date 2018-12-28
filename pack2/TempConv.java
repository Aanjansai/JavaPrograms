package pack2;

import Utility1.Util1;

public class TempConv
{

	public static void main(String[] args) 
	{
		System.out.println("enter c value ");
		int c1=Util1.getInt();
		Util1.temperatureConversion(c1);	//tempconversion is called from utility pacakage
	}

}
