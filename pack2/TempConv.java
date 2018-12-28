package pack2;

import Utility1.Util1;

public class TempConv
{

	public static void main(String[] args) 
	{
		System.out.println("1-->fahre, 2-->cel ");
		System.out.println("enter your choice ");
		int choice=Util1.getInt();
		switch(choice)
		{
			case 1: /* convertion from cel to fahre */
			        Util1.celToFahre();
			        break;
			case 2: /* convertion from fahre to cel */
			        Util1.fahreToCel();
			        break;
		}
		
	}

}
