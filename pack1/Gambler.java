package pack1;
import Utility1.Util1;
public class Gambler 
{

	public static void main(String[] args)
	{
		getGambler(); //calling getGambler method

	}
	public static void getGambler() //gambler method
	{
		System.out.println("enter the stake value");
		int stake=Util1.getInt();
		System.out.println("enter the goals");
		int goals=Util1.getInt();
		System.out.println("enter the trails");
		int trails=Util1.getInt();
		int bet=0;
	    int win=0;
	    int loss=0;
		for(int i=1;i<=trails;i++)
		{
			int cash=stake; //initlize cash equals to stack
			while((cash>0) && (cash<goals))
			{
				bet++;
				if(Math.random()<0.5) //random method to generate random number
					cash++; //increment cash
				else
					cash--; //decrement cash
			}
			if(cash==goals) //cash is equals to goals
			{
				win++; //increment win
			}
			else
			{
				loss++; //incrememt loss
			}
		}
		System.out.println("wins "+win+" trials");
		System.out.println("percentage of wins "+(win/trails)*100.0+"%");
		System.out.println("percentage of loss "+(loss/trails)*100.0+"%");
	}

}
