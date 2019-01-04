package pack1;

import Utility1.Util1;

public class Quadratic 
{

	public static void main(String[] args)
	{
		QuadraticEq();   //calling quadraticeq method

	}
	public static void QuadraticEq() //quadratic method
	{
		System.out.println("enter a,b and c values");
		int a=Util1.getInt();
		int b=Util1.getInt();
		int c=Util1.getInt();
		double delta=(b*b)-4*a*c;  //to find the delta value
		System.out.println("delta value "+delta);
		double root1=(-b + Math.sqrt(delta))/(2*a); //to find root1
		double root2=(-b - Math.sqrt(delta))/(2*a); //to find root2
		System.out.println("root1 of x is "+root1);
		System.out.println("root2 of x ix "+root2);
	}
	
}
