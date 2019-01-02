package pack2;
import Utility1.Util1;
public class Anagram 
{

	public static void main(String[] args)
	{
		System.out.println("enter string s1");
		String s1=Util1.getString();
		System.out.println("enter string s2");
		String s2=Util1.getString();
		Util1.anagramMeth(s1,s2);
	}

}
