package pack1;

import Utility1.Util1;

public class EuclideanDistance //equlid formula dist((x,y),(0,0))=sqrt((x*x)+(y*y))
{

	public static void main(String[] args) 
	{
		System.out.println("enter x and y values ");
		double x=Util1.getDouble();
		double y=Util1.getDouble();
		double powx=Math.pow(x, 2); //to find the power of x
		double powy=Math.pow(y, 2); //to find the power of y
		double powOfxAndy=powx+powy; //adding powers of x and y
		double distance;
		distance=Math.sqrt(powOfxAndy); //find the square root of x and y powers
		System.out.println("Ecluid distance "+distance);

	}

}
