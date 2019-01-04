package pack1;
import Utility1.Util1;
public  class RandomNumber
{

	public static void main(String[] args) 
	{
		RandomMeth();

	}
	private static void RandomMeth()
	{
		System.out.println("enter the number of times to flip a coin");
		int n=Util1.getInt();
		float head=0;
		float tail=0;
		
		final double x=Math.random();
		System.out.println(x);
		for(int i=1;i<=n;i++)
		{
			
			if(x<0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
		}
		final double perhead=(head/n)*100;
		final double pertail=(tail/n)*100;
		System.out.println("heads "+head);
		System.out.println("tails "+tail);
		System.out.println("percentage of head "+perhead+"%");
		System.out.println("percentage of tail "+pertail+"%");
	}
}
