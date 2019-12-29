import jeliot.io.*;
import java.util.Scanner;
//Amit Magen
public class MyClass {
    public static void main() {
        Scanner input=new Scanner (System.in);
        for (int i=1; i<=58; i++)
        {
        	System.out.println ("enter  all of your grades");
        	int Pgrade=input.nextInt();
        	int CSgrade=input.nextInt();
        	int Mgrade=input.nextInt();
        	int average = (Pgrade+CSgrade+Mgrade)/3;
        	if (average>92&&Pgrade>90&&CSgrade>90&&Mgrade>90)
        	{
        		System.out.println ("student "+i+" is on the second level");
        		System.out.println( "his average is "+average);
        	}	
        }
    }
}