package pack1;

import Utility1.Util1;

public class WindChill 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the temperature for windchill ");
		double t=Util1.getDouble();
		System.out.println("enter the speed for windchill ");
		double v=Util1.getDouble();
		if((t>50) || (v>120) || (v<3)) //condition
		{
			System.out.println("it's not possible ");
		}
		else
		{
			/* formula to calculate wind chill */
			double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("The value of wind chill is "+w);
		}
		

	}

}
