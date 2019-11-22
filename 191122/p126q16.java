import java.util.*;
public class MatchingPair
{
	public static Scanner reader=new Scanner (System.in);
	public static void main (String[] args)
	{
		int num, dozens, unity ;
		System.out.println("enter a two digit number");
		num=reader.nextInt();
		dozens=num/10;
		unity=num%10;
		if ((dozens%2==0) && (unity%2==0))
		{
			System.out.println("the two numbers are matched");
		}
		else
		{
			System.out.println("the two numbers are not matched");
		}
	}
}