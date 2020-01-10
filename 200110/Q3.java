import jeliot.io.*;
import java.util.Scanner;

public class Test200110 {
    public static void main(String[] args) {
    	int n;
    	Scanner scanner = new Scanner(System.in);
    	
    	n=Scanner.nextInt();
    	int i=2;
    	while (i<=n*3){
    		System.out.println(i);
    		i++;
    	}
    }
}
//Answers:
//Section A: The input for which the loop does not exist at all is when n = 0, because when n equals 0. we multiply it by 3 and we get 0, and the variable i equals 2' and 2 is not equal to 0 and not smaller, so the program will not enter the while loop at all.
// Section B: There is no input for which the program will run six times:
//The closest input to this is when n = 2, when it equals 2 if we multiply it by 3 we get 6, and when we get six, the program runs 5 times. If we take a larger input - n = 3 (given that n must be an integer), we multiply n by 3 and we get 9, and then the program will run 8 times, hence it is not possible to preform the request, since no number can be taken between 3 to 2 because n is integer.