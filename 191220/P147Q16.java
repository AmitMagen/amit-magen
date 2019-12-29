import jeliot.io.*;
import java.util.*;
//Amit Magen
public class MyClass 
{ 
 	static Scanner reader = new Scanner (System.in);
 	public static void main (String[] args)
 	{
 		int i, num1,num;
 		String a="";
 		System.out.println ("put in the temp of the first day");
 		num1=reader.nextInt();
 		for (i=2;i<=7;i++)
 		{
 			System.out.println	("insert another temp");
 			num=reader.nextInt();
 			if (num>num1)
 			{
 			a=a+i+" , ";
 			System.out.println(i);
 		}
 		num=num1;
 	}
 		System.out.println(a);
 	}
 }