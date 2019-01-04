package pack2;

import Utility1.Util1;

public class Binary 
{

	public static void main(String[] args)
	{
		System.out.println("enter the decimal number ");
		int n=Util1.getInt();
		Util1.decToBin( n);
	}	
		public static int decToBin(int n)
		{
		int a;
		int temp;
		String x=""; 
		for(int i=1;i<=n;i++)
		{
			while(n>0)
			{
				a=n%2;
				x=a+""+x;
				n=n/2;
				System.out.println("n= "+n);
				
			}
		
		}
		
			System.out.println("binary value--> ");
			
			System.out.println(x+"");
			return 1;                                                                                  
		}

	

}
