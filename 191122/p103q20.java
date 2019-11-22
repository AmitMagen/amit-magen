import java.util.*;
public class PythagoramProg
{
	public static Scanner reader=new Scanner (System.in);
	public static void main (String[] args)
	{
		System.out.println ("please enter three numbers");
		int 1=reader.nextInt();
		int 2=reader.nextInt();
		int 3=reader.nextInt();
		if ((1*1+2*2==3*3) || (1*1+3*3==2*2) || (2*2+3*3==1*1))
		{
			System.out.println ("there is a pythagoras");
		}
		else
		{
			System.out.println ("there is not a pythagoras");
		}
	}
}