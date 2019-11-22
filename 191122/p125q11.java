import java.util.*;
public class AnnualTrip
{
	public static Scanner reader=new Scanner (System.in);
	public static void main (String[] args)
	{
		int numofstudents;
		int numofbuses;
		
		System.out.println ("enter the number of students");
		numofstudents=reader.nextInt();
		if (numofstudents%40==0)
		{
			numofbuses = numofstudents/40;
			System.out.println ("the number of buses that we need is" + numofbuses);
		}
		else
		{
			numofbuses = numofstudents/40;
			numofbuses++;
			System.out.println ("the number of buses we need is" + numofbuses);
		}
	}
}
		