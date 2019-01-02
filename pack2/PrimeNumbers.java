package pack2;

/*prime numbers 0 to 1000 */

public class PrimeNumbers
{
	public static void main(String[] args) 
	{
	
		for(int n=0;n<1000;n++)
		{
		int status=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				status=1;
				break;
			}
			
		}
		if(status==0)
			{
				System.out.println(n+" is a prime number ");
			}
		}
		
	}

}
