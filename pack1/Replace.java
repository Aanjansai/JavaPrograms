package pack1;
import java.util.Scanner;
public class Replace 
{

	public static void main(String[] args)
	{
		String s1="hello username, how are you?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to replace");
		String s2=scan.next();
		if(s2.length()>=3)
		{
			System.out.println(s1.replace("username",s2));//replace string method to replace username with s2(string)
		}
		else
		{
			System.out.println("enter valid username");
		}
		
	}

}
